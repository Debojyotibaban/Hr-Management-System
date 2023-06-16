package com.pcsgpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcsgpl.entity.EmployeeEducation;


@Repository
public interface EmployeeEducationRepository extends JpaRepository<EmployeeEducation, Integer> {

	public EmployeeEducation findByEmployeeId(Integer employeeId);
}
