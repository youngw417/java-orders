package local.youngw417.javaorders.services;

import local.youngw417.javaorders.models.Order;

import java.util.List;

public interface OrderServices {

    Order save(Order order);

    List<Order> getAllOrders();

    Order getOrderById(long id);
}
