package ru.m1kem1ke.cheapshark.api.wrapper.dto.deals.request;

public class ListOfDealsRequestDto {
    private String storeID;
    private int pageNumber;
    private int pageSize;
    private String sortBy;
    private Boolean desc;
    private int lowerPrice;
    private int upperPrice;
    private int metacritic;
    private int steamRating;
    private String steamAppID;
    private String title;
    private Boolean exact;
    private Boolean AAA;
    private Boolean steamworks;
    private Boolean onSale;
    private String output;

    public ListOfDealsRequestDto() {}

    public ListOfDealsRequestDto(ListOfDealsRequestDtoBuilder builder) {
        this.storeID = builder.storeID;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.desc = builder.desc;
        this.lowerPrice = builder.lowerPrice;
        this.upperPrice = builder.upperPrice;
        this.metacritic = builder.metacritic;
        this.steamRating = builder.steamRating;
        this.steamAppID = builder.steamAppID;
        this.title = builder.title;
        this.exact = builder.exact;
        this.AAA = builder.AAA;
        this.steamworks = builder.steamworks;
        this.onSale = builder.onSale;
        this.output = builder.output;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public Boolean getDesc() {
        return desc;
    }

    public void setDesc(Boolean desc) {
        this.desc = desc;
    }

    public int getLowerPrice() {
        return lowerPrice;
    }

    public void setLowerPrice(int lowerPrice) {
        this.lowerPrice = lowerPrice;
    }

    public int getUpperPrice() {
        return upperPrice;
    }

    public void setUpperPrice(int upperPrice) {
        this.upperPrice = upperPrice;
    }

    public int getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(int metacritic) {
        this.metacritic = metacritic;
    }

    public int getSteamRating() {
        return steamRating;
    }

    public void setSteamRating(int steamRating) {
        this.steamRating = steamRating;
    }

    public String getSteamAppID() {
        return steamAppID;
    }

    public void setSteamAppID(String steamAppID) {
        this.steamAppID = steamAppID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getExact() {
        return exact;
    }

    public void setExact(Boolean exact) {
        this.exact = exact;
    }

    public Boolean getAAA() {
        return AAA;
    }

    public void setAAA(Boolean AAA) {
        this.AAA = AAA;
    }

    public Boolean getSteamworks() {
        return steamworks;
    }

    public void setSteamworks(Boolean steamworks) {
        this.steamworks = steamworks;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public static ListOfDealsRequestDtoBuilder builder() {
        return new ListOfDealsRequestDtoBuilder();
    }

    public static class ListOfDealsRequestDtoBuilder {
        private String storeID;
        private int pageNumber;
        private int pageSize;
        private String sortBy;
        private Boolean desc;
        private int lowerPrice;
        private int upperPrice;
        private int metacritic;
        private int steamRating;
        private String steamAppID;
        private String title;
        private Boolean exact;
        private Boolean AAA;
        private Boolean steamworks;
        private Boolean onSale;
        private String output;

        public String getStoreID() {
            return storeID;
        }

        public ListOfDealsRequestDtoBuilder setStoreID(String storeID) {
            this.storeID = storeID;
            return this;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public ListOfDealsRequestDtoBuilder setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public int getPageSize() {
            return pageSize;
        }

        public ListOfDealsRequestDtoBuilder setPageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public String getSortBy() {
            return sortBy;
        }

        public ListOfDealsRequestDtoBuilder setSortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        public Boolean getDesc() {
            return desc;
        }

        public ListOfDealsRequestDtoBuilder setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }

        public int getLowerPrice() {
            return lowerPrice;
        }

        public ListOfDealsRequestDtoBuilder setLowerPrice(int lowerPrice) {
            this.lowerPrice = lowerPrice;
            return this;
        }

        public int getUpperPrice() {
            return upperPrice;
        }

        public ListOfDealsRequestDtoBuilder setUpperPrice(int upperPrice) {
            this.upperPrice = upperPrice;
            return this;
        }

        public int getMetacritic() {
            return metacritic;
        }

        public ListOfDealsRequestDtoBuilder setMetacritic(int metacritic) {
            this.metacritic = metacritic;
            return this;
        }

        public int getSteamRating() {
            return steamRating;
        }

        public ListOfDealsRequestDtoBuilder setSteamRating(int steamRating) {
            this.steamRating = steamRating;
            return this;
        }

        public String getSteamAppID() {
            return steamAppID;
        }

        public ListOfDealsRequestDtoBuilder setSteamAppID(String steamAppID) {
            this.steamAppID = steamAppID;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public ListOfDealsRequestDtoBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Boolean getExact() {
            return exact;
        }

        public ListOfDealsRequestDtoBuilder setExact(Boolean exact) {
            this.exact = exact;
            return this;
        }

        public Boolean getAAA() {
            return AAA;
        }

        public ListOfDealsRequestDtoBuilder setAAA(Boolean AAA) {
            this.AAA = AAA;
            return this;
        }

        public Boolean getSteamworks() {
            return steamworks;
        }

        public ListOfDealsRequestDtoBuilder setSteamworks(Boolean steamworks) {
            this.steamworks = steamworks;
            return this;
        }

        public Boolean getOnSale() {
            return onSale;
        }

        public ListOfDealsRequestDtoBuilder setOnSale(Boolean onSale) {
            this.onSale = onSale;
            return this;
        }

        public String getOutput() {
            return output;
        }

        public ListOfDealsRequestDtoBuilder setOutput(String output) {
            this.output = output;
            return this;
        }

        public ListOfDealsRequestDto build() {
            return new ListOfDealsRequestDto(this);
        }
    }
}
