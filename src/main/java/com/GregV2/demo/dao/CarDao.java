package com.GregV2.demo.dao;

import com.GregV2.demo.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao implements DaoInterface {

    public List<Car> cars = new ArrayList<>();

    public CarDao() {

        cars.add(new Car(20, "Mustang", "FORD", "rouge", 98000));
        cars.add(new Car(5, "BUGATTI", "Divo", "noir", 239000));
        cars.add(new Car(46, "Model S", "Tesla", "Blanc", 75000));
        cars.add(new Car(93, "720s", "McLAREN", "bleu", 750000));
        cars.add(new Car(30, "308", "PEUGEOT", "Gris", 27000));

    }


    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public Car getById(int id) {
        for (Car carTemp:cars) {
            if(carTemp.getId()== id) {
                return carTemp;
            }
        }
        return null;
    }

    @Override
    public Boolean delete(int id) {
        for (Car carTemp:cars) {
            if(carTemp.getId()== id) {
                cars.remove(carTemp);
                return true;
            }
        }
        return false;
    }

    @Override
    public Car save(Car newCar) {
        cars.add(newCar);
        return this.getById(newCar.getId());
    }

    @Override
    public Car update(Car updateCar, int id) {
        for (Car carTemp:cars) {
            if(carTemp.getId()== id) {
                carTemp.setId(updateCar.getId());
                carTemp.setMarque(updateCar.getMarque());
                carTemp.setModele(updateCar.getModele());
                carTemp.setCouleur(updateCar.getCouleur());
                carTemp.setPrix(updateCar.getPrix());
                return carTemp;
            }
        }
        return null;
    }
}
