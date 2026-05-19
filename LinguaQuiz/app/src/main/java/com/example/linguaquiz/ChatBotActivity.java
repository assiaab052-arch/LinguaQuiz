package com.example.linguaquiz;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.speech.RecognizerIntent;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.linguaquiz.databinding.ActivityChatBotBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ChatBotActivity extends AppCompatActivity {

    private ActivityChatBotBinding binding;

    private ChatAdapter adapter;

    private List<ChatMessage> chatMessages;

    private GeminiService geminiService;

    // METS TA CLE GEMINI
    private static final String API_KEY =
            "AIzaSyDOTETUXwof0bVrNQ8AqNwXOiBaPpNxndM";

    // MICRO
    private final ActivityResultLauncher<Intent> voiceInputLauncher =
            registerForActivityResult(
                    new ActivityResultContracts.StartActivityForResult(),
                    result -> {

                        if (result.getResultCode() == RESULT_OK
                                && result.getData() != null) {

                            ArrayList<String> voiceResult =
                                    result.getData()
                                            .getStringArrayListExtra(
                                                    RecognizerIntent.EXTRA_RESULTS
                                            );

                            if (voiceResult != null
                                    && !voiceResult.isEmpty()) {

                                binding.etMessage.setText(
                                        voiceResult.get(0)
                                );
                            }
                        }
                    });

    private final ActivityResultLauncher<String>
            requestPermissionLauncher =
            registerForActivityResult(
                    new ActivityResultContracts.RequestPermission(),
                    isGranted -> {

                        if (isGranted) {

                            startVoiceInput();
                        }
                    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding =
                ActivityChatBotBinding.inflate(
                        getLayoutInflater()
                );

        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setTitle(
                    "LinguaChat AI"
            );

            getSupportActionBar()
                    .setDisplayHomeAsUpEnabled(true);
        }

        chatMessages = new ArrayList<>();

        adapter = new ChatAdapter(chatMessages);

        binding.rvChat.setLayoutManager(
                new LinearLayoutManager(this)
        );

        binding.rvChat.setAdapter(adapter);

        initRetrofit();

        // ENVOYER MESSAGE
        binding.btnSend.setOnClickListener(v -> {

            String text =
                    binding.etMessage
                            .getText()
                            .toString()
                            .trim();

            if (!text.isEmpty()) {

                handleUserQuery(text);

                binding.etMessage.setText("");
            }
        });

        // MICRO
        binding.btnMic.setOnClickListener(v -> {

            checkAudioPermission();
        });

        addMessage(
                "Bonjour 👋 Je suis votre assistant IA LinguaQuiz.",
                false
        );
    }

    private void initRetrofit() {

        Retrofit retrofit =
                new Retrofit.Builder()
                        .baseUrl(
                                "https://generativelanguage.googleapis.com/"
                        )
                        .addConverterFactory(
                                GsonConverterFactory.create()
                        )
                        .build();

        geminiService =
                retrofit.create(GeminiService.class);
    }

    private void handleUserQuery(String text) {

        addMessage(text, true);

        binding.btnSend.setEnabled(false);

        List<GeminiRequest.Part> parts =
                new ArrayList<>();

        parts.add(
                new GeminiRequest.Part(text)
        );

        List<GeminiRequest.Content> contents =
                new ArrayList<>();

        contents.add(
                new GeminiRequest.Content(parts)
        );

        GeminiRequest request =
                new GeminiRequest(contents);

        geminiService.generateContent(
                API_KEY,
                request
        ).enqueue(new Callback<GeminiResponse>() {

            @Override
            public void onResponse(
                    @NonNull Call<GeminiResponse> call,
                    @NonNull Response<GeminiResponse> response
            ) {

                binding.btnSend.setEnabled(true);

                if (response.isSuccessful()
                        && response.body() != null
                        && response.body().getCandidates() != null
                        && !response.body()
                        .getCandidates()
                        .isEmpty()) {

                    String aiResponse =
                            response.body()
                                    .getCandidates()
                                    .get(0)
                                    .getContent()
                                    .getParts()
                                    .get(0)
                                    .getText();

                    addMessage(aiResponse, false);

                } else {

                    addMessage(
                            "Erreur Gemini API : "
                                    + response.code(),
                            false
                    );
                }
            }

            @Override
            public void onFailure(
                    @NonNull Call<GeminiResponse> call,
                    @NonNull Throwable t
            ) {

                binding.btnSend.setEnabled(true);

                addMessage(
                        "Erreur : "
                                + t.getMessage(),
                        false
                );
            }
        });
    }

    private void addMessage(
            String content,
            boolean isUser
    ) {

        chatMessages.add(
                new ChatMessage(content, isUser)
        );

        adapter.notifyItemInserted(
                chatMessages.size() - 1
        );

        binding.rvChat.smoothScrollToPosition(
                chatMessages.size() - 1
        );
    }

    // MICRO
    private void checkAudioPermission() {

        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.RECORD_AUDIO
        ) == PackageManager.PERMISSION_GRANTED) {

            startVoiceInput();

        } else {

            requestPermissionLauncher.launch(
                    Manifest.permission.RECORD_AUDIO
            );
        }
    }

    private void startVoiceInput() {

        Intent intent =
                new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH
                );

        intent.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
        );

        intent.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE,
                Locale.getDefault()
        );

        intent.putExtra(
                RecognizerIntent.EXTRA_PROMPT,
                "Parlez maintenant..."
        );

        try {

            voiceInputLauncher.launch(intent);

        } catch (Exception e) {

            addMessage(
                    "Micro non supporté",
                    false
            );
        }
    }

    @Override
    public boolean onSupportNavigateUp() {

        getOnBackPressedDispatcher().onBackPressed();

        return true;
    }
}