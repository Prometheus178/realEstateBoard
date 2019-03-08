package com.realEstateBoard.dao;

import com.house.entities.HouseInNewComplex;
import com.realEstateBoard.entities.Poster;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RealEstateBoardDAOImpl implements RealEstateBoardDAO{

    @Autowired
    SessionFactory sessionFactory;


    @Autowired
    public void setSessionFactory(SessionFactory sessionF) {
        this.sessionFactory = sessionF;
    }

    @Override
    public void addPoster(Poster poster) {
        Session session = sessionFactory.getCurrentSession();
        session.save(poster);
    }

    @Override
    public void deletePosterByID(Poster poster) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(poster);

    }

    @Override
    public Poster updatePosterById(Poster poster) {
        Session session = sessionFactory.getCurrentSession();
        session.update(poster);
        return poster;
    }

    @Override
    public List<Poster> listOfPoster() {

        Session session = sessionFactory.getCurrentSession();
        List<Poster> list = session.createQuery("from Poster").list();
        return list;
    }

    @Override
    public Poster getPosterByID(int idPoster) {
        Session session = sessionFactory.getCurrentSession();
        Poster poster = (Poster) session.load(Poster.class, new Integer(idPoster));
        System.out.println(poster);
        return poster;
    }
}
