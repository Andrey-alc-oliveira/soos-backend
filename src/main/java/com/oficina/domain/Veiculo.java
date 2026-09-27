package com.oficina.domain;

import com.oficina.domain.enums.TipoVeiculo;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;

@Entity
@Table(name = "veiculos")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name= "tipo_veiculo")
@Getter
@Setter
public abstract class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Long id;
	
	@Column(nullable = false)
	private Integer ano;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Cliente cliente;
	
	@Column(length = 7, nullable = false)// MERCOSUL Standard length
	private String placa;
	
	@Column(name = "tipo_veiculo", nullable = false, insertable = false, updatable = false)
	private TipoVeiculo tipoVeiculo;
}
