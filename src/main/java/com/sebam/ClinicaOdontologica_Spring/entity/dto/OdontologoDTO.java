package com.sebam.ClinicaOdontologica_Spring.entity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OdontologoDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private Long matricula;

}
