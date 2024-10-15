package org.Shilpa.Car_Rental_System.Controllers;

import org.Shilpa.Car_Rental_System.Model.Car;
import org.Shilpa.Car_Rental_System.Repositories.CarRepo;
import org.Shilpa.Car_Rental_System.Services.CarService;

import java.time.LocalDate;
import java.util.List;

public class CarController {
    private final CarService CarService;

    public CarController(CarService carService){
        this.CarService = carService;
    }

    public void addCar(Car car){
        CarService.addCar(car);
    }

    public List<Car> getAvailableCars(LocalDate startDate , LocalDate endDate){
        return CarService.getAvailableCars(startDate,endDate);
    }

    public List<Car> getAllCars(){
        return CarService.getAllCars();
    }

    public Car findCarById(int id){
        return  CarService.findCarById(id);
    }

    public void ModifyCar(Car car){
        CarService.ModifyCar(car);
    }
}
