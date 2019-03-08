package com.realEstateBoard.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Arrays;

@Entity
@Table(name = "Poster")

public class Poster {
    @Id
    @Column(name = "idPoster")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idPoster;
    private LocalDateTime dateTime;
    private AccountType accountType;
    private DealType dealType;
    private RentType rentType;
    private RealEstateType realEstateType;
    private Living living;
    private Commercial commercial;
    private District district;
    private String address;
    private BuildingType buildingType;
    private String description;
    private byte[] photo;
    private int price;
    private int deposit;
    private boolean communalPayments;
    private String cadastrNumber;
    private NumberOfRooms numberOfRooms;
    private double square;
    private double squareOfLiving;
    private double squareOfKitchen;
    private int floor;
    private Repairs repairs;
    private boolean animal;
    private boolean furniture;
    private boolean furnitureInTheKitchen;
    private boolean windowInside;
    private boolean windowOutside;
    private boolean balcony;
    private boolean loggia;
    private boolean fridge;
    private boolean dishwasher;
    private boolean washer;
    private boolean tv;
    private boolean phone;
    private boolean bath;
    private boolean shower;
    private boolean conditioner;
    private boolean internet;
    private boolean separateBathroom;
    private boolean combinedBathroom;
    private boolean lift;
    private String nameOfComplex;
    private int yearOfConstruction;
    private boolean ramp;
    private String title;

    public Poster(){}

    public Poster(AccountType accountType,
                  DealType dealType,
                  RentType rentType,
                  RealEstateType realEstateType,
                  Living living,
                  Commercial commercial,
                  District district,
                  String address,
                  BuildingType buildingType,
                  String description,
                  byte[] photo,
                  int price,
                  int deposit,
                  boolean communalPayments,
                  String cadastrNumber,
                  NumberOfRooms numberOfRooms,
                  double square,
                  double squareOfLiving,
                  double squareOfKitchen,
                  int floor,
                  Repairs repairs,
                  boolean animal,
                  boolean furniture,
                  boolean furnitureInTheKitchen,
                  boolean windowInside,
                  boolean windowOutside,
                  boolean balcony,
                  boolean loggia,
                  boolean fridge,
                  boolean dishwasher,
                  boolean washer,
                  boolean tv,
                  boolean phone,
                  boolean bath,
                  boolean shower,
                  boolean conditioner,
                  boolean internet,
                  boolean separateBathroom,
                  boolean combinedBathroom,
                  boolean lift,
                  String nameOfComplex,
                  int yearOfConstruction,
                  boolean ramp,
                  String title){
        dateTime = LocalDateTime.now();
        this.accountType = accountType;
        this.dealType = dealType;
        this.rentType = rentType;
        this.realEstateType = realEstateType;
        this.living = living;
        this.commercial = commercial;
        this.district = district;
        this.address = address;
        this.buildingType = buildingType;
        this.description = description;
        this.photo = photo;
        this.price = price;
        this.deposit = deposit;
        this.communalPayments = communalPayments;
        this.cadastrNumber = cadastrNumber;
        this.numberOfRooms = numberOfRooms;
        this.square = square;
        this.squareOfLiving = squareOfLiving;
        this.squareOfKitchen = squareOfKitchen;
        this.floor = floor;
        this.repairs = repairs;
        this.animal = animal;
        this.furniture = furniture;
        this.furnitureInTheKitchen = furnitureInTheKitchen;
        this.windowInside = windowInside;
        this.windowOutside = windowOutside;
        this.balcony = balcony;
        this.loggia = loggia;
        this.fridge = fridge;
        this.dishwasher = dishwasher;
        this.washer = washer;
        this.tv = tv;
        this.phone = phone;
        this.bath = bath;
        this.shower = shower;
        this.conditioner = conditioner;
        this.internet = internet;
        this.separateBathroom = separateBathroom;
        this.combinedBathroom = combinedBathroom;
        this.lift = lift;
        this.nameOfComplex = nameOfComplex;
        this.yearOfConstruction = yearOfConstruction;
        this.ramp = ramp;
        this.title = title;
    }

    public int getIdPoster() {
        return idPoster;
    }

    public void setIdPoster(int idPoster) {
        this.idPoster = idPoster;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public DealType getDealType() {
        return dealType;
    }

    public void setDealType(DealType dealType) {
        this.dealType = dealType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    public void setRealEstateType(RealEstateType realEstateType) {
        this.realEstateType = realEstateType;
    }

    public Living getLiving() {
        return living;
    }

    public void setLiving(Living living) {
        this.living = living;
    }

    public Commercial getCommercial() {
        return commercial;
    }

    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public boolean isCommunalPayments() {
        return communalPayments;
    }

    public void setCommunalPayments(boolean communalPayments) {
        this.communalPayments = communalPayments;
    }

    public String getCadastrNumber() {
        return cadastrNumber;
    }

    public void setCadastrNumber(String cadastrNumber) {
        this.cadastrNumber = cadastrNumber;
    }

    public NumberOfRooms getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(NumberOfRooms numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getSquareOfLiving() {
        return squareOfLiving;
    }

    public void setSquareOfLiving(double squareOfLiving) {
        this.squareOfLiving = squareOfLiving;
    }

    public double getSquareOfKitchen() {
        return squareOfKitchen;
    }

    public void setSquareOfKitchen(double squareOfKitchen) {
        this.squareOfKitchen = squareOfKitchen;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Repairs getRepairs() {
        return repairs;
    }

    public void setRepairs(Repairs repairs) {
        this.repairs = repairs;
    }

    public boolean isAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }

    public boolean isFurniture() {
        return furniture;
    }

    public void setFurniture(boolean furniture) {
        this.furniture = furniture;
    }

    public boolean isFurnitureInTheKitchen() {
        return furnitureInTheKitchen;
    }

    public void setFurnitureInTheKitchen(boolean furnitureInTheKitchen) {
        this.furnitureInTheKitchen = furnitureInTheKitchen;
    }

    public boolean isWindowInside() {
        return windowInside;
    }

    public void setWindowInside(boolean windowInside) {
        this.windowInside = windowInside;
    }

    public boolean isWindowOutside() {
        return windowOutside;
    }

    public void setWindowOutside(boolean windowOutside) {
        this.windowOutside = windowOutside;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isLoggia() {
        return loggia;
    }

    public void setLoggia(boolean loggia) {
        this.loggia = loggia;
    }

    public boolean isFridge() {
        return fridge;
    }

    public void setFridge(boolean fridge) {
        this.fridge = fridge;
    }

    public boolean isDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(boolean dishwasher) {
        this.dishwasher = dishwasher;
    }

    public boolean isWasher() {
        return washer;
    }

    public void setWasher(boolean washer) {
        this.washer = washer;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isPhone() {
        return phone;
    }

    public void setPhone(boolean phone) {
        this.phone = phone;
    }

    public boolean isBath() {
        return bath;
    }

    public void setBath(boolean bath) {
        this.bath = bath;
    }

    public boolean isShower() {
        return shower;
    }

    public void setShower(boolean shower) {
        this.shower = shower;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isSeparateBathroom() {
        return separateBathroom;
    }

    public void setSeparateBathroom(boolean separateBathroom) {
        this.separateBathroom = separateBathroom;
    }

    public boolean isCombinedBathroom() {
        return combinedBathroom;
    }

    public void setCombinedBathroom(boolean combinedBathroom) {
        this.combinedBathroom = combinedBathroom;
    }

    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    public String getNameOfComplex() {
        return nameOfComplex;
    }

    public void setNameOfComplex(String nameOfComplex) {
        this.nameOfComplex = nameOfComplex;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public boolean isRamp() {
        return ramp;
    }

    public void setRamp(boolean ramp) {
        this.ramp = ramp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "idPoster=" + idPoster +
                ", dateTime=" + dateTime +
                ", accountType=" + accountType +
                ", dealType=" + dealType +
                ", rentType=" + rentType +
                ", realEstateType=" + realEstateType +
                ", living=" + living +
                ", commercial=" + commercial +
                ", district=" + district +
                ", address='" + address + '\'' +
                ", buildingType=" + buildingType +
                ", description='" + description + '\'' +
                ", photo=" + Arrays.toString(photo) +
                ", price=" + price +
                ", deposit=" + deposit +
                ", communalPayments=" + communalPayments +
                ", cadastrNumber='" + cadastrNumber + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", square=" + square +
                ", squareOfLiving=" + squareOfLiving +
                ", squareOfKitchen=" + squareOfKitchen +
                ", floor=" + floor +
                ", repairs=" + repairs +
                ", animal=" + animal +
                ", furniture=" + furniture +
                ", furnitureInTheKitchen=" + furnitureInTheKitchen +
                ", windowInside=" + windowInside +
                ", windowOutside=" + windowOutside +
                ", balcony=" + balcony +
                ", loggia=" + loggia +
                ", fridge=" + fridge +
                ", dishwasher=" + dishwasher +
                ", washer=" + washer +
                ", tv=" + tv +
                ", phone=" + phone +
                ", bath=" + bath +
                ", shower=" + shower +
                ", conditioner=" + conditioner +
                ", internet=" + internet +
                ", separateBathroom=" + separateBathroom +
                ", combinedBathroom=" + combinedBathroom +
                ", lift=" + lift +
                ", nameOfComplex='" + nameOfComplex + '\'' +
                ", yearOfConstruction=" + yearOfConstruction +
                ", ramp=" + ramp +
                ", title='" + title + '\'' +
                '}';
    }

}
