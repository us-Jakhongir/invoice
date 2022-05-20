package com.example.appinvoice.service.impl;

import com.example.appinvoice.controller.CustomerController;
import com.example.appinvoice.repository.CustomerRepository;
import com.example.appinvoice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {


    final CustomerRepository customerRepository;


    @Override
    public List<CustomerController> getAllCustomersWithoutOrders(String year) {
        customerRepository.getAllWithoutOrders(year + "-01-01", year + "-12-01");
        return null;
    }
}
