package com.pcsgpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcsgpl.entity.UgQualification;

@Repository
public interface UgQualificationRepository extends JpaRepository<UgQualification, Integer> {

}
