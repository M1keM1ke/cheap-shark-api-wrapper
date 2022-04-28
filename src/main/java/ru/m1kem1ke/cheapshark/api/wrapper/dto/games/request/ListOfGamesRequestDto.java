package ru.m1kem1ke.cheapshark.api.wrapper.dto.games.request;

public class ListOfGamesRequestDto {
    String title;
    String steamAppID;
    String limit;
    String exact;

    public ListOfGamesRequestDto() {}

    private ListOfGamesRequestDto(ListOfGamesRequestDtoBuilder builder) {
        this.title = builder.title;
        this.steamAppID = builder.steamAppID;
        this.limit = builder.limit;
        this.exact = builder.exact;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSteamAppID() {
        return steamAppID;
    }

    public void setSteamAppID(String steamAppID) {
        this.steamAppID = steamAppID;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getExact() {
        return exact;
    }

    public void setExact(String exact) {
        this.exact = exact;
    }

    public static ListOfGamesRequestDtoBuilder builder() {
        return new ListOfGamesRequestDtoBuilder();
    }

    public static class ListOfGamesRequestDtoBuilder {
        String title;
        String steamAppID;
        String limit;
        String exact;

        public String getTitle() {
            return title;
        }

        public ListOfGamesRequestDtoBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public String getSteamAppID() {
            return steamAppID;
        }

        public ListOfGamesRequestDtoBuilder setSteamAppID(String steamAppID) {
            this.steamAppID = steamAppID;
            return this;
        }

        public String getLimit() {
            return limit;
        }

        public ListOfGamesRequestDtoBuilder setLimit(String limit) {
            this.limit = limit;
            return this;
        }

        public String getExact() {
            return exact;
        }

        public ListOfGamesRequestDtoBuilder setExact(String exact) {
            this.exact = exact;
            return this;
        }

        public ListOfGamesRequestDto build() {
            return new ListOfGamesRequestDto(this);
        }
    }
}
