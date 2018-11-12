package com.burberry.ce.upstream.constants;

public enum Transactions {
    VAL_REC_ITEM("ITEM"),
    VAL_REC_HEADER("HEADER"),
    FLD_REC_TYPE("record_type"),

    VAL_ONLINE_STORE("BURBERRY.COM"),
    VAL_MAINLINE_STORE("MAINLINE"),
    FLD_STORE_TYPE("store_type"),

    FLD_STORE_NO("store_no"),
    FLD_STORE_CNTRY("store_country"),

    VAL_IPAD_CHANNEL("MAINLINE DEVICE"),
    VAL_DIRECT_CHANNEL("MAINLINE DIRECT"),
    FLD_TRANS_CHANNEL("trans_channel"),

    FLD_ITEM_SA("assoc_no_itm"),

    VAL_BEAUTY_BOX("Beauty Box"),
    FLD_STORE_CONCEPT("store_concept"),

    VAL_MERCH_CODE("ZAWA"),
    FLD_MERCH_CODE("merch_code"),

    FLD_SALE_AMOUNT("actualsalesamt_central_constant"),
    FLD_REVENUE_AMOUNT("revenue_extax_central_constant"),
    FLD_QUANTITY("quantity"),

    FLD_TRANS_ID("trans_id"),

    FLD_TRANS_DATE("trans_date"),
    FLD_TRANS_TMSTMP("transaction_timestamp"),
    FLD_TRANS_TMSTMP_UTC("transaction_timestamp_utc"),

    FLD_PARENT_CUSTOMER_NO("parent_customer_no"),
    FLD_CUSTOMER_CNTRY("cust_country"),

    FLD_FISCAL_YEAR("fiscal_year"),
    FLD_FISCAL_MONTH("fiscal_month"),
    FLD_FISCAL_WEEK("fiscal_week");

    private final String value;

    public String get() {
        return value;
    }

    Transactions(String value) {
        this.value = value;
    }
}
