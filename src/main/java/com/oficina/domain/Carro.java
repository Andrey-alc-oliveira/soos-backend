package com.oficina.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carros")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("CARRO")
public class Carro extends Veiculo{
	
	@Column(length = 50, nullable = false)
	private	String marca;
	
	@Column(length = 50, nullable = false)
	private String modelo;
	
	@Column(nullable = false)
	private BigDecimal litragem; // exemplo: 1.0, 1.6, 2.0
	
}
