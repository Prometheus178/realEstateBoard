package com.realEstateBoard.entities;

public enum BuildingType {
    BLOCHNYI("BLOCHNYI"),
    DEREVYANNYI("DEREVYANNYI"),
    INDIVIDUAL("INDIVIDUAL"),
    monolytCarcas("monolytCarcas"),
    carcasnoShitovoi("carcasnoShitovoi"),
    KPD("KPD"),
    MALOSEMEINYI("MALOSEMEINYI"),
    HRUSHEVSKII("HRUSHEVSKII"),
    STALINSKII("STALINSKII");

    private String value;
    BuildingType (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
