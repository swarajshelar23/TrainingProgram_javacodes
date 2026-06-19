package com.trainingprogram.swaraj.repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.trainingprogram.swaraj.entity.Order;



@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
    @Query("SELECT COUNT(o) FROM Order o WHERE o.customer.customerId = :customerId")
    Long countOfOrders();

    @Query("SELECT SUM(o.totalPrice) FROM Order o WHERE o.customer.customerId = :customerId")
    Double totalAmount(Long customerId);

    @Query("SELECT SUM(o.totalPrice) FROM Order o")
    double totalRevenue();

}
