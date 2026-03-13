package com.adailtonlucena.desafio01.services;

import com.adailtonlucena.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return order.getBasic() - order.getDiscount() + shippingService.shipment(order);
    }

}
