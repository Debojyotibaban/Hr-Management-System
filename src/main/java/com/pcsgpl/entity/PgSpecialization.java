package com.pcsgpl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="pg_specialization")
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class PgSpecialization {

	@Id
	@Column(name="pg_specialization_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pgSpecializationId;
	
	@Column(name="pg_specialization")
	@NotNull(message = "Please enter pg specialization name")
	private String pgSpecialization;
}
