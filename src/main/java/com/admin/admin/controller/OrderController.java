package com.admin.admin.controller;

import com.admin.admin.exception.OrderNotFoundException;
import com.admin.admin.model.Orderr;
import com.admin.admin.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/order")
    Orderr newOrder(@RequestBody Orderr newOrder) {
        return orderRepository.save(newOrder);
    }

    @GetMapping("/orders")
    List<Orderr> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/order/{id}")
    Orderr getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException(id));
    }

}
