package com.sebam.ClinicaOdontologica_Spring.repository;

import com.sebam.ClinicaOdontologica_Spring.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Long> {

    @Query("FROM Odontologo o WHERE o.matricula = matricula")
    Odontologo buscarOdontologoMatricula(Long matricula);

}
