package com.example.customer.controller;

import com.example.customer.entity.Customer;
import com.example.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer){
        log.info("save customer start CustomerController");
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable("id") Long customerId){
        log.info("findCustomerById start CustomerController");
        return customerService.findCustomerById(customerId);
    }
}
