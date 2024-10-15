package org.Shilpa.Car_Rental_System.Model;

import org.Shilpa.Car_Rental_System.Repositories.CarMemory;
import org.Shilpa.Car_Rental_System.Repositories.CarRepo;

import java.time.LocalDate;

public class Reservation {
    private static int  Id = 201;
    private int ReserveId ;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private Car Car;
    private Customer Customer;
    private int TotalPrice;

    public Reservation(LocalDate startDate, LocalDate endDate, int  carId, Customer customer, CarRepo carRepo){
        this.ReserveId = Id++;
        this.Customer = customer;
        this.Car = carRepo.getCarById(carId) ;
        this.StartDate = startDate;
        this.EndDate = endDate;
        this.TotalPrice = calculateTotalPrice();

    }


    private int calculateTotalPrice(){
        long days = StartDate.until(EndDate).getDays();
        return (int) (days+1) * Car.getPerDayPrice();
    }
    public LocalDate getStartDate() {
        return StartDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public Car getCar() {
        return Car;
    }

    public void setCar(Car car) {
        Car = car;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public int getReserveId() {
        return ReserveId;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    public void setReserveId(int reserveId) {
        ReserveId = reserveId;
    }

    @Override
    public String toString() {
        return "\n"+"Reservation:"+"\n"+"{" +
                "ReserveId=" + ReserveId +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", TotalPrice=" + TotalPrice +
                "}"+"\n"+
                " Car:" + Car +
                "\n"+
                "Customer:" + Customer +
                "}"+"\n"+
                '}'+"\n";
    }
}
