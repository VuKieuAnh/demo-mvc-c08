package com.example.servertime2.service;

import com.example.servertime2.DAO.CustomerDAO;
import com.example.servertime2.DAO.ICustomerDAO;
import com.example.servertime2.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    private final ICustomerDAO customerDAO = new CustomerDAO();


    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerDAO.save(customer);
//        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
