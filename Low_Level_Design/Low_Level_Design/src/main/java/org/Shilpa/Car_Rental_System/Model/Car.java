package org.Shilpa.Car_Rental_System.Model;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private  static int ID = 1;
    private  int CarId;
    private  String Model;
    private  int Year;
    private  String LicensePlate;
    private  int PerDayPrice;
    private List<LocalDate> BookedDates;


    public Car(String model, int year, String licensePlate, int perDayPrice) {
        this.CarId = ID++;
        this.Model = model;
        this.Year = year;
        this.LicensePlate = licensePlate;
        this.PerDayPrice = perDayPrice;
        this.BookedDates = new ArrayList<>();

    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public int getYear() {
        return Year;
    }

    public int getPerDayPrice() {
        return PerDayPrice;
    }

    public String getModel() {
        return Model;
    }

    public void setLicensePlate(String licensePlate) {
        this.LicensePlate = licensePlate;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setPerDayPrice(int perDayPrice) {
        PerDayPrice = perDayPrice;
    }

    public void setYear(int year) {
        Year = year;
    }

    public List<LocalDate> getBookedDates() {
        return BookedDates;
    }

    public void setBookedDates(List<LocalDate> bookedDates) {
        BookedDates = bookedDates;
    }

    public int getCarId() {
        return CarId;
    }

    public void setCarId(int carId) {
        CarId = carId;
    }

    @Override
    public String toString() {
        return "\n"+"{" +
                "CarId=" + CarId +
                ", Model='" + Model + '\'' +
                ", Year=" + Year +
                ", LicensePlate='" + LicensePlate + '\'' +
                ", PerDayPrice=" + PerDayPrice +
                '}';
    }
}

