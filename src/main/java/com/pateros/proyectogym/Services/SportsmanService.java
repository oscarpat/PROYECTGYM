package com.pateros.proyectogym.Services;


import com.pateros.proyectogym.Entities.Sportsman;
import com.pateros.proyectogym.Repository.SportsmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SportsmanService {

    @Autowired
    SportsmanRepository sportsmanRepository;

    public List<Sportsman> getAllSportsman(){
       return sportsmanRepository.findAll();
    }

    public Sportsman createSportsman(Sportsman sportsman){
        return sportsmanRepository.save(sportsman);
    }

    public void deleteSportsman(Long id){
        sportsmanRepository.deleteById(id);
    }
}
