package com.pateros.proyectogym.Repository;

import com.pateros.proyectogym.Entities.DocEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DocRepository extends JpaRepository<DocEntity, Long> {
}
