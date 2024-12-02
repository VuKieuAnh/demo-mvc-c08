package com.example.servertime2.DAO;

import com.example.servertime2.model.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
