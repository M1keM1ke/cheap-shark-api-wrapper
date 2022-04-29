package ru.m1kem1ke.cheapshark.api.wrapper.client;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface AlertsClient {
    String BASE_PATH = "alerts";

    @GET(BASE_PATH)
    Call<String> editAlert(@QueryMap(encoded = true) Map<String, String> request);

    @GET(BASE_PATH)
    Call<String> manageAlerts(@QueryMap(encoded = true) Map<String, String> request);
}
