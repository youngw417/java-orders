package local.youngw417.javaorders.services;

import local.youngw417.javaorders.models.Agent;
import local.youngw417.javaorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Transactional
@Service(value="agentService")
public class AgentServicesImpl implements AgentServices {

    @Autowired
    private AgentRepository agentrepos;

    @Transactional
    @Override
    public Agent save(Agent agent) {
        return agentrepos.save(agent);
    }

    @Override
    public Agent getAgentById(long id) {
        return agentrepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Agent with ID#" + id + " is not found."));
    }
}
