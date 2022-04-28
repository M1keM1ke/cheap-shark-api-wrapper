package ru.m1kem1ke.cheapshark.api.wrapper.dto.stores.response;

public class StoreDto {
    private String storeID;
    private String storeName;
    private int isActive;
    private ImagesDto images;

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public ImagesDto getImages() {
        return images;
    }

    public void setImages(ImagesDto images) {
        this.images = images;
    }
}
