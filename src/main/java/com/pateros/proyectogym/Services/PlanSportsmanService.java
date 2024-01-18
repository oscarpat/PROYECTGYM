package com.pateros.proyectogym.Services;

import com.pateros.proyectogym.Entities.PlanSportsman;
import com.pateros.proyectogym.Repository.PlanSportsmanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PlanSportsmanService {

    @Autowired
    private PlanSportsmanRepository planSportsmanRepository;


    public List<PlanSportsman> getAllPlanSportsman(){
        return planSportsmanRepository.findAll();
    }

    public PlanSportsman createPlanSportsman(PlanSportsman planSportsman){
        return planSportsmanRepository.save(planSportsman);
    }


    public void deletePlanSportsman(Long IdPSportsman){
        planSportsmanRepository.deleteById(IdPSportsman);
    }
}
