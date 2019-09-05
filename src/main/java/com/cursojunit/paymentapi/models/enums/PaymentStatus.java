package com.cursojunit.paymentapi.models.enums;

public enum PaymentStatus {

    PENDING("PENDING"),
    PAID("PAID"),
    REJECTED("REJECTED"),
    ;

    private String label;

    PaymentStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
