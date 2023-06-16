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
@Table(name="pg_university")
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class PgUniversity {

	
	@Id
	@Column(name="pg_university_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pgUniversityId;
	
	@Column(name="pg_university")
	@NotNull(message = "Please enter pg university name")
	private String pgUniversity;
}
