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
@Table(name="pg_qualification")
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class PgQualification {

	@Id
	@Column(name="pg_qualification_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pgQualificationId;
	
	@Column(name="pg_qualification")
	@NotNull(message = "Please enter pg qualification name")
	private String pgQualification;
}
