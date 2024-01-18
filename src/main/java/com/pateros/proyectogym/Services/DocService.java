package com.pateros.proyectogym.Services;

import com.pateros.proyectogym.Entities.DocEntity;
import com.pateros.proyectogym.Repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocService {

    @Autowired
    private DocRepository docRepository;

    public List<DocEntity> getAllDocEntity(){
        return docRepository.findAll();
    }


    public DocEntity createDocEntity(DocEntity docEntity){
        return docRepository.save(docEntity);
    }


    public void deleteDocEntity(Long IDDocumentType){
        docRepository.deleteById(IDDocumentType);
    }
}
