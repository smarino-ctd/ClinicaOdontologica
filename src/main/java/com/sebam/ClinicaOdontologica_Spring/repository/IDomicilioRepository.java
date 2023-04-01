package com.sebam.ClinicaOdontologica_Spring.repository;

import com.sebam.ClinicaOdontologica_Spring.entity.Domicilio;
import com.sebam.ClinicaOdontologica_Spring.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface IDomicilioRepository extends JpaRepository<Domicilio, Long> {

    @Query("FROM Domicilio d WHERE d.calle = calle")
    Set<Domicilio> buscarDomicilioCalle(String calle);

}
