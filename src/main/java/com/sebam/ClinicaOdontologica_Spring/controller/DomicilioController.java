package com.sebam.ClinicaOdontologica_Spring.controller;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.DomicilioDTO;
import com.sebam.ClinicaOdontologica_Spring.service.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {

    @Autowired
    IDomicilioService DomicilioService;

    @PostMapping("/registrar")
    public ResponseEntity<?> guardarDomicilio(@RequestBody DomicilioDTO domicilio){

        DomicilioService.registrarDomicilio(domicilio);

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping("/buscar/{id}")
    public DomicilioDTO buscarDomicilio(@PathVariable Long id){

        return DomicilioService.listarDomicilio(id);

    }

    @PutMapping("/modificar")
    public ResponseEntity<?> editarDomicilio(@RequestBody DomicilioDTO domicilio){

        DomicilioService.modificarDomicilio(domicilio);

        return ResponseEntity.ok(HttpStatus.OK);

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarDomicilio(@PathVariable Long id){

        DomicilioService.eliminarDomicilio(id);

        return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);

    }

    @GetMapping("/listado")
    public Collection<DomicilioDTO> listarDomicilios(){

        return DomicilioService.listadoDomicilios();

    }

}
