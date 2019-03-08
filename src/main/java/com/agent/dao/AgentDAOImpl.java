package com.agent.dao;

import com.agent.entities.Agent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AgentDAOImpl implements AgentDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addAgent(Agent agent) {
        Session session = sessionFactory.getCurrentSession();
        session.save(agent);
    }

    @Override
    public Agent updateAgentByID(Agent agent) {
        Session session = sessionFactory.getCurrentSession();
        session.update(agent);
        return agent;
    }

    @Override
    public void deleteAgentByID(Agent agent) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(agent);
    }

    @Override
    public List<Agent> listAgent() {
        Session session = sessionFactory.getCurrentSession();
        List<Agent> agentList = session.createQuery("from Agent").list();
        return agentList;
    }
}
