package ru.m1kem1ke.cheapshark.api.wrapper.client;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.deals.request.ListOfDealsRequestDto;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.deals.response.DealLookupDto;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.deals.response.ListOfDealsDto;

public interface DealsClient {
    String BASE_PATH = "deals";

    @GET(BASE_PATH)
    ListOfDealsDto listOfDeals(@Body ListOfDealsRequestDto request);

    @GET(BASE_PATH)
    DealLookupDto dealLookup(@Query("id") String id);
}
