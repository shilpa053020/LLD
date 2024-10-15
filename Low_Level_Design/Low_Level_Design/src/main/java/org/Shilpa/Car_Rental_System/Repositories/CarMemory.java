package org.Shilpa.Car_Rental_System.Repositories;
import org.Shilpa.Car_Rental_System.Model.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarMemory  implements CarRepo{
    private final List<Car> Cars = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        Cars.add(car);
    }

    @Override
    public void updateCar(Car updateCar) {
           for(Car car:Cars){
               if(car.getCarId() == updateCar.getCarId()){
                   car.setModel(updateCar.getModel());
                   car.setYear(updateCar.getYear());
                   car.setLicensePlate(updateCar.getLicensePlate());
                   car.setPerDayPrice(updateCar.getPerDayPrice());
                   //cars.remove(updatedcar)
                   //cars.add(updatedcar)
                   return;
               }
           }
           System.out.println("Car with ID " + updateCar.getCarId() + " not found.");
    }

    @Override
    public List<Car> getAvailableCars(LocalDate startDate, LocalDate endDate) {
            List<Car> AvailableCars = new ArrayList<>();
            for(Car car: Cars){
                if(isCarAvailable(car,startDate,endDate)){
                    AvailableCars.add(car);
                }
            }
            return AvailableCars;
    }

    private Boolean isCarAvailable(Car car ,LocalDate startDate,LocalDate endDate){
        for(LocalDate BookedDates: car.getBookedDates()){
            if(!BookedDates.isBefore(startDate) && !BookedDates.isAfter(endDate)){
                return false;
            }
        }
        return true;

    }

    @Override
    public List<Car> getAllCars() {
        return Cars;
    }

    @Override
    public Car getCarById(int carId) {
        for(Car car:Cars){
            if(car.getCarId() == carId){
                return car;
            }
        }
        System.out.println("Car ID :" + carId + " not found.");
        return null;
    }


}

