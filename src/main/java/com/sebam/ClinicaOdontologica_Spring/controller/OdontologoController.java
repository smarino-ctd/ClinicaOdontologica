package com.sebam.ClinicaOdontologica_Spring.controller;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.OdontologoDTO;
import com.sebam.ClinicaOdontologica_Spring.exceptions.NotFoundException;
import com.sebam.ClinicaOdontologica_Spring.service.IOdontologoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    private final static Logger log = Logger.getLogger(OdontologoController.class);

    @Autowired
    IOdontologoService odontologoService;

    @PostMapping("/registrar")
    public ResponseEntity<?> guardarOdontologo(@RequestBody OdontologoDTO odontologo){

        odontologoService.registrarOdontologo(odontologo);

        log.info("Odontologo registrado correctamente");

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping("/buscar/{id}")
    public OdontologoDTO buscarOdontologo(@PathVariable Long id) throws NotFoundException {

        return odontologoService.listarOdontologo(id);

    }

    @PutMapping("/modificar")
    public ResponseEntity<?> editarOdontologo(@RequestBody OdontologoDTO odontologo){

        odontologoService.modificarOdontologo(odontologo);

        log.info("Odontolo modificado existosamente");

        return ResponseEntity.ok(HttpStatus.OK);

    }

    /*@DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Long id){

        odontologoService.eliminarOdontologo(id);

        return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);

    }*/

    @PutMapping("/eliminar")
    public ResponseEntity<?> eliminarOdontologo(@RequestBody OdontologoDTO odontologo){

        odontologoService.modificarOdontologo(odontologo);

        log.info("Odontolo eliminado existosamente");

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping("/listado")
    public Collection<OdontologoDTO> listarOdontologos(){

        return odontologoService.listadoOdontologos();

    }

}
