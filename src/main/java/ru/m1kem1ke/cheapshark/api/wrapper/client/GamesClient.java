package ru.m1kem1ke.cheapshark.api.wrapper.client;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.games.request.ListOfGamesRequestDto;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.games.response.GameLookupDto;
import ru.m1kem1ke.cheapshark.api.wrapper.dto.games.response.ListOfGamesDto;

import java.util.List;
import java.util.Map;

public interface GamesClient {
    String BASE_PATH = "games";

    @GET(BASE_PATH)
    List<ListOfGamesDto> listOfGames(@Body ListOfGamesRequestDto request);

    @GET(BASE_PATH)
    GameLookupDto gameLookup(@Query("id") String id);

    @GET(BASE_PATH)
    Map<String, GameLookupDto> multipleGameLookup(@Query("ids") String ids);
}
