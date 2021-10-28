package com.GregV2.demo.controllers;

import com.GregV2.demo.dao.CarDao;
import com.GregV2.demo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarDao carDao;

    @GetMapping(value = "/Cars")
    public List<Car> getCars(){
        return carDao.findAll();
    }

    @GetMapping(value="/Cars/{id}")
    public String CarId(@PathVariable int id){

        return carDao.getById();
    }

}
