package com.pateros.proyectogym.Repository;

import com.pateros.proyectogym.Entities.Sportsman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SportsmanRepository extends JpaRepository<Sportsman, Long> {

}
