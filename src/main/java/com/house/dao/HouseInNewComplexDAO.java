package com.house.dao;

import com.house.entities.HouseInNewComplex;

import java.util.List;

public interface HouseInNewComplexDAO {

    void addHouse(HouseInNewComplex houseInNewComplex);
    void deleteHouseByID(HouseInNewComplex houseInNewComplex);
    HouseInNewComplex updateHouseByID(HouseInNewComplex houseInNewComplex);
    List<HouseInNewComplex> listOfHouseInNewComplex();
    HouseInNewComplex getHouseByID(int idHouse);
}
