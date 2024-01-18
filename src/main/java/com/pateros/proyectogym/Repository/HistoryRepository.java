package com.pateros.proyectogym.Repository;

import com.pateros.proyectogym.Entities.HistorySportsman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<HistorySportsman, Long> {
}
