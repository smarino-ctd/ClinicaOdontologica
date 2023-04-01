package com.sebam.ClinicaOdontologica_Spring.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sebam.ClinicaOdontologica_Spring.entity.Domicilio;
import com.sebam.ClinicaOdontologica_Spring.entity.dto.DomicilioDTO;
import com.sebam.ClinicaOdontologica_Spring.repository.IDomicilioRepository;
import com.sebam.ClinicaOdontologica_Spring.service.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DomicilioService implements IDomicilioService{

    @Autowired
    IDomicilioRepository DomicilioRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void registrarDomicilio(DomicilioDTO DomicilioDTO) {

        Domicilio Domicilio = mapper.convertValue(DomicilioDTO, Domicilio.class);
        DomicilioRepository.save(Domicilio);

    }

    @Override
    public void modificarDomicilio(DomicilioDTO DomicilioDTO) {

        Domicilio Domicilio = mapper.convertValue(DomicilioDTO, Domicilio.class);
        DomicilioRepository.save(Domicilio);

    }

    @Override
    public void eliminarDomicilio(Long id) {

        DomicilioRepository.deleteById(id);

    }

    @Override
    public DomicilioDTO listarDomicilio(Long id) {

        Optional<Domicilio> Domicilio = DomicilioRepository.findById(id);

        DomicilioDTO DomicilioDTO = null;

        if(Domicilio.isPresent()){

            DomicilioDTO = mapper.convertValue(Domicilio, DomicilioDTO.class);

        }

        return DomicilioDTO;
    }

    @Override
    public Set<DomicilioDTO> listadoDomicilios() {

        List<Domicilio> listaDomicilios = DomicilioRepository.findAll();
        Set<DomicilioDTO> listadoDomiciliosDTO = new HashSet<>();

        for(Domicilio Domicilio : listaDomicilios){

            listadoDomiciliosDTO.add(mapper.convertValue(Domicilio, DomicilioDTO.class));

        }

        return listadoDomiciliosDTO;

    }
}
