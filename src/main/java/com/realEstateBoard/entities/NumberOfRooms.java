package com.realEstateBoard.entities;

public enum NumberOfRooms {
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    sixOrMore("6 и более"),
    STUDIO("студия"),
    freeLayout("свободная планировка");

    private String value;
    NumberOfRooms (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }


}
