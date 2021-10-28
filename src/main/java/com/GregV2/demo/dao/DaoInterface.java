package com.GregV2.demo.dao;

import com.GregV2.demo.model.Car;

import java.util.List;

public interface DaoInterface {
    public List<Car> findAll();
    public Car getById(int id);
    public Boolean delete(int id);
    public Car save(Car newCar);
    public Car update(Car updateCar ,int id);
}
