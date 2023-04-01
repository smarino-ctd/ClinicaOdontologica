package com.sebam.ClinicaOdontologica_Spring.service;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.DomicilioDTO;

import java.util.Set;

public interface IDomicilioService {

    void registrarDomicilio(DomicilioDTO domicilioDTO);

    void modificarDomicilio(DomicilioDTO domicilioDTO);

    void eliminarDomicilio(Long id);

    DomicilioDTO listarDomicilio(Long id);

    Set<DomicilioDTO> listadoDomicilios();
    
}
