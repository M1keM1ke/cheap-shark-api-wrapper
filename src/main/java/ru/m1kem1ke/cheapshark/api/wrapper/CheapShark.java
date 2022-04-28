package ru.m1kem1ke.cheapshark.api.wrapper;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import ru.m1kem1ke.cheapshark.api.wrapper.client.AlertsClient;
import ru.m1kem1ke.cheapshark.api.wrapper.client.DealsClient;
import ru.m1kem1ke.cheapshark.api.wrapper.client.GamesClient;
import ru.m1kem1ke.cheapshark.api.wrapper.client.StoresClient;

public class CheapShark {
    private Retrofit retrofit;

    private Retrofit retrofitBuilder() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.cheapshark.com/api/1.0/")
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    private Retrofit getRetrofit() {
        if (this.retrofit == null) {
            this.retrofit = this.retrofitBuilder();
        }
        return retrofit;
    }

    public AlertsClient alertsClient() {
        return this.getRetrofit().create(AlertsClient.class);
    }

    public DealsClient dealsClient() {
        return this.getRetrofit().create(DealsClient.class);
    }

    public GamesClient gamesClient() {
        return this.getRetrofit().create(GamesClient.class);
    }

    public StoresClient storesClient() {
        return this.getRetrofit().create(StoresClient.class);
    }

}
