package com.realEstateBoard.entities;

public enum AccountType {
    OWNER ("OWNER"),
    AGENT ("AGENT");

    private String value;
    AccountType(String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }

}
