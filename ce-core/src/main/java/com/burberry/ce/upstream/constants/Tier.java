package com.burberry.ce.upstream.constants;

public enum Tier {
    ASPIRER("Aspirer", 3),
    EXPLORER("Explorer", 2),
    CONNOISSEUR("Connoisseur", 1),
    ELITE("Elite", 0);

    private final String name;
    private final int priority;

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    Tier(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}
