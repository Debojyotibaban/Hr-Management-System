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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ug_specialization")
public class UgSpecialization {

	@Id
	@Column(name="ug_specialization_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ugSpecializationId;
	
	@Column(name="ug_specialization")
	@NotNull(message = "Please enter ug specialization name")
	private String ugSpecialization;
}
