package com.realEstateBoard.services;

import com.realEstateBoard.dao.RealEstateBoardDAO;
import com.realEstateBoard.entities.Poster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RealEstateBoardServiceImpl implements  RealEstateBoardService{

    @Autowired
    RealEstateBoardDAO realEstateBoardDAO;

    @Transactional
    public void addPoster(Poster poster) {
        realEstateBoardDAO.addPoster(poster);
    }

    @Transactional
    public void deletePosterByID(Poster poster) {
        realEstateBoardDAO.deletePosterByID(poster);
    }

    @Transactional
    public Poster updatePosterById(Poster poster) {
        return realEstateBoardDAO.updatePosterById(poster);
    }

    @Transactional
    public List<Poster> listOfPoster() {
        return realEstateBoardDAO.listOfPoster();
    }

    @Transactional
    public Poster getPosterByID(int idPoster) {
        return realEstateBoardDAO.getPosterByID(idPoster);
    }
}
