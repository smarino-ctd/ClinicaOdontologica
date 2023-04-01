package com.sebam.ClinicaOdontologica_Spring.controller;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.TurnoDTO;
import com.sebam.ClinicaOdontologica_Spring.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    ITurnoService TurnoService;

    @PostMapping("/registrar")
    public ResponseEntity<?> guardarTurno(@RequestBody TurnoDTO turno){

        TurnoService.registrarTurno(turno);

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping("/buscar/{id}")
    public TurnoDTO buscarTurno(@PathVariable Long id){

        return TurnoService.listarTurno(id);

    }

    @PutMapping("/modificar")
    public ResponseEntity<?> editarTurno(@RequestBody TurnoDTO turno){

        TurnoService.modificarTurno(turno);

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Long id){

        TurnoService.eliminarTurno(id);

        return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);

    }

    @GetMapping("/listado")
    public Collection<TurnoDTO> listarTurnos(){

        return TurnoService.listadoTurnos();

    }

}
