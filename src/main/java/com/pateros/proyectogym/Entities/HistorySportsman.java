package com.pateros.proyectogym.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "HistorySportsman")
public class HistorySportsman {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdHSportsman;
    private Long IDSportsman;
    private Long Coach;
    private Date Date;
    private Float Weight;
    private Float Height;
    private Float BodyMassIndex;
    private Float ArmDiameter;
    private Float LegDiameter;
    private Float WaistDiameter;
    private Float AbdomenDiameter;
    private Float ChestDiameter;

}
