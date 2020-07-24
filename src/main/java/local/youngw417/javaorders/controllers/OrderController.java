package local.youngw417.javaorders.controllers;

import local.youngw417.javaorders.models.Order;
import local.youngw417.javaorders.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//http://localhost:2019/orders/order/7
@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    private OrderServices orderService;

    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> getAllOrders(){
        List<Order> myOrders = orderService.getAllOrders();
        return new ResponseEntity<>(myOrders, HttpStatus.OK);
    }

    @GetMapping(value = "/order/{id}", produces = "application/json")
    public ResponseEntity<?> getOderById(@PathVariable long id){
        Order myorder = orderService.getOrderById(id);
        return new ResponseEntity<>(myorder, HttpStatus.OK);
    }
}
