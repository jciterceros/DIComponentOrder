package com.jciterceros.DIComponentOrder.services;

import com.jciterceros.DIComponentOrder.entitites.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        return order.getBasic() - ((order.getDiscount() / 100) * order.getBasic()) + shippingService.shipment(order);
    }
}
