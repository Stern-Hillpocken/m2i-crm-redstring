package com.example.crmredstring.mapper;

import com.example.crmredstring.dto.OrderDTO;
import com.example.crmredstring.model.Order;

public class OrderMapper {

    public static Order dtoToOrder(OrderDTO dto) {
        Order order = new Order(dto.getTypePresta(), dto.getDesignation(), dto.getClient(), dto.getNbDays(), dto.getUnitPrice(), dto.getState());
        return order;
    }
}
