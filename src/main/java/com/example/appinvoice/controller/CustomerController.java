package com.example.appinvoice.controller;


import com.example.appinvoice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    final CustomerService customerService;


    @GetMapping("/customers_without_orders")
    public List<CustomerController> getAllCustomersWithoutOrders(@RequestParam("year") String year) {
        return customerService.getAllCustomersWithoutOrders(year);
    }


}
