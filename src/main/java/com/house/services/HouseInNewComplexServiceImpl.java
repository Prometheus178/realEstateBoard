package com.house.services;

import com.house.dao.HouseInNewComplexDAO;
import com.house.entities.HouseInNewComplex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
@Service
public class HouseInNewComplexServiceImpl implements HouseInNewComplexService {

    @Autowired
    HouseInNewComplexDAO houseInNewComplexDAO;

    @Autowired
    public void setHouseInNewComplexDAO(HouseInNewComplexDAO houseInNewComplexDAO){
        this.houseInNewComplexDAO = houseInNewComplexDAO;
    }

    @Transactional
    public void addHouse(HouseInNewComplex houseInNewComplex) {
        houseInNewComplexDAO.addHouse(houseInNewComplex);
    }
    @Transactional
    public void deleteHouseByID(HouseInNewComplex houseInNewComplex) {
        houseInNewComplexDAO.deleteHouseByID(houseInNewComplex);
    }
    @Transactional
    public HouseInNewComplex updateHouseByID(HouseInNewComplex houseInNewComplex) {
        houseInNewComplexDAO.updateHouseByID(houseInNewComplex);
        return houseInNewComplex;
    }
    @Transactional
    public List<HouseInNewComplex> listOfHouseInNewComplex() {
        return houseInNewComplexDAO.listOfHouseInNewComplex();
    }

    @Transactional
    public HouseInNewComplex getHouseByID(int idHouse) {
        return houseInNewComplexDAO.getHouseByID(idHouse);
    }
}
