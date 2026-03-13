package com.adailtonlucena.desafio01.services;

import com.adailtonlucena.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double frete = 0.00;

        if (order.getBasic() < 100.00){
            frete = 20.00;
        }

        else if (order.getBasic() <= 200.00){
            frete = 12.00;
        }

        return frete;
    }
}
