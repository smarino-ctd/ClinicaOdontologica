package com.sebam.ClinicaOdontologica_Spring.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sebam.ClinicaOdontologica_Spring.entity.Turno;
import com.sebam.ClinicaOdontologica_Spring.entity.dto.TurnoDTO;
import com.sebam.ClinicaOdontologica_Spring.repository.ITurnoRepository;
import com.sebam.ClinicaOdontologica_Spring.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    ITurnoRepository TurnoRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void registrarTurno(TurnoDTO TurnoDTO) {

        Turno Turno = mapper.convertValue(TurnoDTO, Turno.class);
        TurnoRepository.save(Turno);

    }

    @Override
    public void modificarTurno(TurnoDTO TurnoDTO) {

        Turno Turno = mapper.convertValue(TurnoDTO, Turno.class);
        TurnoRepository.save(Turno);

    }

    @Override
    public void eliminarTurno(Long id) {

        TurnoRepository.deleteById(id);

    }

    @Override
    public TurnoDTO listarTurno(Long id) {

        Optional<Turno> Turno = TurnoRepository.findById(id);

        TurnoDTO TurnoDTO = null;

        if(Turno.isPresent()){

            TurnoDTO = mapper.convertValue(Turno, TurnoDTO.class);

        }

        return TurnoDTO;
    }

    @Override
    public Set<TurnoDTO> listadoTurnos() {

        List<Turno> listaTurnos = TurnoRepository.findAll();
        Set<TurnoDTO> listadoTurnosDTO = new HashSet<>();

        for(Turno Turno : listaTurnos){

            listadoTurnosDTO.add(mapper.convertValue(Turno, TurnoDTO.class));

        }

        return listadoTurnosDTO;

    }
}
