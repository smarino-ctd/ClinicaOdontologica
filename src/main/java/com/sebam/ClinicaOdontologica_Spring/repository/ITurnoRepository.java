package com.sebam.ClinicaOdontologica_Spring.repository;

import com.sebam.ClinicaOdontologica_Spring.entity.Odontologo;
import com.sebam.ClinicaOdontologica_Spring.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long> {

    @Query("FROM Turno t WHERE t.id = id")
    Turno buscarTurnoId(Long id);

}
