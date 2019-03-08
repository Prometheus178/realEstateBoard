package com.house.entities;

public  enum Status {
    SOLD ("Sold"),
    AVAILABLE("Available"),
    RESERVED("Reserved");

    private String value;
    Status(String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }


}
