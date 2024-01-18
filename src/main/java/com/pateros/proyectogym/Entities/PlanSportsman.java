package com.pateros.proyectogym.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "PlanSportsman")
public class PlanSportsman {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdPSportsman;
    private Long IDSportsman;
    private Long IDPlan;
    private Date DatePurchase;
    private Date DueDate;
    private Integer PendingUses;
}
