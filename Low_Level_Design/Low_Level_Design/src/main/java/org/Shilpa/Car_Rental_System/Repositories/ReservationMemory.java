package org.Shilpa.Car_Rental_System.Repositories;
import org.Shilpa.Car_Rental_System.Model.Car;
import org.Shilpa.Car_Rental_System.Model.Reservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationMemory implements ReservationRepo{
     private final List<Reservation> ReservationList = new ArrayList<>();

    @Override
    public Reservation createReservation(Reservation reservation) {

        LocalDate startDate  = reservation.getStartDate();
        LocalDate endDate = reservation.getEndDate();
        //Check the dates
        if(startDate.isBefore(LocalDate.now()) || endDate.isBefore(LocalDate.now())){
            System.out.println("Reservation failed: Start date cannot be in the past.");
            return null;
        }

        //check the dates are available for the startdate and enddate
        Car car = reservation.getCar();
//        car.isAvailable(startDate, endDate);
        LocalDate date = startDate;
        while(!date.isAfter(endDate)){
            if(car.getBookedDates().contains(date)){
                System.out.println("Date conflict: " + date + " is already booked.");
                return null;
            }
            date = date.plusDays(1);
        }
        //Add the dates to car(bookeddates)
        date = startDate;
        while(!date.isAfter(endDate)){
            car.getBookedDates().add(date);
            date = date.plusDays(1);
        }

        ReservationList.add(reservation);
        return  reservation;
    }

    @Override
    public Reservation getReservationById(int reservationId) {
        for(Reservation reserve: ReservationList){
            if(reserve.getReserveId() == reservationId){
                return reserve;
            }
        }
        System.out.println("Reservation Id: " + reservationId + " Not found.");
        return null;
    }

    @Override
    public void cancelReservation(int reservationId) {
        boolean isCanceled = ReservationList.removeIf(reservation -> reservation.getReserveId() == reservationId);
        if (isCanceled) {
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Reservation ID: " + reservationId + " not found.");
        }
    }


}














































