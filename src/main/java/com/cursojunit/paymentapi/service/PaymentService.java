package com.cursojunit.paymentapi.service;

import com.cursojunit.paymentapi.models.Payment;
import com.cursojunit.paymentapi.models.PaymentMethod;
import com.cursojunit.paymentapi.models.dto.PaymentDTO;
import com.cursojunit.paymentapi.repository.PaymentMethodRepository;
import com.cursojunit.paymentapi.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    public Payment processPayment(PaymentDTO paymentDTO){
        Payment payment = paymentRepository.selectPaymentByOrderAndEventId(paymentDTO.getOrderId(), paymentDTO.getEventId());
        if(payment != null) return null;

        payment = new Payment();
        payment.setOrderId(paymentDTO.getOrderId());
        payment.setEventId(paymentDTO.getEventId());
        payment.setTotalAmount(paymentDTO.getTotalAmount());
        Integer paymentId = paymentRepository.insertPayment(payment);
        payment.setPaymentId(paymentId);

        paymentDTO.getPaymentMethods().forEach(paymentMethod -> {
            paymentMethodRepository.insertPaymentMethod(paymentId, paymentMethod);
        });

        return payment;
    }

    public Payment getPaymentById(Integer paymentId){
        Payment payment = paymentRepository.selectPaymentByPaymentId(paymentId);
        if(payment == null) return null;

        List<PaymentMethod> paymentMethods = paymentMethodRepository.selectPaymentMethodByPaymentId(paymentId);
        payment.setPaymentMethods(paymentMethods);

        return payment;
    }

    public Payment getPaymentByOrderAndEventId(Integer orderId, Integer eventId){
        Payment payment = paymentRepository.selectPaymentByOrderAndEventId(orderId, eventId);
        if(payment == null) return null;

        List<PaymentMethod> paymentMethods = paymentMethodRepository.selectPaymentMethodByPaymentId(payment.getPaymentId());
        payment.setPaymentMethods(paymentMethods);

        return payment;
    }
}
