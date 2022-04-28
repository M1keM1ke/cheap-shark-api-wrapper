package ru.m1kem1ke.cheapshark.api.wrapper.dto.games.response;

public class CheapestPriceEverDto {
    private String price;
    private int date;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
