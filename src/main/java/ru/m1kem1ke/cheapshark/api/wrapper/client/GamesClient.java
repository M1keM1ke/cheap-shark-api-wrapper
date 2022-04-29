package ru.m1kem1ke.cheapshark.api.wrapper.client;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.games.response.GameLookupDto;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.games.response.ListOfGamesDto;

import java.util.List;
import java.util.Map;

public interface GamesClient {
    String BASE_PATH = "games";

    @GET(BASE_PATH)
    Call<List<ListOfGamesDto>> listOfGames(@QueryMap Map<String, String> request);

    @GET(BASE_PATH)
    Call<GameLookupDto> gameLookup(@Query("id") String id);

    @GET(BASE_PATH)
    Call<Map<String, GameLookupDto>> multipleGameLookup(@Query("ids") String ids);
}
