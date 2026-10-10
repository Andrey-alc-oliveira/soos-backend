package com.oficina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oficina.domain.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
	Optional<Veiculo> findByPlaca(String placa);
}
