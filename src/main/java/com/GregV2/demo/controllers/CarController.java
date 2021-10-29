package com.GregV2.demo.controllers;

import com.GregV2.demo.dao.CarDao;
import com.GregV2.demo.model.Car;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController //Transforme l'objet JAVA en JSON grace à la dépendence JACKSON
public class CarController {

    @Autowired // on lui indiue qu'on a accès à une couche de données (Le controller doit instancier)
    private CarDao carDao;


    @ApiOperation(value = "Récupère la liste des voitures")
    @GetMapping(value = "/Cars")
    public List<Car> listeCars(){

        return carDao.findAll();
    }

    @ApiOperation(value = "Récupère une voiture par rapport à son ID")
    @GetMapping(value="/Cars/{id}")
    public Car AfficherCar(@PathVariable int id){
        //Car car = new Car(id,"Peugeot","308 Tech Edition","Grise",27000);

        return carDao.getById(id);
    }

    @ApiOperation(value = "Supprime une voiture par rapport à son ID")
    @DeleteMapping(value="/Cars/{id}")
    public Boolean SupprimerCar(@PathVariable int id){
        return carDao.delete(id);
    }

    @ApiOperation(value = "Ajouter une voiture")
    @PostMapping(value="/Cars/add")
    public Car AjouterCar(@RequestBody Car car){ //@RequestBody
        carDao.save(car);
        return car;
    }

    @ApiOperation(value = "Mettre à jour une voiture existante")
    @PutMapping(value="/Cars/{id}")
    public Car ModifierCar(@RequestBody Car updateCar, @PathVariable int id){
        carDao.update(updateCar,id);
        return updateCar;
    }

}
