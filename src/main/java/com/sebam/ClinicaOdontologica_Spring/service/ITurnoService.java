package com.sebam.ClinicaOdontologica_Spring.service;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.TurnoDTO;

import java.util.Set;

public interface ITurnoService {

    void registrarTurno(TurnoDTO turnoDTO);

    void modificarTurno(TurnoDTO turnoDTO);

    void eliminarTurno(Long id);

    TurnoDTO listarTurno(Long id);

    Set<TurnoDTO> listadoTurnos();
    
}
