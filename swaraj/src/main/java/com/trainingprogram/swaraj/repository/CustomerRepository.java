package com.trainingprogram.swaraj.repository;

import com.trainingprogram.swaraj.entity.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    
    Optional<Customer> findByEmail(String email);
    List<Customer> findByCity(String city);
    List<Customer> findByAgeGreaterThan(Integer age);



}