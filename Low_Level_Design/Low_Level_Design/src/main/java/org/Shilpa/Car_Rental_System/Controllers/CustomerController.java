package org.Shilpa.Car_Rental_System.Controllers;

import org.Shilpa.Car_Rental_System.Model.Customer;
import org.Shilpa.Car_Rental_System.Services.CustomerService;

import java.util.List;

public class CustomerController {

    private final CustomerService CustomersService;

    public CustomerController(CustomerService customerService){
        this.CustomersService = customerService;
    }

    public void addCustomer(Customer customer){
        CustomersService.addCustomer(customer);
    }

    public List<Customer> getAllCustomers(){
        return CustomersService.getAllCustomers();
    }

    public void removeCustomerById(int id){
        CustomersService.removeCustomerById(id);
    }

    //findCustomerById
    public Customer findCustomerById(int id){
        return CustomersService.findCustomerById(id);
    }
}
