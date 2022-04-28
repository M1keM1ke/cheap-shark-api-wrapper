package ru.m1kem1ke.cheapshark.api.wrapper.dto.deals.response;

import java.util.List;

public class DealLookupDto {
    public GameInfoDto gameInfo;
    public List<Object> cheaperStores;
    public CheapestPriceDto cheapestPrice;

    public GameInfoDto getGameInfo() {
        return gameInfo;
    }

    public void setGameInfo(GameInfoDto gameInfo) {
        this.gameInfo = gameInfo;
    }

    public List<Object> getCheaperStores() {
        return cheaperStores;
    }

    public void setCheaperStores(List<Object> cheaperStores) {
        this.cheaperStores = cheaperStores;
    }

    public CheapestPriceDto getCheapestPrice() {
        return cheapestPrice;
    }

    public void setCheapestPrice(CheapestPriceDto cheapestPrice) {
        this.cheapestPrice = cheapestPrice;
    }
}
