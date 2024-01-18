package com.pateros.proyectogym.Repository;

import com.pateros.proyectogym.Entities.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PlanRepository extends JpaRepository<PlanEntity, Long> {
}
