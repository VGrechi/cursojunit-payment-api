package com.cursojunit.paymentapi.service;

import com.cursojunit.paymentapi.models.AllowedPaymentMethod;
import com.cursojunit.paymentapi.repository.AllowedPaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentMethodService {

    @Autowired
    private AllowedPaymentMethodRepository allowedPaymentMethodRepository;

    public List<AllowedPaymentMethod> getAllowedPaymentMethods(){
        return allowedPaymentMethodRepository.selectAllowedPaymentMethods();
    }
}


