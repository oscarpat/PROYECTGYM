package com.pateros.proyectogym.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
@Entity
@Table(name = "Plan")
public class PlanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IDPlan;
    private String Name;
    private Boolean ForTime;
    private Integer NumberRepetitions;
    private Integer Worth;
    private Integer Expiration;
    private String Observations;
    private Boolean State;

}
