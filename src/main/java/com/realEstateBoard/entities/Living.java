package com.realEstateBoard.entities;

public enum Living {
    APARTMENTinNewBuilding ("APARTMENTinNewBuilding"),
    APARTMENT("APARTMENT"),
    ROOM("ROOM"),
    HOUSE("HOUSE"),
    DACHA("DACHA"),
    STEAD("STEAD"),
    GARAGE("GARAGE");
    private String value;
    Living (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
