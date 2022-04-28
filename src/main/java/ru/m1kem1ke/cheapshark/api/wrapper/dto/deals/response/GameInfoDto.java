package ru.m1kem1ke.cheapshark.api.wrapper.dto.deals.response;

public class GameInfoDto {
    private String storeID;
    private String gameID;
    private String name;
    private String steamAppID;
    private String salePrice;
    private String retailPrice;
    private String steamRatingText;
    private String steamRatingPercent;
    private String steamRatingCount;
    private String metacriticScore;
    private String metacriticLink;
    private int releaseDate;
    private String publisher;
    private String steamworks;
    private String thumb;

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSteamAppID() {
        return steamAppID;
    }

    public void setSteamAppID(String steamAppID) {
        this.steamAppID = steamAppID;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getSteamRatingText() {
        return steamRatingText;
    }

    public void setSteamRatingText(String steamRatingText) {
        this.steamRatingText = steamRatingText;
    }

    public String getSteamRatingPercent() {
        return steamRatingPercent;
    }

    public void setSteamRatingPercent(String steamRatingPercent) {
        this.steamRatingPercent = steamRatingPercent;
    }

    public String getSteamRatingCount() {
        return steamRatingCount;
    }

    public void setSteamRatingCount(String steamRatingCount) {
        this.steamRatingCount = steamRatingCount;
    }

    public String getMetacriticScore() {
        return metacriticScore;
    }

    public void setMetacriticScore(String metacriticScore) {
        this.metacriticScore = metacriticScore;
    }

    public String getMetacriticLink() {
        return metacriticLink;
    }

    public void setMetacriticLink(String metacriticLink) {
        this.metacriticLink = metacriticLink;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSteamworks() {
        return steamworks;
    }

    public void setSteamworks(String steamworks) {
        this.steamworks = steamworks;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
