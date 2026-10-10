package com.oficina.domain;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name= "onibus")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("ONIBUS")
public class Onibus extends Veiculo {
	@Column(length = 50, nullable = false)
	private String chassi;
	
	@Column(length = 50, nullable = false)
	private String encarroçadora;
	
	@Column(length = 50, nullable = false)
	private String modeloCarroceria;
	
	@Column(length= 50, nullable = false)
	private String motor;
	
	@Column(length= 50, nullable= false)
	private String cambio;
	
}
