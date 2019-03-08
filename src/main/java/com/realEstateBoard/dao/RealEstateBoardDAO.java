package com.realEstateBoard.dao;

import com.realEstateBoard.entities.Poster;

import java.util.List;

public interface RealEstateBoardDAO {

    void addPoster(Poster poster);
    void deletePosterByID(Poster poster);
    Poster updatePosterById(Poster poster);
    List<Poster> listOfPoster();
    Poster getPosterByID(int idPoster);
}
