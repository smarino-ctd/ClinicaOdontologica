package com.sebam.ClinicaOdontologica_Spring.service;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.PacienteDTO;

import java.util.Set;

public interface IPacienteService {

    void registrarPaciente(PacienteDTO pacienteDTO);

    void modificarPaciente(PacienteDTO pacienteDTO);

    void eliminarPaciente(Long id);

    PacienteDTO listarPaciente(Long id);

    Set<PacienteDTO> listadoPacientes();
    
}
