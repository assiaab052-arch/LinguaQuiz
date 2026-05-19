package com.example.linguaquiz;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GeminiService {
    /**
     * Utilisation du point d'entrée v1beta pour le modèle gemini-1.5-flash.
     * C'est l'URL correcte pour éviter l'erreur 404.
     */
    @POST("v1beta/models/gemini-1.5-flash:generateContent")
    Call<GeminiResponse> generateContent(
            @Query("key") String apiKey,
            @Body GeminiRequest request
    );
}
