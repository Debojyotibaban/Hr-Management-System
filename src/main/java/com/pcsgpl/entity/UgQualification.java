package com.pcsgpl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@ToString
@Table(name="ug_qualification")
public class UgQualification {
	
	@Id
	@Column(name="ug_qualification_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ugQualificationId;
	
	@Column(name="ug_qualification")
	@NotNull(message = "Please enter ug qualification name")
	private String ugQualification;
	


}
