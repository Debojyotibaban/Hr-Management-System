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
@Table(name="ug_university")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UgUniversity {

	
	@Id
	@Column(name="ug_university_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ugUniversityId;
	
	
	@Column(name="ug_university")
	@NotNull(message = "Please enter ug university name")
	private String ugUniversity;
}
