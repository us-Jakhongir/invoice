package com.example.appinvoice.service;

import com.example.appinvoice.controller.CustomerController;

import java.util.List;

public interface CustomerService {
    List<CustomerController> getAllCustomersWithoutOrders(String year);
}
