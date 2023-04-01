package com.sebam.ClinicaOdontologica_Spring.service;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {

    void registrarOdontologo(OdontologoDTO odontologoDTO);

    void modificarOdontologo(OdontologoDTO odontologoDTO);

    void eliminarOdontologo(Long id);

    OdontologoDTO listarOdontologo(Long id);

    Set<OdontologoDTO> listadoOdontologos();

}
