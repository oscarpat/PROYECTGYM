package com.pateros.proyectogym.Services;

import com.pateros.proyectogym.Entities.PlanEntity;
import com.pateros.proyectogym.Repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    @Autowired
    private PlanRepository planRepository;

    public List<PlanEntity> getAllPlanEntity(){
        return planRepository.findAll();
    }

    public PlanEntity createPlanEntity(PlanEntity planEntity){
        return planRepository.save(planEntity);
    }


    public void deletePlanEntity(Long IDPlan){
        planRepository.deleteById(IDPlan);
    }
}
