package com.pateros.proyectogym.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Sportsman")
public class Sportsman {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IDSportsman;
    private Long DocumentTypeID;
    private String Document;
    private  String Names;
    private  String Surnames;
    private  String Address;
    private  String CellPhone;
    private  String Email;
    private  String BirthDate;
    private String UserName;
    private Boolean State;
}
