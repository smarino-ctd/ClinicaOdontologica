package com.sebam.ClinicaOdontologica_Spring;

import com.sebam.ClinicaOdontologica_Spring.entity.dto.OdontologoDTO;
import com.sebam.ClinicaOdontologica_Spring.exceptions.NotFoundException;
import com.sebam.ClinicaOdontologica_Spring.service.IOdontologoService;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ClinicaOdontologicaSpringApplicationTests {

	@Autowired
	private IOdontologoService odontologoService;
	private final static Logger log = Logger.getLogger(ClinicaOdontologicaSpringApplicationTests.class);
	private Set<OdontologoDTO> listadoOdontologos = new HashSet<OdontologoDTO>();

	@Test
	void guardarOdontologo(){

		OdontologoDTO odontologoDTO = new OdontologoDTO(1L,"Maria Cecilia","Blanco",35725L,"1");
		odontologoService.registrarOdontologo(odontologoDTO);

	}

	@Test
	void listarOdontologos(){

		listadoOdontologos = odontologoService.listadoOdontologos();

		assertEquals(12,listadoOdontologos.size());

	}

	@Test
	void odontologoPorId(){

		odontologoService.listarOdontologo(25L);

	}

}
