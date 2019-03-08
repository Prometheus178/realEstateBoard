package com.realEstateBoard.entities;

public enum Repairs {
    COSMETIC("Косметический"),
    EURO("Евро"),
    DESIGNER("Дизайнерский"),
    withoutRepair("Без ремонта");

    private String value;
    Repairs (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
