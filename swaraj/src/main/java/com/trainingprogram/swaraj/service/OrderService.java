package com.trainingprogram.swaraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainingprogram.swaraj.entity.Customer;
import com.trainingprogram.swaraj.entity.Order;
import com.trainingprogram.swaraj.entity.Product;
import com.trainingprogram.swaraj.repository.CustomerRepository;
import com.trainingprogram.swaraj.repository.OrderRepository;
import com.trainingprogram.swaraj.repository.ProductRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    public Order placeOrder(Long customerId, Long productId, int qty) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Customer not found"));


        if(customer != null) {
            Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
            

            if(product != null) {
                if(product.getQuantity() >= qty) {
                    product.setQuantity(product.getQuantity() - qty);
                    productRepository.save(product);

                    Order order = new Order();
                    order.setCustomer(customer);
                    order.setProduct(product);
                    order.setQuantity(qty);
                    order.setTotalPrice(product.getPrice() * qty);
                    product.setQuantity(product.getQuantity() - qty);
                    productRepository.save(product);
                    return orderRepository.save(order);
                } else {
                    throw new RuntimeException("Insufficient product quantity");
                }
            }
        }
        throw new RuntimeException("Customer not found");
    }



    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public void cancelOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public List<Customer> getCustomerByProductId(Long productId) {
        return orderRepository.findCustomerByProductId(productId);
    }

    public double getTotalRevenue() {
        return orderRepository.totalRevenue();
    }

    public Long getCountOfOrders(Long customerId) {
    return orderRepository.countOfOrders(customerId);
    }

    public Double getTotalAmount(Long customerId) {
        return orderRepository.totalAmount(customerId);
    }


}