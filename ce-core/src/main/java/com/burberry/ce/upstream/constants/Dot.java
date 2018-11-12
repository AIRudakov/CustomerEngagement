package com.burberry.ce.upstream.constants;

public enum Dot {
    ONLINE("Online", 3),
    TRAVELLER("Traveller", 2),
    FREQ_TRAVELLER("Frequent Traveller", 1),
    DOMESTIC("Domestic", 0);

    private final String value;
    private final int priority;

    public String get() {
        return value;
    }

    public int getPriority() {
        return priority;
    }

    Dot(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}
