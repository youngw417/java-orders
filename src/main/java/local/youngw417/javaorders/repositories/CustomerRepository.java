package local.youngw417.javaorders.repositories;

import local.youngw417.javaorders.models.Customer;
import local.youngw417.javaorders.views.OrderCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByCustnameContainingIgnoringCase(String subname);

    @Query(value = "SELECT c.custname as customers, count(o.ordnum) as order_count FROM customers c JOIN orders o ON o.custcode = c.custcode GROUP BY c.custcode ORDER BY order_count DESC", nativeQuery = true)
    List<OrderCount> getOrderCounts();
}
