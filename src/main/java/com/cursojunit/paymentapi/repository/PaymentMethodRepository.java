package com.cursojunit.paymentapi.repository;

import com.cursojunit.paymentapi.models.PaymentMethod;
import com.cursojunit.paymentapi.models.entities.public_.tables.records.PaymentmethodRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

import static com.cursojunit.paymentapi.models.entities.public_.tables.Paymentmethod.PAYMENTMETHOD;

@Repository
public class PaymentMethodRepository {

    @Autowired
    private DSLContext dslContext;

    public Integer insertPaymentMethod(Integer paymentId, PaymentMethod paymentMethod){
        PaymentmethodRecord paymentmethodRecord = dslContext.insertInto(PAYMENTMETHOD)
                .columns(PAYMENTMETHOD.PAYMENTID,
                        PAYMENTMETHOD.PAYMENTMETHOD_,
                        PAYMENTMETHOD.PAYMENTAMOUNT)
                .values(paymentId,
                        paymentMethod.getPaymentMethod(),
                        BigDecimal.valueOf(paymentMethod.getPaymentAmount()))
                .returning(PAYMENTMETHOD.PAYMENTMETHODID).fetchOne();

        return paymentmethodRecord.getPaymentid();
    }

    public List<PaymentMethod> selectPaymentMethodByPaymentId(Integer paymentId) {
        return dslContext.select(PAYMENTMETHOD.PAYMENTMETHODID,
                    PAYMENTMETHOD.PAYMENTMETHOD_,
                    PAYMENTMETHOD.PAYMENTAMOUNT)
                .from(PAYMENTMETHOD)
                .where(PAYMENTMETHOD.PAYMENTID.eq(paymentId))
                .fetch().map(mapper -> {
                    PaymentMethod paymentMethod = new PaymentMethod();
                    paymentMethod.setPaymentMethodId((Integer) mapper.getValue(0));
                    paymentMethod.setPaymentMethod((String) mapper.getValue(1));
                    paymentMethod.setPaymentAmount(((BigDecimal) mapper.getValue(2)).doubleValue());
                    return paymentMethod;
                });
    }
}
