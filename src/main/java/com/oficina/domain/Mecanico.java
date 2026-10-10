package com.oficina.domain;

import com.oficina.domain.enums.MecanicoEspecialidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "mecanicos")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mecanico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Long id;
	
	@Column(length = 140, nullable = false)
	private String nome;
	
	@Column(length = 14, nullable = false, unique = true)
	@ToString.Exclude
	private String cpf;
	
	@Column(length = 20, nullable = false)
	private String telefone;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MecanicoEspecialidade especialidade;
	
	@Column(nullable = false)
	private Boolean ativo = true;
}
