package org.Shilpa;

import org.Shilpa.Car_Rental_System.Controllers.CarController;
import org.Shilpa.Car_Rental_System.Controllers.CustomerController;
import org.Shilpa.Car_Rental_System.Controllers.ReservationController;
import org.Shilpa.Car_Rental_System.Model.Car;
import org.Shilpa.Car_Rental_System.Model.Customer;
import org.Shilpa.Car_Rental_System.Model.Reservation;
import org.Shilpa.Car_Rental_System.Repositories.*;
import org.Shilpa.Car_Rental_System.Services.CarService;
import org.Shilpa.Car_Rental_System.Services.CustomerService;
import org.Shilpa.Car_Rental_System.Services.ReservationService;

import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CarRepo carRepository = new CarMemory();
        CustomerRepo customerRepository = new CustomerMemory();
        ReservationRepo reservationRepository = new ReservationMemory();

        // Initialize services
        CarService carService = new CarService(carRepository);
        CustomerService customerService = new CustomerService(customerRepository);
        ReservationService reservationService = new ReservationService(reservationRepository);


        // Initialize controllers
        CarController carController = new CarController(carService);
        CustomerController customerController = new CustomerController(customerService);
        ReservationController reservationController = new ReservationController(reservationService);

        Customer customer1 = new Customer("John Doe", 1234567890, "D123456789");
        Customer customer2 = new Customer("Don", 238923811, "sa982384s");
        customerController.addCustomer(customer1);
        customerController.addCustomer(customer2);
        // Get all customers and print them
        List<Customer> customers = customerController.getAllCustomers();
//        System.out.println("AllCustomers : "+ "\n" +customers.toString());

        Car Car1 = new Car("BMW",9192,"3492",1000);
        Car Car2 = new Car("Audi",2023,"D0383",2000);

        carController.addCar(Car1);
        carController.addCar(Car2);

        List<Car> cars = carController.getAllCars();
        //System.out.println("AllCars : "+ "\n" + cars.toString());

        LocalDate startDateR1 = LocalDate.of(2024,9,15);
        LocalDate endDateR1 = LocalDate.of(2024,9,17);

        List<Car> carList = carController.getAvailableCars(startDateR1,endDateR1);
        System.out.println("Available Cars : "+ "\n" + carList.toString());

        Reservation reserve1 = new Reservation(startDateR1,endDateR1,1,customer1,carRepository);
        Reservation reserved1 = reservationController.CreateReservation(reserve1);
        System.out.println(reserved1);

        LocalDate startDateR2 = LocalDate.of(2024,9,16);
        LocalDate endDateR2 = LocalDate.of(2024,9,16);

        Reservation reserve2 = new Reservation(startDateR2,endDateR2,2,customer2,carRepository);
        Reservation reserved2 = reservationController.CreateReservation(reserve2);
        System.out.println(reserved2);

        List<Car> carList1 = carController.getAvailableCars(startDateR1,endDateR1);
        System.out.println("Available Cars : "+ "\n" + carList1.toString());















    }
}