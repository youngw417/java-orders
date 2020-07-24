package local.youngw417.javaorders.controllers;

import local.youngw417.javaorders.models.Agent;
import local.youngw417.javaorders.services.AgentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:2019/agents/agent/9
@RestController
@RequestMapping(value = "/agents")
public class AgentController {

    @Autowired
    private AgentServices agentService;

    @GetMapping(value = "/agent/{id}", produces = "application/json")
    public ResponseEntity<?> getAgentById(@PathVariable long id){
        Agent myagent = agentService.getAgentById(id);
        return new ResponseEntity<>(myagent, HttpStatus.OK);
    }
}
