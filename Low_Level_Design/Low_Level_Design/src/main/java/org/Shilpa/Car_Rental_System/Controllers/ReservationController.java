package org.Shilpa.Car_Rental_System.Controllers;

import org.Shilpa.Car_Rental_System.Model.Reservation;
import org.Shilpa.Car_Rental_System.Repositories.ReservationRepo;
import org.Shilpa.Car_Rental_System.Services.ReservationService;

public class ReservationController {
    private final ReservationService ReservationService;

    public ReservationController(ReservationService reservationService){
        this.ReservationService = reservationService;
    }

    public Reservation CreateReservation(Reservation reservation){
        return ReservationService.CreateReservation(reservation);
    }

    public void CancelReservation(int reservationId){
        ReservationService.CancelReservation(reservationId);
    }

    public Reservation GetReservationById(int reservationId){
        return ReservationService.GetReservationById(reservationId);
    }
}
