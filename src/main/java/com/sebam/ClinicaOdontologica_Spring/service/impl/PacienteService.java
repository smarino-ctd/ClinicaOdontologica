package com.sebam.ClinicaOdontologica_Spring.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sebam.ClinicaOdontologica_Spring.entity.Paciente;
import com.sebam.ClinicaOdontologica_Spring.entity.dto.PacienteDTO;
import com.sebam.ClinicaOdontologica_Spring.repository.IPacienteRepository;
import com.sebam.ClinicaOdontologica_Spring.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PacienteService implements IPacienteService{

    @Autowired
    IPacienteRepository PacienteRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void registrarPaciente(PacienteDTO PacienteDTO) {

        Paciente Paciente = mapper.convertValue(PacienteDTO, Paciente.class);
        PacienteRepository.save(Paciente);

    }

    @Override
    public void modificarPaciente(PacienteDTO PacienteDTO) {

        Paciente Paciente = mapper.convertValue(PacienteDTO, Paciente.class);
        PacienteRepository.save(Paciente);

    }

    @Override
    public void eliminarPaciente(Long id) {

        PacienteRepository.deleteById(id);

    }

    @Override
    public PacienteDTO listarPaciente(Long id) {

        Optional<Paciente> Paciente = PacienteRepository.findById(id);

        PacienteDTO PacienteDTO = null;

        if(Paciente.isPresent()){

            PacienteDTO = mapper.convertValue(Paciente, PacienteDTO.class);

        }

        return PacienteDTO;
    }

    @Override
    public Set<PacienteDTO> listadoPacientes() {

        List<Paciente> listaPacientes = PacienteRepository.findAll();
        Set<PacienteDTO> listadoPacientesDTO = new HashSet<>();

        for(Paciente Paciente : listaPacientes){

            listadoPacientesDTO.add(mapper.convertValue(Paciente, PacienteDTO.class));

        }

        return listadoPacientesDTO;

    }
}
