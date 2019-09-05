package com.cursojunit.paymentapi.repository;

import com.cursojunit.paymentapi.models.Payment;
import com.cursojunit.paymentapi.models.entities.public_.tables.records.PaymentRecord;
import com.cursojunit.paymentapi.models.enums.PaymentStatus;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

import static com.cursojunit.paymentapi.models.entities.public_.tables.Payment.PAYMENT;

@Repository
public class PaymentRepository {

    @Autowired
    private DSLContext dslContext;

    public Integer insertPayment(Payment payment){
        PaymentRecord paymentRecord = dslContext.insertInto(PAYMENT)
                .columns(PAYMENT.ORDERID,
                        PAYMENT.EVENTID,
                        PAYMENT.STATUS,
                        PAYMENT.TOTALAMOUNT)
                .values(payment.getOrderId(),
                        payment.getEventId(),
                        PaymentStatus.PAID.getLabel(),
                        BigDecimal.valueOf(payment.getTotalAmount()))
                .returning(PAYMENT.PAYMENTID).fetchOne();

        return paymentRecord.getPaymentid();
    }

    public Payment selectPaymentByPaymentId(Integer paymentId) {
        try{
            PaymentRecord paymentRecord = dslContext.selectFrom(PAYMENT)
                    .where(PAYMENT.PAYMENTID.eq(paymentId))
                    .fetchAny();

            Payment payment = new Payment();
            payment.setPaymentId(paymentRecord.getPaymentid());
            payment.setOrderId(paymentRecord.getOrderid());
            payment.setEventId(paymentRecord.getEventid());
            payment.setTotalAmount(paymentRecord.getTotalamount().doubleValue());
            return payment;
        }catch (Exception e) {
            return null;
        }
    }

    public Payment selectPaymentByOrderAndEventId(Integer orderId, Integer eventId) {
        try{
            PaymentRecord paymentRecord = dslContext.selectFrom(PAYMENT)
                    .where(PAYMENT.ORDERID.eq(orderId))
                    .and(PAYMENT.EVENTID.eq(eventId))
                    .fetchAny();

            Payment payment = new Payment();
            payment.setPaymentId(paymentRecord.getPaymentid());
            payment.setOrderId(paymentRecord.getOrderid());
            payment.setEventId(paymentRecord.getEventid());
            payment.setTotalAmount(paymentRecord.getTotalamount().doubleValue());
            return payment;
        }catch (Exception e) {
            return null;
        }
    }
}
