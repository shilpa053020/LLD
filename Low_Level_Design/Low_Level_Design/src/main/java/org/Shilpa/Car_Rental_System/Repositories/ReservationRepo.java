package org.Shilpa.Car_Rental_System.Repositories;

import org.Shilpa.Car_Rental_System.Model.Car;
import org.Shilpa.Car_Rental_System.Model.Customer;
import org.Shilpa.Car_Rental_System.Model.Reservation;

import java.time.LocalDate;

public interface ReservationRepo {
    Reservation createReservation(Reservation reservation);
    void cancelReservation(int reservationId);
    Reservation getReservationById(int reservationId);
}
