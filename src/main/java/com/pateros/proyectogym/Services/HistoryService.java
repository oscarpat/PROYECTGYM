package com.pateros.proyectogym.Services;

import com.pateros.proyectogym.Entities.HistorySportsman;
import com.pateros.proyectogym.Repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public List<HistorySportsman> getAllHistorySportsman(){
        return historyRepository.findAll();
    }


    public HistorySportsman createHistorySportsman(HistorySportsman historySportsman){
        return historyRepository.save(historySportsman);
    }

    public void deleteHistorySportsman(Long IdHSportsman){
        historyRepository.deleteById(IdHSportsman);
    }
}
