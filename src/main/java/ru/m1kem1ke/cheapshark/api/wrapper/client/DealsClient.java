package ru.m1kem1ke.cheapshark.api.wrapper.client;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.deals.response.DealLookupDto;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.deals.response.ListOfDealsDto;

import java.util.List;
import java.util.Map;

public interface DealsClient {
    String BASE_PATH = "deals";

    @GET(BASE_PATH)
    Call<List<ListOfDealsDto>> listOfDeals(@QueryMap Map<String, String> request);

    @GET(BASE_PATH)
    Call<DealLookupDto> dealLookup(@Query(value = "id", encoded = true) String id);
}
