package org.Shilpa.Car_Rental_System.Services;

import org.Shilpa.Car_Rental_System.Model.Customer;
import org.Shilpa.Car_Rental_System.Repositories.CustomerRepo;

import java.util.List;

public class CustomerService {

    private final CustomerRepo CustomersRepo;

    public CustomerService(CustomerRepo customerRepo){
        this.CustomersRepo = customerRepo;
    }

    public void addCustomer(Customer customer){
        CustomersRepo.addCustomer(customer);
    }

    public List<Customer> getAllCustomers(){
        return CustomersRepo.getAllCustomers();
    }

    public void removeCustomerById(int id){
        CustomersRepo.removeCustomerById(id);
    }

    //findCustomerById
    public Customer findCustomerById(int id){
        return CustomersRepo.findCustomerById(id);
    }

    //updateCustomer
    public void updateCustomer(Customer customer){
        CustomersRepo.updateCustomer(customer);
    }


}
