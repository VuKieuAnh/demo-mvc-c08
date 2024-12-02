package com.example.servertime2.DAO;

import com.example.servertime2.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CustomerDAO implements ICustomerDAO {
    private static final String URLDB = "jdbc:mysql://localhost:3306/jdbcc08";
    private static final String USERDB = "root";
    private static final String PASSWORD = "123456@Abc";
    private static final String CREATE_CUSTOMER = "insert into customer(name, phone, email) VALUES (?, ?, ?);";

    @Override
    public List<Customer> findAll() {
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from customer;");
            ResultSet resultSet = statement.executeQuery();
            List<Customer> customers = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString(4);
                String phone = resultSet.getString("phone");
                Customer customer = new Customer(id, name, email, phone);
                customers.add(customer);
            }
            return customers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        return new ArrayList<>();
    }

//    connection dung
    private Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URLDB, USERDB, PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(Customer customer) {
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE_CUSTOMER);
            String name = customer.getName();
            String phone = customer.getPhone();
            String email = customer.getEmail();
            statement.setString(1, name);
            statement.setString(2, phone);
            statement.setString(3, email);
            int update = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

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
