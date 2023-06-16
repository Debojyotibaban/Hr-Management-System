package com.pcsgpl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcsgpl.dto.OfficeDetailsDto;
import com.pcsgpl.entity.OfficeDetails;

@Repository
public interface OfficeDetailsDao extends JpaRepository<OfficeDetails, Integer> {

	//OfficeDetails save(OfficeDetailsDto officeDetailsDto);

}
