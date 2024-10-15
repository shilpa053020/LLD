package org.Shilpa.Car_Rental_System.Model;

public class Customer {
    private static int id = 101;
    private int CustomerId;
    private String Name;
    private int Number;
    private String DrivingLicense;

    public Customer (String name,int number,String drivingLicense){
         this.CustomerId = id++;
         this.Name = name;
         this.Number = number;
         this.DrivingLicense = drivingLicense;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public String getDrivingLicense() {
        return DrivingLicense;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public int getNumber() {
        return Number;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public void setDrivingLicense(String drivingLicense) {
        DrivingLicense = drivingLicense;
    }

    private static int getId() {
        return id;
    }

    private static void setId(int id) {
        Customer.id = id;
    }

    @Override
    public String toString() {
        return "\n"+"{"+
                "  CustomerId=" + CustomerId  +
                "  Name='" + Name +
                "  Number=" + Number +
                "  DrivingLicense='" + DrivingLicense +
                "}";
    }
}
