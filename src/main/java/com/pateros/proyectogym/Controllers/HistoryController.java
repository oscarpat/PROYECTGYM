package com.pateros.proyectogym.Controllers;

import com.pateros.proyectogym.Entities.HistorySportsman;
import com.pateros.proyectogym.Services.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoryController {

    @Autowired
    private HistoryService historyService;


    @GetMapping("/verhistory")
    public List<HistorySportsman> gelAllHistorySportsman(){
        return historyService.getAllHistorySportsman();
    }

    @PostMapping("/history")
    public HistorySportsman createHistorySportsman(@RequestBody HistorySportsman historySportsman){
        return historyService.createHistorySportsman(historySportsman);
    }

    @DeleteMapping("/eliminahistoria/{IdHSportsman}")
    public void deleteHistorySportsman(@PathVariable Long IdHSportsman){
        historyService.deleteHistorySportsman(IdHSportsman);
    }
}
