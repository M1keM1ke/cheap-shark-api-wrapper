package ru.m1kem1ke.cheapshark.api.wrapper.dto.deals.response;

import java.util.List;

public class DealLookupDto {
    private GameInfoDto gameInfo;
    private List<CheaperStoreDto> cheaperStores;
    private CheapestPriceDto cheapestPrice;

    public GameInfoDto getGameInfo() {
        return gameInfo;
    }

    public void setGameInfo(GameInfoDto gameInfo) {
        this.gameInfo = gameInfo;
    }

    public List<CheaperStoreDto> getCheaperStores() {
        return cheaperStores;
    }

    public void setCheaperStores(List<CheaperStoreDto> cheaperStores) {
        this.cheaperStores = cheaperStores;
    }

    public CheapestPriceDto getCheapestPrice() {
        return cheapestPrice;
    }

    public void setCheapestPrice(CheapestPriceDto cheapestPrice) {
        this.cheapestPrice = cheapestPrice;
    }
}
