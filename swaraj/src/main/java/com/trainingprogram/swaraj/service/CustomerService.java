package com.trainingprogram.swaraj.service;

import org.springframework.stereotype.Service;
import com.trainingprogram.swaraj.entity.Customer;
import com.trainingprogram.swaraj.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;



    public List<Customer> getAllCustomer(){
        return repository.findAll();
    }

    public Customer SaveCustomer(Customer customer){
        return repository.save(customer);
    }

    public Customer getCustomerById(Long id){
        return repository.findById(id).orElse(null);
    }

    public Customer getCustomerByEmail(String email){
        return repository.findByEmail(email).orElse(null);
    }

    public List<Customer> getCustomerByCity(String city){
        return repository.findByCity(city);
    }

    public List<Customer> getCustomerByAge(Integer age){
        return repository.findByAgeGreaterThan(age);
    }





}
