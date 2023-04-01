package com.sebam.ClinicaOdontologica_Spring.controller;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.PacienteDTO;
import com.sebam.ClinicaOdontologica_Spring.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    IPacienteService PacienteService;

    @PostMapping("/registrar")
    public ResponseEntity<?> guardarPaciente(@RequestBody PacienteDTO paciente){

        PacienteService.registrarPaciente(paciente);

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping("/buscar/{id}")
    public PacienteDTO buscarPaciente(@PathVariable Long id){

        return PacienteService.listarPaciente(id);

    }

    @PutMapping("/modificar")
    public ResponseEntity<?> editarPaciente(@RequestBody PacienteDTO paciente){

        PacienteService.modificarPaciente(paciente);

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Long id){

        PacienteService.eliminarPaciente(id);

        return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);

    }

    @GetMapping("/listado")
    public Collection<PacienteDTO> listarPacientes(){

        return PacienteService.listadoPacientes();

    }

}
