package com.burberry.ce.upstream.constants;

public enum Classification {
    VERSION("version"),
    GALAXY("galaxy"),
    CLASSIFICATION_DATE("classification_start_date"),
    TOP_POTENTIAL("top_potential_flag"),
    TOP_CLIENT("TOP"),
    FIRST_CB_TIER("initial_rolling_tier_in_cb"),
    ROLLING_TIER("tier_2yrs_rolling"),
    DOT("cvm_dot"),
    STORE_ASSIGNED("cvm_store_assigned"),
    STORE_COUNT("cvm_store_count"),
    STORE_MOD_DATE("cvm_store_modified_date"),
    SA_ASSIGNED("cvm_sa_assigned"),
    SA_MOD_DATE("cvm_sa_modified_date"),
    CB_FLAG("cb_flag"),
    CONTACTABLE("contactable"),
    CUSTOMER_NO("parent_customer_no");

    private final String name;

    public String get() {
        return name;
    }

    Classification(String value) {
        this.name = value;
    }
}