package com.pateros.proyectogym.Controllers;

import com.pateros.proyectogym.Entities.PlanEntity;
import com.pateros.proyectogym.Services.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PlanController {

    @Autowired
    private PlanService planService;


    @GetMapping("/mostrar2")
    public List<PlanEntity> getAllPlanEntity(){
        return planService.getAllPlanEntity();
    }

    @PostMapping("/create2")
    public PlanEntity createPlanEntity(@RequestBody PlanEntity planEntity){
        return planService.createPlanEntity(planEntity);
    }


    @DeleteMapping("/eliminar2/{IDPlan}")
    public void deletePlanEntity(@PathVariable Long IDPlan){
        planService.deletePlanEntity(IDPlan);
    }
}
