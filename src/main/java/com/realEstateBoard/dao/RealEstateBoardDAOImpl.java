package com.realEstateBoard.dao;

import com.house.entities.HouseInNewComplex;
import com.realEstateBoard.entities.Poster;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class RealEstateBoardDAOImpl implements RealEstateBoardDAO{

    @Autowired
    private SessionFactory sessionFactory;
    private ProjectionList posterProjection;

    public RealEstateBoardDAOImpl() {
        posterProjection = Projections.projectionList();
        posterProjection.add(Projections.property("idPoster"), "idPoster");
        posterProjection.add(Projections.property("dateTime"), "dateTime");
        posterProjection.add(Projections.property("title"),"title");
        posterProjection.add(Projections.property("district"),"district");
        posterProjection.add(Projections.property("dealType"), "dealType");
        posterProjection.add(Projections.property("price"), "price");
        posterProjection.add(Projections.property("square"),"square");
        posterProjection.add(Projections.property("numberOfRooms"),"numberOfRooms");
        posterProjection.add(Projections.property("photo"),"photo");

    }

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

        List<Poster> posters = createPosterList(createPosterCriteria());
        return posters;
    }

    @Override
    public Poster getPosterByID(int idPoster) {
        Session session = sessionFactory.getCurrentSession();
        Poster poster = (Poster) session.load(Poster.class, new Integer(idPoster));
        System.out.println(poster);
        return poster;
    }


    private DetachedCriteria createPosterCriteria(){
        DetachedCriteria posterListCriteria = DetachedCriteria.forClass(Poster.class,"p");
 //       createAliases(posterListCriteria);
        return posterListCriteria;
    }

//    for search by type

    private void createAliases(DetachedCriteria criteria){
//        criteria.createAlias("p.dealType","dealType");
//        criteria.createAlias("p.living","living");
//        criteria.createAlias("commercial", "commercial");

    }

//    sort by time

    private List<Poster> createPosterList(DetachedCriteria posterListCriteria){
        Criteria criteria = posterListCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
        criteria.addOrder(Order.asc("p.dateTime")).setProjection(posterProjection).setResultTransformer(Transformers.aliasToBean(Poster.class));
        return criteria.list();
    }
}
