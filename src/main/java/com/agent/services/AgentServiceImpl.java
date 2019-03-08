package com.agent.services;

import com.agent.dao.AgentDAO;
import com.agent.entities.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AgentServiceImpl implements AgentService{

    @Autowired
    AgentDAO agentDAO;

    @Autowired
    public void setAgentDAO(AgentDAO agentDAO) {
        this.agentDAO = agentDAO;
    }

    @Transactional
    public void addAgent(Agent agent) {
        agentDAO.addAgent(agent);
    }

    @Transactional
    public Agent updateAgentByID(Agent agent) {
        return agentDAO.updateAgentByID(agent);
    }

    @Transactional
    public void deleteAgentByID(Agent agent) {
        agentDAO.updateAgentByID(agent);

    }

    @Transactional
    public List<Agent> listAgent() {
        return agentDAO.listAgent();
    }
}
