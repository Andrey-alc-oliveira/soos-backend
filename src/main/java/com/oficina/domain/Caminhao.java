package com.oficina.domain;

import com.oficina.domain.enums.TipoCarroceria;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "caminhoes")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("CAMINHAO")
public class Caminhao extends Veiculo {
	@Column(length = 50, nullable = false)
	private String modelo;
	
	@Column(length = 50, nullable = false)
	private String marca;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoCarroceria carroceria;
	
	@Column(length = 50, nullable = false)
	private String motor;
	
	@Column(length = 50, nullable = false)
	private String cambio;
}
