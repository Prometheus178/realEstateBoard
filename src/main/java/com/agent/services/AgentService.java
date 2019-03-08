package com.agent.services;

import com.agent.entities.Agent;

import java.util.List;

public interface AgentService {

    void addAgent(Agent agent);
    Agent updateAgentByID(Agent agent);
    void deleteAgentByID(Agent agent);
    List<Agent> listAgent();

}
