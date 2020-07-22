package local.youngw417.javaorders.controllers;

import local.youngw417.javaorders.services.AgentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgnetController {

    @Autowired
    private AgentServices employeeService;

}
