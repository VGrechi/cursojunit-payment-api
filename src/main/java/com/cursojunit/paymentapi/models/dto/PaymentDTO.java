package com.cursojunit.paymentapi.models.dto;

import com.cursojunit.paymentapi.models.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class PaymentDTO {

    private Integer orderId;
    private Integer eventId;
    private Double totalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<PaymentMethod> paymentMethods;

    /*
    * Getters and Setters
     */
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
