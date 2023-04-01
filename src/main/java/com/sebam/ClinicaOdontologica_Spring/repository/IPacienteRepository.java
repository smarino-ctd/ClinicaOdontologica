package com.sebam.ClinicaOdontologica_Spring.repository;

import com.sebam.ClinicaOdontologica_Spring.entity.Odontologo;
import com.sebam.ClinicaOdontologica_Spring.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

    @Query("FROM Paciente p WHERE p.apellido = apellido")
    Set<Paciente> buscarPacienteApellido(String apellido);

}
