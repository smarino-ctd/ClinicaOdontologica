package com.sebam.ClinicaOdontologica_Spring.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OdontologoDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private Long matricula;

    private String visible = "1";

}
