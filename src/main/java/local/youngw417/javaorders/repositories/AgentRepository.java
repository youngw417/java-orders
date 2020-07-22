package local.youngw417.javaorders.repositories;

import local.youngw417.javaorders.models.Agent;
import local.youngw417.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent, Long> {

    interface CustomerRepository extends CrudRepository<Customer, Long> {
    }
}
