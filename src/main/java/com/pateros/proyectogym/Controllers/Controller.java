package com.pateros.proyectogym.Controllers;

import com.pateros.proyectogym.Entities.Sportsman;
import com.pateros.proyectogym.Services.SportsmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private SportsmanService sportsmanService;


    @GetMapping("/mostrardeportista")
    public List<Sportsman> getAllSportsman(){
      return sportsmanService.getAllSportsman();
    }

    @PostMapping("/creardeportista")
    public Sportsman createSportsman(@RequestBody Sportsman sportsman){
        return sportsmanService.createSportsman(sportsman);
    }

    @DeleteMapping("/eliminardeportista/{IDSportsman}")
    public void deleteSportsman(@PathVariable Long IDSportsman){
        sportsmanService.deleteSportsman(IDSportsman);
    }

}
