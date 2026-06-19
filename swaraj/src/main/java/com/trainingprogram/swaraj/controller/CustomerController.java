package com.trainingprogram.swaraj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainingprogram.swaraj.entity.Customer;
import com.trainingprogram.swaraj.service.CustomerService;

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

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return service.getCustomerById(id);
    }

    @GetMapping("/email/{email}")
    public Customer getCustomerByEmail(@PathVariable String email){
        return service.getCustomerByEmail(email);
    }

    @GetMapping("/city/{city}")
    public List<Customer> getCustomerByCity(@PathVariable String city){
        return service.getCustomerByCity(city);
    }

    @GetMapping("/age/{age}")
    public List<Customer> getCustomerByAge(@PathVariable Integer age){
        return service.getCustomerByAge(age);
    }

    @PostMapping("/list")
    public List<Customer> saveCustomerList(@RequestBody List<Customer> customers){
        return service.SaveCustomerList(customers);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer updatedCustomer) {
        return service.updateCustomer(id, updatedCustomer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        service.deleteCustomer(id);
        return "Customer deleted successfully";
    }




}
