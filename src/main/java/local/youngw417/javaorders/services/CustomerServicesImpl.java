package local.youngw417.javaorders.services;

import local.youngw417.javaorders.models.Customer;
import local.youngw417.javaorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
