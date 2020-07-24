package local.youngw417.javaorders.services;


import local.youngw417.javaorders.models.Order;
import local.youngw417.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "orderService")
public class OrderServicesImpl implements OrderServices {

    @Autowired
    private OrderRepository ordersrepos;

    @Transactional
    @Override
    public Order save(Order order) {
        return ordersrepos.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> myOrders = new ArrayList<>();
        ordersrepos.findAll().iterator().forEachRemaining(myOrders::add);
        return myOrders;
    }

    @Override
    public Order getOrderById(long id) {
        return ordersrepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Order id#" + id + " is not found."));
    }
}
