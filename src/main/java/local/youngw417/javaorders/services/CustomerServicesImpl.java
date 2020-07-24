package local.youngw417.javaorders.services;

import local.youngw417.javaorders.models.Customer;
import local.youngw417.javaorders.repositories.CustomerRepository;
import local.youngw417.javaorders.views.OrderCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerService")
public class CustomerServicesImpl implements CustomerServices{

    @Autowired
    private CustomerRepository custrepos;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return custrepos.save(customer);
    }

    @Override
    public List<Customer> getAllOrders() {
        List<Customer> myList = new ArrayList<>();
        custrepos.findAll().iterator().forEachRemaining(myList::add);
        return myList;
    }

    @Override
    public Customer getCustomerById(long custid) {
        return custrepos.findById(custid).orElseThrow(() -> new EntityNotFoundException("Cusomter " + custid + " does not exist"));
    }

    @Override
    public List<Customer> findByNameLike(String subname) {
        return custrepos.findByCustnameContainingIgnoringCase(subname);
    }

    @Override
    public List<OrderCount> getOrderCounts() {
       return custrepos.getOrderCounts();
    }
}
