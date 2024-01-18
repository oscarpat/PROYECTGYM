package com.pateros.proyectogym.Controllers;

import com.pateros.proyectogym.Entities.DocEntity;
import com.pateros.proyectogym.Services.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocController {

    @Autowired
    private DocService docService;


    @GetMapping("/ver2")
    public List<DocEntity> getAllDocEntity(){
       return docService.getAllDocEntity();
    }

    @PostMapping("/create")
    public DocEntity createDocEntity(@RequestBody DocEntity docEntity){
        return docService.createDocEntity(docEntity);
    }


    @DeleteMapping("/elimina/{IDDocumentType}")
    public void deleteDocEntity(@PathVariable Long IDDocumentType){
        docService.deleteDocEntity(IDDocumentType);
    }
}
