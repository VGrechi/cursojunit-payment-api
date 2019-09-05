package com.cursojunit.paymentapi.controller;

import com.cursojunit.paymentapi.models.AllowedPaymentMethod;
import com.cursojunit.paymentapi.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/paymentmethods")
public class PaymentMethodController {

    @Autowired
    private PaymentMethodService service;

    @GetMapping(value = "/allowed", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AllowedPaymentMethod>> getAllowedPaymentMethods(){
        List<AllowedPaymentMethod> paymentMethods = service.getAllowedPaymentMethods();
        return new ResponseEntity<>(paymentMethods, HttpStatus.OK);
    }
}
