package ru.m1kem1ke.cheapshark.api.wrapper.dto.alerts.request;

public class ManageAlertsRequestDto {
    private String action;
    private String email;

    public ManageAlertsRequestDto() {}

    private ManageAlertsRequestDto(ManageAlertsRequestDtoBuilder builder) {
        this.action = builder.action;
        this.email = builder.email;
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

    public static ManageAlertsRequestDtoBuilder builder() {
        return new ManageAlertsRequestDtoBuilder();
    }

    public static class ManageAlertsRequestDtoBuilder {
        private String action;
        private String email;

        public String getAction() {
            return action;
        }

        public ManageAlertsRequestDtoBuilder setAction(String action) {
            this.action = action;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public ManageAlertsRequestDtoBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public ManageAlertsRequestDto build() {
            return new ManageAlertsRequestDto(this);
        }
    }
}
