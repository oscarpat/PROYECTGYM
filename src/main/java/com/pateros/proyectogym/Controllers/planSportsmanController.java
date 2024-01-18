package com.pateros.proyectogym.Controllers;

import com.pateros.proyectogym.Entities.PlanSportsman;
import com.pateros.proyectogym.Services.PlanSportsmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class planSportsmanController {

    @Autowired
    private PlanSportsmanService planSportsmanService;

    @GetMapping("/saluda")
    public String salud(){
        return "hola amigo";
    }
    @GetMapping("/getPlanSportsman")
    public List<PlanSportsman> getAllPlanSportsman(){
        return planSportsmanService.getAllPlanSportsman();
    }


    @PostMapping("/cre")
    public PlanSportsman createPlanSportsman(@RequestBody PlanSportsman planSportsman){
        return planSportsmanService.createPlanSportsman(planSportsman);
    }

    @DeleteMapping("/deleteps/{IdPSportsman}")
    public void deletePlanSportsman(@PathVariable Long IdPSportsman){
        planSportsmanService.deletePlanSportsman(IdPSportsman);
    }
}
