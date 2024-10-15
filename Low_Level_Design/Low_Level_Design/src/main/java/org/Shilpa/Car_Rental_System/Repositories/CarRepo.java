package org.Shilpa.Car_Rental_System.Repositories;

import org.Shilpa.Car_Rental_System.Model.Car;

import java.time.LocalDate;
import java.util.List;

public interface CarRepo {
       void addCar(Car car);
       void updateCar(Car updateCar);
       Car getCarById(int carId);
       List<Car> getAllCars();
       List<Car> getAvailableCars(LocalDate startDate, LocalDate endDate);

}
