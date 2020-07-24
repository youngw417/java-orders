package local.youngw417.javaorders.services;

import local.youngw417.javaorders.models.Customer;
import local.youngw417.javaorders.views.OrderCount;

import java.util.List;

public interface CustomerServices {
    Customer save(Customer customer);

    List<Customer> getAllOrders();
    Customer getCustomerById(long custid);
    List<Customer> findByNameLike(String subname);
    List<OrderCount> getOrderCounts();
}
