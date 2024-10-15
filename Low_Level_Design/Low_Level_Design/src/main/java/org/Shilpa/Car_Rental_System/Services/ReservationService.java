package org.Shilpa.Car_Rental_System.Services;

import org.Shilpa.Car_Rental_System.Model.Reservation;
import org.Shilpa.Car_Rental_System.Repositories.ReservationRepo;

public class ReservationService {

    private final ReservationRepo ReservationRepo;

    public ReservationService(ReservationRepo reservationRepo){
        this.ReservationRepo = reservationRepo;
    }

    public Reservation CreateReservation(Reservation reservation){
        return ReservationRepo.createReservation(reservation);
    }

    public void CancelReservation(int reservationId){
        ReservationRepo.cancelReservation(reservationId);
    }

    public Reservation GetReservationById(int reservationId){
        return ReservationRepo.getReservationById(reservationId);
    }
}
