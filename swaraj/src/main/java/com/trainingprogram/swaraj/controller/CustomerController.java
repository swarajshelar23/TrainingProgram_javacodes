package com.trainingprogram.swaraj.controller;

import com.trainingprogram.swaraj.entity.Customer;
import com.trainingprogram.swaraj.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping
    public List<Customer> getAllCustomer(){
        return service.getAllCustomer();
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer){
        return service.SaveCustomer(customer);
    }


}
