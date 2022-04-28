package ru.m1kem1ke.cheapshark.api.wrapper.client;

import retrofit2.Call;
import retrofit2.http.GET;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.stores.response.StoreDto;

import java.util.List;

public interface StoresClient {
    String BASE_PATH = "stores";

    @GET(BASE_PATH)
    Call<List<StoreDto>> storesInfo();
}
