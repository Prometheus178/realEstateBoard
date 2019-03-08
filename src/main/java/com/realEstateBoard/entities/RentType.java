package com.realEstateBoard.entities;

public enum RentType {
    longTermRent("Долгосрочная"),
    byTheDay ("Посуточно");

    private String value;
    RentType (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
