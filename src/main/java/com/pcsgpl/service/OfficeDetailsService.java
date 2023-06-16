package com.pcsgpl.service;

import java.util.List;

import com.pcsgpl.dto.OfficeDetailsDto;
import com.pcsgpl.entity.OfficeDetails;

public interface OfficeDetailsService {

	public OfficeDetails saveEmployeeOfficeDetails(OfficeDetails officeDetails);

	public String updateEmployeeOfficeDetails(OfficeDetailsDto officeDetailsDto, Integer employeeId);

	public List<OfficeDetails> fetchEmployees();

	public OfficeDetails fetchByEmployeeId(Integer employeeId);
}
