package com.pateros.proyectogym.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DocumentType")
public class DocEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IDDocumentType;
    private String Description;
    private Boolean State;
}
