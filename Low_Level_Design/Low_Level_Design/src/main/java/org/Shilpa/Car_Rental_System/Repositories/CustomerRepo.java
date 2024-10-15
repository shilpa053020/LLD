package org.Shilpa.Car_Rental_System.Repositories;

import org.Shilpa.Car_Rental_System.Model.Customer;

import java.util.List;

public interface CustomerRepo {
    void addCustomer(Customer customer);
    void removeCustomerById(int customerId);
    Customer findCustomerById(int customerId);
    List<Customer> getAllCustomers();
    void updateCustomer(Customer updateCustomer);
}
