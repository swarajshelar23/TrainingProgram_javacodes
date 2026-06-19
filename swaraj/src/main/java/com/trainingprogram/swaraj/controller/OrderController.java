package com.trainingprogram.swaraj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trainingprogram.swaraj.entity.Order;
import com.trainingprogram.swaraj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.trainingprogram.swaraj.entity.Customer;
import java.util.List;

@RestController
@RequestMapping("/orders")  
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/{customerId}/{productId}/{quantity}")
    public Order placeOrder(@PathVariable Long customerId, @PathVariable Long productId, @PathVariable int quantity) {
        return orderService.placeOrder(customerId, productId, quantity);
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Long orderId) {
        return orderService.getOrderById(orderId);
    }

    @DeleteMapping("/{orderId}")
    public void cancelOrder(@PathVariable Long orderId) {
        orderService.cancelOrder(orderId);
    }

    @GetMapping("/customers/product/{productId}")
    public List<Customer> getCustomerByProductId(@PathVariable Long productId) {
        return orderService.getCustomerByProductId(productId);
    }

    @GetMapping("/revenue")
    public double getTotalRevenue() {
        return orderService.getTotalRevenue();
    }

    @GetMapping("/count/{customerId}")
    public Long getCountOfOrders(@PathVariable Long customerId) {
        return orderService.getCountOfOrders(customerId);
    }   

    @GetMapping("/totalAmount/{customerId}")
    public Double getTotalAmount(@PathVariable Long customerId) {
        return orderService.getTotalAmount(customerId);
    }

}
