package local.youngw417.javaorders.repositories;

import local.youngw417.javaorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
