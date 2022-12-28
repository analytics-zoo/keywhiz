/*
 * This file is generated by jOOQ.
 */
package keywhiz.jooq.tables.records;


import keywhiz.jooq.tables.Secrets;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecretsRecord extends UpdatableRecordImpl<SecretsRecord> implements Record12<Long, String, Long, Long, String, String, String, String, String, Long, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>keywhizdb_test.secrets.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.updatedat</code>.
     */
    public void setUpdatedat(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.updatedat</code>.
     */
    public Long getUpdatedat() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.createdat</code>.
     */
    public void setCreatedat(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.createdat</code>.
     */
    public Long getCreatedat() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.createdby</code>.
     */
    public void setCreatedby(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.createdby</code>.
     */
    public String getCreatedby() {
        return (String) get(5);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.updatedby</code>.
     */
    public void setUpdatedby(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.updatedby</code>.
     */
    public String getUpdatedby() {
        return (String) get(6);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.type</code>.
     */
    public void setType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.type</code>.
     */
    public String getType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.options</code>.
     */
    public void setOptions(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.options</code>.
     */
    public String getOptions() {
        return (String) get(8);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.current</code>.
     */
    public void setCurrent(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.current</code>.
     */
    public Long getCurrent() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.row_hmac</code>.
     */
    public void setRowHmac(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.row_hmac</code>.
     */
    public String getRowHmac() {
        return (String) get(10);
    }

    /**
     * Setter for <code>keywhizdb_test.secrets.owner</code>.
     */
    public void setOwner(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>keywhizdb_test.secrets.owner</code>.
     */
    public Long getOwner() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, Long, Long, String, String, String, String, String, Long, String, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, String, Long, Long, String, String, String, String, String, Long, String, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Secrets.SECRETS.ID;
    }

    @Override
    public Field<String> field2() {
        return Secrets.SECRETS.NAME;
    }

    @Override
    public Field<Long> field3() {
        return Secrets.SECRETS.UPDATEDAT;
    }

    @Override
    public Field<Long> field4() {
        return Secrets.SECRETS.CREATEDAT;
    }

    @Override
    public Field<String> field5() {
        return Secrets.SECRETS.DESCRIPTION;
    }

    @Override
    public Field<String> field6() {
        return Secrets.SECRETS.CREATEDBY;
    }

    @Override
    public Field<String> field7() {
        return Secrets.SECRETS.UPDATEDBY;
    }

    @Override
    public Field<String> field8() {
        return Secrets.SECRETS.TYPE;
    }

    @Override
    public Field<String> field9() {
        return Secrets.SECRETS.OPTIONS;
    }

    @Override
    public Field<Long> field10() {
        return Secrets.SECRETS.CURRENT;
    }

    @Override
    public Field<String> field11() {
        return Secrets.SECRETS.ROW_HMAC;
    }

    @Override
    public Field<Long> field12() {
        return Secrets.SECRETS.OWNER;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long component3() {
        return getUpdatedat();
    }

    @Override
    public Long component4() {
        return getCreatedat();
    }

    @Override
    public String component5() {
        return getDescription();
    }

    @Override
    public String component6() {
        return getCreatedby();
    }

    @Override
    public String component7() {
        return getUpdatedby();
    }

    @Override
    public String component8() {
        return getType();
    }

    @Override
    public String component9() {
        return getOptions();
    }

    @Override
    public Long component10() {
        return getCurrent();
    }

    @Override
    public String component11() {
        return getRowHmac();
    }

    @Override
    public Long component12() {
        return getOwner();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Long value3() {
        return getUpdatedat();
    }

    @Override
    public Long value4() {
        return getCreatedat();
    }

    @Override
    public String value5() {
        return getDescription();
    }

    @Override
    public String value6() {
        return getCreatedby();
    }

    @Override
    public String value7() {
        return getUpdatedby();
    }

    @Override
    public String value8() {
        return getType();
    }

    @Override
    public String value9() {
        return getOptions();
    }

    @Override
    public Long value10() {
        return getCurrent();
    }

    @Override
    public String value11() {
        return getRowHmac();
    }

    @Override
    public Long value12() {
        return getOwner();
    }

    @Override
    public SecretsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SecretsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public SecretsRecord value3(Long value) {
        setUpdatedat(value);
        return this;
    }

    @Override
    public SecretsRecord value4(Long value) {
        setCreatedat(value);
        return this;
    }

    @Override
    public SecretsRecord value5(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public SecretsRecord value6(String value) {
        setCreatedby(value);
        return this;
    }

    @Override
    public SecretsRecord value7(String value) {
        setUpdatedby(value);
        return this;
    }

    @Override
    public SecretsRecord value8(String value) {
        setType(value);
        return this;
    }

    @Override
    public SecretsRecord value9(String value) {
        setOptions(value);
        return this;
    }

    @Override
    public SecretsRecord value10(Long value) {
        setCurrent(value);
        return this;
    }

    @Override
    public SecretsRecord value11(String value) {
        setRowHmac(value);
        return this;
    }

    @Override
    public SecretsRecord value12(Long value) {
        setOwner(value);
        return this;
    }

    @Override
    public SecretsRecord values(Long value1, String value2, Long value3, Long value4, String value5, String value6, String value7, String value8, String value9, Long value10, String value11, Long value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SecretsRecord
     */
    public SecretsRecord() {
        super(Secrets.SECRETS);
    }

    /**
     * Create a detached, initialised SecretsRecord
     */
    public SecretsRecord(Long id, String name, Long updatedat, Long createdat, String description, String createdby, String updatedby, String type, String options, Long current, String rowHmac, Long owner) {
        super(Secrets.SECRETS);

        setId(id);
        setName(name);
        setUpdatedat(updatedat);
        setCreatedat(createdat);
        setDescription(description);
        setCreatedby(createdby);
        setUpdatedby(updatedby);
        setType(type);
        setOptions(options);
        setCurrent(current);
        setRowHmac(rowHmac);
        setOwner(owner);
    }
}
