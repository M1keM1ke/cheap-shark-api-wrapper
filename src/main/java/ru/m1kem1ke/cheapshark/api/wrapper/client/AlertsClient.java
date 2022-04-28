package ru.m1kem1ke.cheapshark.api.wrapper.client;

import retrofit2.http.Body;
import retrofit2.http.GET;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.alerts.request.EditAlertRequestDto;

public interface AlertsClient {
    String BASE_PATH = "deals";

    @GET(BASE_PATH)
    String editAlert(@Body EditAlertRequestDto request);

    @GET(BASE_PATH)
    String manageAlerts();
}
