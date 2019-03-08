package com.realEstateBoard.services;

import com.house.entities.HouseInNewComplex;
import com.realEstateBoard.entities.Poster;

import java.util.List;

public interface RealEstateBoardService {

    void addPoster(Poster poster);
    void deletePosterByID(Poster poster);
    Poster updatePosterById(Poster poster);
    List<Poster> listOfPoster();
    Poster getPosterByID(int idPoster);

}
