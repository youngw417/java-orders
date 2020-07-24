package local.youngw417.javaorders.controllers;

//        http://localhost:2019/customers/orders
//        http://localhost:2019/customers/customer/7
//        http://localhost:2019/customers/customer/77
//        http://localhost:2019/customers/namelike/mes
//        http://localhost:2019/customers/namelike/cin
//        http://localhost:2019/customers/orders/count

import local.youngw417.javaorders.models.Customer;
import local.youngw417.javaorders.services.CustomerServices;
import local.youngw417.javaorders.views.OrderCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpClient;
import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerServices customerService;

    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> getAllOrders(){
        List<Customer> myCustomers = customerService.getAllOrders();
        return new ResponseEntity<>(myCustomers, HttpStatus.OK);

    }

    @GetMapping(value = "/customer/{custid}", produces = "application/json")
    public ResponseEntity<?> getCustomerById(@PathVariable long custid){

        Customer myCustomer = customerService.getCustomerById(custid);
        return new ResponseEntity<>(myCustomer, HttpStatus.OK);

    }

    @GetMapping(value = "/namelike/{subname}", produces = "application/json")
    public ResponseEntity<?> findNameLike(@PathVariable String subname){
        List<Customer> myCustomers = customerService.findByNameLike(subname);
        return new ResponseEntity<>(myCustomers, HttpStatus.OK);
    }

    @GetMapping(value = "/orders/count", produces = "application/json")
    public ResponseEntity<?> getOrderCounts(){
        // name order_count
        List<OrderCount> myCount = customerService.getOrderCounts();
        return new ResponseEntity<>(myCount, HttpStatus.OK);
    }

}
