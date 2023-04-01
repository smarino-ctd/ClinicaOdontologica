package com.sebam.ClinicaOdontologica_Spring.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sebam.ClinicaOdontologica_Spring.entity.Odontologo;
import com.sebam.ClinicaOdontologica_Spring.entity.dto.OdontologoDTO;
import com.sebam.ClinicaOdontologica_Spring.repository.IOdontologoRepository;
import com.sebam.ClinicaOdontologica_Spring.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OdontologoService implements IOdontologoService{

    @Autowired
    IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void registrarOdontologo(OdontologoDTO odontologoDTO) {

        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);

    }

    @Override
    public void modificarOdontologo(OdontologoDTO odontologoDTO) {

        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);

    }

    @Override
    public void eliminarOdontologo(Long id) {

        odontologoRepository.deleteById(id);

    }

    @Override
    public OdontologoDTO listarOdontologo(Long id) {

        Optional<Odontologo> odontologo = odontologoRepository.findById(id);

        OdontologoDTO odontologoDTO = null;

        if(odontologo.isPresent()){

            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);

        }

        return odontologoDTO;
    }

    @Override
    public Set<OdontologoDTO> listadoOdontologos() {

        List<Odontologo> listaOdontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> listadoOdontologosDTO = new HashSet<>();

        for(Odontologo odontologo : listaOdontologos){

            listadoOdontologosDTO.add(mapper.convertValue(odontologo, OdontologoDTO.class));

        }

        return listadoOdontologosDTO;

    }
}
