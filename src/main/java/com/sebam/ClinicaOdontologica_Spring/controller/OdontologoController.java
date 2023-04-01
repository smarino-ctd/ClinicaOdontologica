package com.sebam.ClinicaOdontologica_Spring.controller;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.OdontologoDTO;
import com.sebam.ClinicaOdontologica_Spring.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    @PostMapping("/registrar")
    public ResponseEntity<?> guardarOdontologo(@RequestBody OdontologoDTO odontologo){

        odontologoService.registrarOdontologo(odontologo);

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping("/buscar/{id}")
    public OdontologoDTO buscarOdontologo(@PathVariable Long id){

        return odontologoService.listarOdontologo(id);

    }

    @PutMapping("/modificar")
    public ResponseEntity<?> editarOdontologo(@RequestBody OdontologoDTO odontologo){

        odontologoService.modificarOdontologo(odontologo);

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Long id){

        odontologoService.eliminarOdontologo(id);

        return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);

    }

    @GetMapping("/listado")
    public Collection<OdontologoDTO> listarOdontologos(){

        return odontologoService.listadoOdontologos();

    }

}
