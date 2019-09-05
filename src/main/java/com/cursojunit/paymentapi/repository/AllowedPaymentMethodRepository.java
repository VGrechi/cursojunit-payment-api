package com.cursojunit.paymentapi.repository;

import com.cursojunit.paymentapi.models.AllowedPaymentMethod;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.cursojunit.paymentapi.models.entities.public_.tables.Allowedpaymentmethod.ALLOWEDPAYMENTMETHOD;

@Repository
public class AllowedPaymentMethodRepository {

    @Autowired
    private DSLContext dslContext;

    public List<AllowedPaymentMethod> selectAllowedPaymentMethods(){
        return dslContext.selectFrom(ALLOWEDPAYMENTMETHOD)
                .where(ALLOWEDPAYMENTMETHOD.STATUS.eq(true))
                .fetch().into(AllowedPaymentMethod.class);
    }

}
