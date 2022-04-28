package ru.m1kem1ke.cheapshark.api.wrapper.dto.games.response;

import java.util.List;

public class GameLookupDto {
    private List<GameLookupDealDto> deals;
    private InfoDto info;
    private CheapestPriceEverDto cheapestPriceEver;

    public List<GameLookupDealDto> getDeals() {
        return deals;
    }

    public void setDeals(List<GameLookupDealDto> deals) {
        this.deals = deals;
    }

    public InfoDto getInfo() {
        return info;
    }

    public void setInfo(InfoDto info) {
        this.info = info;
    }

    public CheapestPriceEverDto getCheapestPriceEver() {
        return cheapestPriceEver;
    }

    public void setCheapestPriceEver(CheapestPriceEverDto cheapestPriceEver) {
        this.cheapestPriceEver = cheapestPriceEver;
    }
}
