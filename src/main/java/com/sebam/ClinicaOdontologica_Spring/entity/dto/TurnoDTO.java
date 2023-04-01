package com.sebam.ClinicaOdontologica_Spring.entity.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TurnoDTO {

    Long id;
    private LocalDate fechaHora;

}
