package com.cursojunit.paymentapi.controller;

import com.cursojunit.paymentapi.models.Payment;
import com.cursojunit.paymentapi.models.dto.PaymentDTO;
import com.cursojunit.paymentapi.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Payment> processPayment(@RequestBody PaymentDTO paymentDTO){
        if(paymentDTO.getOrderId() == null || paymentDTO.getOrderId() <= 0){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if(paymentDTO.getEventId() == null || paymentDTO.getEventId() <= 0){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if(paymentDTO.getTotalAmount() == null || paymentDTO.getTotalAmount() <= 0){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if(paymentDTO.getPaymentMethods() == null || paymentDTO.getPaymentMethods().isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Payment payment = service.processPayment(paymentDTO);

        if(payment == null){
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }

    @GetMapping(value = "/{paymentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Payment> getPaymentByPaymentId(@PathVariable Integer paymentId){
        if(paymentId == null || paymentId <= 0){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Payment payment = service.getPaymentById(paymentId);
        if(payment == null)
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(payment, HttpStatus.OK);
    }


    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Payment> getPaymentByOrderAndEventId(@RequestParam Integer orderId, @RequestParam Integer eventId){
        if(orderId == null || orderId <= 0){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if(eventId == null || eventId <= 0){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Payment payment = service.getPaymentByOrderAndEventId(orderId, eventId);
        if(payment == null)
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(payment, HttpStatus.OK);
    }
}
