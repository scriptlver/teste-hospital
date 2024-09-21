package com.unifacisa.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.hospital.Entity.Paciente;
import com.unifacisa.hospital.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public List<Paciente> listar(){
		return pacienteService.listarPacientes();
	}
	
	@PostMapping
	public Paciente salvar(@RequestBody Paciente paciente) {
		return pacienteService.salvar(paciente);
	}
}
