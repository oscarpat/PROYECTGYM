package com.pateros.proyectogym.Repository;

import com.pateros.proyectogym.Entities.PlanSportsman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PlanSportsmanRepository extends JpaRepository<PlanSportsman, Long> {

}
