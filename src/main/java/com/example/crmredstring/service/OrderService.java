package com.example.crmredstring.service;

import com.example.crmredstring.dto.OrderDTO;
import com.example.crmredstring.enums.OrderStateEnum;
import com.example.crmredstring.mapper.OrderMapper;
import com.example.crmredstring.model.Order;
import com.example.crmredstring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    public List<Order> getAll() {
        return repository.findAll();
    }

    public void add(OrderDTO orderDTO) {
        Order order = OrderMapper.dtoToOrder(orderDTO);
        repository.save(order);
    }

    public Order getById(int id) {
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Order's id: "+id+" not found.")
        );
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public void put(int id, OrderDTO orderDTO) {
        Order order = getById(id);
        order.setTypePresta(orderDTO.getTypePresta());
        order.setClient(orderDTO.getClient());
        order.setDesignation(orderDTO.getDesignation());
        order.setNbDays(orderDTO.getNbDays());
        order.setUnitPrice(orderDTO.getUnitPrice());
        order.setState(OrderStateEnum.valueOf(orderDTO.getState()).ordinal());
        repository.save(order);
    }
}
