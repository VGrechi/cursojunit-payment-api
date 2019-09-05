/*
 * This file is generated by jOOQ.
*/
package com.cursojunit.paymentapi.models.entities.information_schema.tables;


import com.cursojunit.paymentapi.models.entities.information_schema.InformationSchema;
import com.cursojunit.paymentapi.models.entities.information_schema.tables.records.KeyColumnUsageRecord;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class KeyColumnUsage extends TableImpl<KeyColumnUsageRecord> {

    private static final long serialVersionUID = -724545153;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE</code>
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeyColumnUsageRecord> getRecordType() {
        return KeyColumnUsageRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.TABLE_NAME</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
     */
    public final TableField<KeyColumnUsageRecord, String> POSITION_IN_UNIQUE_CONSTRAINT = createField("POSITION_IN_UNIQUE_CONSTRAINT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE</code> table reference
     */
    public KeyColumnUsage() {
        this("KEY_COLUMN_USAGE", null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE</code> table reference
     */
    public KeyColumnUsage(String alias) {
        this(alias, KEY_COLUMN_USAGE);
    }

    private KeyColumnUsage(String alias, Table<KeyColumnUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private KeyColumnUsage(String alias, Table<KeyColumnUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsage as(String alias) {
        return new KeyColumnUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyColumnUsage rename(String name) {
        return new KeyColumnUsage(name, null);
    }
}
