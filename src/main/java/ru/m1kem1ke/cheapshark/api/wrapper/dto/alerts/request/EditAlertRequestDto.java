package ru.m1kem1ke.cheapshark.api.wrapper.dto.alerts.request;

public class EditAlertRequestDto {
    private String action;
    private String email;
    private int gameID;
    private float price;

    public EditAlertRequestDto() {}

    private EditAlertRequestDto(EditAlertRequestDtoBuilder builder) {
        this.action = builder.action;
        this.email = builder.email;
        this.gameID = builder.gameID;
        this.price = builder.price;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static EditAlertRequestDtoBuilder builder() {
        return new EditAlertRequestDtoBuilder();
    }

    public static class EditAlertRequestDtoBuilder {
        private String action;
        private String email;
        private int gameID;
        private float price;

        public String getAction() {
            return action;
        }

        public EditAlertRequestDtoBuilder setAction(String action) {
            this.action = action;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public EditAlertRequestDtoBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getGameID() {
            return gameID;
        }

        public EditAlertRequestDtoBuilder setGameID(int gameID) {
            this.gameID = gameID;
            return this;
        }

        public float getPrice() {
            return price;
        }

        public EditAlertRequestDtoBuilder setPrice(float price) {
            this.price = price;
            return this;
        }

        public EditAlertRequestDto build() {
            return new EditAlertRequestDto(this);
        }
    }
}
