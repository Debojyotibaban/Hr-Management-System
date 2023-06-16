package com.pcsgpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcsgpl.entity.EmployeeUserProfile;

@Repository
public interface EmployeeUserProfileRepository extends JpaRepository<EmployeeUserProfile, Integer> {

}
