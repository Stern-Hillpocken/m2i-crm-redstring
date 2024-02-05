package com.example.crmredstring.controller;

import com.example.crmredstring.dto.OrderDTO;
import com.example.crmredstring.model.Order;
import com.example.crmredstring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService service;

    @GetMapping
    public List<Order> getAll() {
        return service.getAll();
    }

    @PostMapping
    public void add(@RequestBody OrderDTO orderDTO) {
        service.add(orderDTO);
    }

    @PutMapping("/{id}")
    public void put(@PathVariable int id, @RequestBody OrderDTO orderDTO) {
        service.put(id, orderDTO);
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable int id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }
}
