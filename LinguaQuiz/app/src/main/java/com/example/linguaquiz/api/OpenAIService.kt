package com.example.linguaquiz.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface OpenAIService {
    @POST("v1/chat/completions")
    fun getChatCompletion(
        @Header("Authorization") apiKey: String,
        @Body request: ChatRequest
    ): Call<ChatResponse>
}
