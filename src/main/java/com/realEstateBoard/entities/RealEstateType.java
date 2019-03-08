package com.realEstateBoard.entities;

public enum RealEstateType {
    LIVING ("LIVING"),
    COMMERCIAL ("COMMERCIAL");

    private String value;
    RealEstateType (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
