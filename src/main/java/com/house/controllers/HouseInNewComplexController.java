package com.house.controllers;

import com.house.entities.HouseInNewComplex;
import com.house.entities.Status;
import com.house.services.HouseInNewComplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HouseInNewComplexController {

    @Qualifier("houseInNewComplexServiceImpl")
    @Autowired
    private HouseInNewComplexService service;



    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView modelAndView = new ModelAndView("add");
        return modelAndView;
    }

    @RequestMapping(value = "/newBuilding", method = RequestMethod.GET)
    public ModelAndView newBuildingPage(){
        ModelAndView modelAndView = new ModelAndView("newBuilding");
        modelAndView.addObject("listOfHouseInNewComplex", service.listOfHouseInNewComplex());
        return modelAndView;
    }

    @RequestMapping(value = "/addHouseInNewComplex" , method = RequestMethod.POST)
    public ModelAndView houseAdd(@RequestParam(value = "nameOfComplex") String nameOfComplex,
                                 @RequestParam(value = "nameOfHouse") String nameOfHouse,
                                 @RequestParam(value = "floor") int floor,
                                 @RequestParam(value =  "numberOfApartment") int numberOfApartment,
                                 @RequestParam(value =  "numberOfRoom") int numberOfRoom,
                                 @RequestParam(value = "square") double square,
                                 @RequestParam(value = "pricePerSquare") int pricePerSquare,
                                 @RequestParam(value = "fullPrice") int fullPrice,
                                 @RequestParam(value = "status") Status status,
                                 HouseInNewComplex houseInNewComplex) throws Exception{
        ModelAndView modelAndView = new ModelAndView("redirect:/newBuilding");
        try {
            houseInNewComplex.setNameOfComplex(nameOfComplex);
            houseInNewComplex.setNameOfHouse(nameOfHouse);
            houseInNewComplex.setFloor(floor);
            houseInNewComplex.setNumberOfApartment(numberOfApartment);
            houseInNewComplex.setNumberOfRoom(numberOfRoom);
            houseInNewComplex.setSquare(square);
            houseInNewComplex.setPricePerSquare(pricePerSquare);
            houseInNewComplex.setFullPrice(fullPrice);
            houseInNewComplex.setStatus(status);
            service.addHouse(houseInNewComplex);
            modelAndView.addObject("addMessage","House added " + houseInNewComplex.getNameOfComplex());
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            return modelAndView;
        }

    }

    @RequestMapping(value = "/removeHouseFromNewComplex/{idHouse}", method = RequestMethod.GET)
    public String removeHouseFromNewComplex(@PathVariable("idHouse") int idHouse,HouseInNewComplex houseInNewComplex){
        houseInNewComplex.setIdHouse(idHouse);
        service.deleteHouseByID(houseInNewComplex);
        return "redirect:/";
    }
    @RequestMapping(value = "/edit/{idHouse}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("idHouse") int idHouse) {
        ModelAndView modelAndView = new ModelAndView("edit");
        HouseInNewComplex houseInNewComplex = service.getHouseByID(idHouse);
        modelAndView.addObject("houseInNewComplex", houseInNewComplex);
        return modelAndView;
    }
    @RequestMapping(value = "/updateHouseInNewComplex/{idHouse}", method = RequestMethod.POST)
    public ModelAndView updateHouseInNewComplex(@PathVariable("idHouse") int idHouse,
                                                @RequestParam(value = "nameOfComplex") String nameOfComplex,
                                                @RequestParam(value = "nameOfHouse") String nameOfHouse,
                                                @RequestParam(value = "floor") int floor,
                                                @RequestParam(value =  "numberOfApartment") int numberOfApartment,
                                                @RequestParam(value =  "numberOfRoom") int numberOfRoom,
                                                @RequestParam(value = "square") double square,
                                                @RequestParam(value = "pricePerSquare") int pricePerSquare,
                                                @RequestParam(value = "fullPrice") int fullPrice,
                                                @RequestParam(value = "status") Status status,
                                                HouseInNewComplex houseInNewComplex){
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        try{
            houseInNewComplex.setNameOfComplex(nameOfComplex);
            houseInNewComplex.setNameOfHouse(nameOfHouse);
            houseInNewComplex.setFloor(floor);
            houseInNewComplex.setNumberOfApartment(numberOfApartment);
            houseInNewComplex.setNumberOfRoom(numberOfRoom);
            houseInNewComplex.setSquare(square);
            houseInNewComplex.setPricePerSquare(pricePerSquare);
            houseInNewComplex.setFullPrice(fullPrice);
            houseInNewComplex.setStatus(status);
            houseInNewComplex.setIdHouse(idHouse);
            service.updateHouseByID(houseInNewComplex);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return modelAndView;
    }

}
