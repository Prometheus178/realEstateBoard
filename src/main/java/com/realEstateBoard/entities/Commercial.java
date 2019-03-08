package com.realEstateBoard.entities;

public enum Commercial {
    OFFICE("ОФИС"),
    BUILDING("BUILDING"),
    tradingArea("tradingArea"),
    freeAppointmentRoom("freeAppointmentRoom"),
    PRODUCTION("PRODUCTION"),
    STOCK("STOCK"),
    GARAGE("GARAGE"),
    readyBusiness("readyBusiness"),
    commercialStead("commercialStead");

    private String value;
    Commercial (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
