package com.unifacisa.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unifacisa.hospital.Entity.Paciente;
import com.unifacisa.hospital.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public List<Paciente> listarPacientes(){
		return pacienteRepository.findAll();	
	}
	
	public Paciente salvar(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

}
