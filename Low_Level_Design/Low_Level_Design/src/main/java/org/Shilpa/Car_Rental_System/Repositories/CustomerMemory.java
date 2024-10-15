package org.Shilpa.Car_Rental_System.Repositories;

import org.Shilpa.Car_Rental_System.Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerMemory implements CustomerRepo{
    private final List<Customer> Customers = new ArrayList<>();

    @Override
    public void addCustomer(Customer customer) {
         this.Customers.add(customer);
         System.out.println("Customer Added successfully.");
    }

    @Override
    public List<Customer> getAllCustomers() {
        return Customers;
    }

    @Override
    public Customer findCustomerById(int customerId) {
        for (Customer customer : Customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        System.out.println("Customer with ID:" + customerId+ " not found.");
        return null;
    }

    @Override
    public void removeCustomerById(int customerId) {
        boolean isRemoved = Customers.removeIf(customer -> customer.getCustomerId() == customerId);
        if (isRemoved) {
            System.out.println("Customer removed successfully.");
        } else {
            System.out.println("Customer with ID " + customerId + " not found.");
        }
    }

    @Override
    public void updateCustomer(Customer updateCustomer) {
        for(Customer customer :Customers){
            if(customer.getCustomerId() == updateCustomer.getCustomerId()){
                customer.setName(updateCustomer.getName());
                customer.setNumber(updateCustomer.getNumber());
                customer.setDrivingLicense(updateCustomer.getDrivingLicense());
                System.out.println("Customer Updated successfully.");
                return;
            }
        }
        System.out.println("Customer with ID " + updateCustomer.getCustomerId() + " not found.");
    }
}

