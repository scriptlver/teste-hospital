package com.unifacisa.hospital.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unifacisa.hospital.Entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
