/*
 * This file is generated by jOOQ.
*/
package com.cursojunit.paymentapi.models.entities.public_.tables;


import com.cursojunit.paymentapi.models.entities.public_.Keys;
import com.cursojunit.paymentapi.models.entities.public_.Public;
import com.cursojunit.paymentapi.models.entities.public_.tables.records.AllowedpaymentmethodRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Allowedpaymentmethod extends TableImpl<AllowedpaymentmethodRecord> {

    private static final long serialVersionUID = -516448497;

    /**
     * The reference instance of <code>PUBLIC.ALLOWEDPAYMENTMETHOD</code>
     */
    public static final Allowedpaymentmethod ALLOWEDPAYMENTMETHOD = new Allowedpaymentmethod();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AllowedpaymentmethodRecord> getRecordType() {
        return AllowedpaymentmethodRecord.class;
    }

    /**
     * The column <code>PUBLIC.ALLOWEDPAYMENTMETHOD.ID</code>.
     */
    public final TableField<AllowedpaymentmethodRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("(NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_97CC4979_DF7A_4CA7_9343_C267339C0EFB)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>PUBLIC.ALLOWEDPAYMENTMETHOD.NAME</code>.
     */
    public final TableField<AllowedpaymentmethodRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ALLOWEDPAYMENTMETHOD.BRAND</code>.
     */
    public final TableField<AllowedpaymentmethodRecord, String> BRAND = createField("BRAND", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>PUBLIC.ALLOWEDPAYMENTMETHOD.STATUS</code>.
     */
    public final TableField<AllowedpaymentmethodRecord, Boolean> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("FALSE", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>PUBLIC.ALLOWEDPAYMENTMETHOD</code> table reference
     */
    public Allowedpaymentmethod() {
        this("ALLOWEDPAYMENTMETHOD", null);
    }

    /**
     * Create an aliased <code>PUBLIC.ALLOWEDPAYMENTMETHOD</code> table reference
     */
    public Allowedpaymentmethod(String alias) {
        this(alias, ALLOWEDPAYMENTMETHOD);
    }

    private Allowedpaymentmethod(String alias, Table<AllowedpaymentmethodRecord> aliased) {
        this(alias, aliased, null);
    }

    private Allowedpaymentmethod(String alias, Table<AllowedpaymentmethodRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AllowedpaymentmethodRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ALLOWEDPAYMENTMETHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Allowedpaymentmethod as(String alias) {
        return new Allowedpaymentmethod(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Allowedpaymentmethod rename(String name) {
        return new Allowedpaymentmethod(name, null);
    }
}
