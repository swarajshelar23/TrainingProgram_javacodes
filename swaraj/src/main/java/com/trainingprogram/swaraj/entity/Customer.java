package com.trainingprogram.swaraj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "SwiggyCustomer")

public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        
    
        private Long customerId;

       @Column(nullable = false)
        private String name;

        @Column(unique = true)
        private String email;

        private String city;

        private Integer age;

        @Column(unique = true)
        private String bankAccountNumber;

        @Column(unique = true)
        private Integer pin;
        

    public Customer() {
    }


        
        








}
