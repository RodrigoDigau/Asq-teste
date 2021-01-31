package com.rodrigo.controleprocedimentosController;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rodrigo.controledeprocedimentosModel.paciente;
import com.rodrigo.controledeprocedimentosModel.pacienterepositorio;


@RestController
@RequestMapping("/paciente")
public class pacienteController {

	@Autowired
	pacienterepositorio pacienteRepo;

	@PostMapping(consumes = "application/json")
	public ResponseEntity<?> adicionapaciente(@RequestBody paciente paciente) {
		paciente pacienteSalvo = pacienteRepo.save(paciente);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().replacePath("/paciente").path("/{id}")
				.buildAndExpand(com.rodrigo.controledeprocedimentosModel.paciente.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@GetMapping
	public ResponseEntity<List<paciente>> listapaciente() {
		return ResponseEntity.ok().body(pacienteRepo.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<paciente> buscaPorId(@PathVariable String id) {
		return ResponseEntity.ok().body(pacienteRepo.findById(id).get());
	}

}


