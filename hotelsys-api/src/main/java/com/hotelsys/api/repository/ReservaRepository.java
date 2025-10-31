package com.hotelsys.api.repository;

import com.hotelsys.api.model.entidades.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    List<Reserva> findByActivoTrue();
}
