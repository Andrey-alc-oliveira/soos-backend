package com.oficina.domain;

import com.oficina.domain.enums.TipoPessoa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "clientes")
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Long id;
	
	@Column(length=150, nullable = false)

	private String nome;
	
	@Column(length= 14, nullable = false, unique = true)
	@ToString.Exclude
	private String documento;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;
	
	@Column(length= 14, nullable= false)
	private String numero;
	
	@Column(length= 100, nullable= true)
	private String email;
	
}
