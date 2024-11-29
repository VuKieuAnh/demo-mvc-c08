package com.example.servertime2.controller;

import com.example.servertime2.model.Customer;
import com.example.servertime2.service.CustomerService;
import com.example.servertime2.service.ICustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerController", urlPatterns = "/customers")
public class CustomerController extends HttpServlet {
    private final ICustomerService customerService = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Danh sach khach hang");
//        action = null -> danh sachs
//        action = create -> tao moi
        String action = req.getParameter("action");
        action = action==null?"":action;
        switch (action) {
            case "create":
                showFormCreate(req, resp);
                break;
            default:
                showAllCustomer(req,resp);

        }

    }

    private static void showFormCreate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/create.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void showAllCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //        goi service de lay du lieu len
        List<Customer> list = customerService.findAll();
//        day du lieu sang view
        req.setAttribute("ds", list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/customers.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        lay tham so tu request
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        Customer customer = new Customer(id, name, phone, email);
//        them moi - goi service de them moi
        customerService.save(customer);
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/customers.jsp");
        resp.sendRedirect( "/customers");

    }
}
