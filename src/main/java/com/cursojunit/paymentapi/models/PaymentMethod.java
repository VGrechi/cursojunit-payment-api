package com.cursojunit.paymentapi.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class PaymentMethod {

    private Integer paymentMethodId;
    private String paymentMethod;
    private Double paymentAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CreditCard creditCard;

    /*
    * Getters and Setters
     */
    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
