package org.Shilpa.Car_Rental_System.Services;

import org.Shilpa.Car_Rental_System.Model.Car;
import org.Shilpa.Car_Rental_System.Repositories.CarMemory;
import org.Shilpa.Car_Rental_System.Repositories.CarRepo;

import java.time.LocalDate;
import java.util.List;

public class CarService {
    private final CarRepo CarRepository;

    public CarService(CarRepo carRepository){
        this.CarRepository = carRepository;
    }

    public void addCar(Car car){
        CarRepository.addCar(car);
    }

    public List<Car> getAvailableCars(LocalDate startDate , LocalDate endDate){
        return CarRepository.getAvailableCars(startDate,endDate);
    }

    public List<Car> getAllCars(){
        return CarRepository.getAllCars();
    }

    public Car findCarById(int id){
        return  CarRepository.getCarById(id);
    }

    public void ModifyCar(Car car){
        CarRepository.updateCar(car);
    }



}
