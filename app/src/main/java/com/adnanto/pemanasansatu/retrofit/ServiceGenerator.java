package com.adnanto.pemanasansatu.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by adnanto on 8/30/16.
 */
public class ServiceGenerator {
    private static final String API_BASE_URL = "http://hangga.web.id/";

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(new OkHttpClient());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit adapter = builder.build();
        return adapter.create(serviceClass);
    }
}
