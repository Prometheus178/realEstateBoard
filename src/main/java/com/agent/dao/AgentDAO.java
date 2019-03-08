package com.agent.dao;

import com.agent.entities.Agent;

import java.util.List;

public interface AgentDAO {

    void addAgent(Agent agent);
    Agent updateAgentByID(Agent agent);
    void deleteAgentByID(Agent agent);
    List<Agent> listAgent();
}
