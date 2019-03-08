package com.house.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "HouseInNewComplex")
public class HouseInNewComplex {
    @Id
    @Column(name = "idHouse")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHouse;
    private String nameOfComplex;
    private String nameOfHouse;
    private int floor;
    private int numberOfApartment;
    private int numberOfRoom;
    private double square;
    private int pricePerSquare;
    private int fullPrice;
    private Status status;

    public HouseInNewComplex(){}

    public HouseInNewComplex(String nameOfComplex, String nameOfHouse, int floor, int numberOfApartment, int numberOfRoom, double square, int pricePerSquare, int fullPrice, Status status) {
        this.nameOfComplex = nameOfComplex;
        this.nameOfHouse = nameOfHouse;
        this.floor = floor;
        this.numberOfApartment = numberOfApartment;
        this.numberOfRoom = numberOfRoom;
        this.square = square;
        this.pricePerSquare = pricePerSquare;
        this.fullPrice = fullPrice;
        this.status = status;
    }


    public int getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(int idHouse) {
        this.idHouse = idHouse;
    }

    public String getNameOfComplex() {
        return nameOfComplex;
    }

    public void setNameOfComplex(String nameOfComplex) {
        this.nameOfComplex = nameOfComplex;
    }

    public String getNameOfHouse() {
        return nameOfHouse;
    }

    public void setNameOfHouse(String nameOfHouse) {
        this.nameOfHouse = nameOfHouse;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfApartment() {
        return numberOfApartment;
    }

    public void setNumberOfApartment(int numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public void setPricePerSquare(int pricePerSquare) {
        this.pricePerSquare = pricePerSquare;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HouseInNewComplex{" +
                "idHouse=" + idHouse +
                ", nameOfComplex='" + nameOfComplex + '\'' +
                ", nameOfHouse='" + nameOfHouse + '\'' +
                ", floor=" + floor +
                ", numberOfApartment=" + numberOfApartment +
                ", numberOfRoom=" + numberOfRoom +
                ", square=" + square +
                ", pricePerSquare=" + pricePerSquare +
                ", fullPrice=" + fullPrice +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseInNewComplex that = (HouseInNewComplex) o;
        return idHouse == that.idHouse &&
                floor == that.floor &&
                numberOfApartment == that.numberOfApartment &&
                numberOfRoom == that.numberOfRoom &&
                Double.compare(that.square, square) == 0 &&
                pricePerSquare == that.pricePerSquare &&
                fullPrice == that.fullPrice &&
                Objects.equals(nameOfComplex, that.nameOfComplex) &&
                Objects.equals(nameOfHouse, that.nameOfHouse) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHouse, floor, fullPrice, nameOfComplex, nameOfHouse, numberOfApartment, numberOfRoom, pricePerSquare, square, status);
    }
}
