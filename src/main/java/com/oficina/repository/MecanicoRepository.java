package com.oficina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oficina.domain.Mecanico;

public interface MecanicoRepository extends JpaRepository<Mecanico, Long>{
	Optional<Mecanico> findByAtivoTrue();
}
