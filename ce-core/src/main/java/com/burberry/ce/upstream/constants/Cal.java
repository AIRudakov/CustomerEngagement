package com.burberry.ce.upstream.constants;

public enum Cal {
    FLD_FISCAL_YEAR("fiscal_year"),
    FLD_FISCAL_MONTH("fiscal_month"),
    FLD_FISCAL_WEEK("fiscal_week");

    private final String value;

    public String get() {
        return value;
    }

    Cal(String value) {
        this.value = value;
    }
}
