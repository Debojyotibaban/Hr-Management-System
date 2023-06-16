package com.pcsgpl.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcsgpl.dao.OfficeDetailsDao;
import com.pcsgpl.dto.OfficeDetailsDto;
import com.pcsgpl.entity.BaseBranch;
import com.pcsgpl.entity.Location;
import com.pcsgpl.entity.OfficeDetails;
import com.pcsgpl.entity.ParentDetails;
import com.pcsgpl.entity.Supervisor;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OfficeDetailsServiceImpl implements OfficeDetailsService {
	
	@Autowired
	private OfficeDetailsDao officeDetailsDao;
	
//	@Autowired
//	private BaseBranchDao baseBranchDao;
//	
//	@Autowired
//	private LocationDao locationDao;
//	
//	@Autowired
//	private ParentDetailsDao parentDetailsDao;
//	
//	@Autowired 
//	private SupervisorDao supervisorDao;
//	


	@Override
	public OfficeDetails saveEmployeeOfficeDetails(OfficeDetails officeDetails) {
		log.debug("saveEmployeeOfficeDetails in Service Layer");
		return officeDetailsDao.save(officeDetails);
	}

	@Override
	public String updateEmployeeOfficeDetails(OfficeDetailsDto officeDetailsDto, Integer userId) {
		log.debug("updateEmployeeOfficeDetails in Service Layer using arguments are", userId, officeDetailsDto.toString());
		Optional<OfficeDetails> findOfficeById = officeDetailsDao.findById(userId);
		
		if (findOfficeById.isPresent()) {
			Location location = Location.builder()
				. locationId(officeDetailsDto.getLocation().getLocationId())
				.location(officeDetailsDto.getLocation().getLocation())
				.build();
			log.info(location.toString());
			BaseBranch baseBranch = BaseBranch.builder()
					.branchId(officeDetailsDto.getBaseBranch().getBranchId())
					.branchName(officeDetailsDto.getBaseBranch().getBranchName())
					.build();
			log.info(baseBranch.toString());
			ParentDetails parentDetails = ParentDetails.builder()
					.parentIouId(officeDetailsDto.getParentDetails().getParentIouId())
					.parentName(officeDetailsDto.getParentDetails().getParentName())
					.build();
			log.info(parentDetails.toString());
			Supervisor supervisor = Supervisor.builder()
					.supervisorId(officeDetailsDto.getSupervisor().getSupervisorId())
					.supervisorName(officeDetailsDto.getSupervisor().getSupervisorName())
					.build();
			log.info(supervisor.toString());
//			OfficeDetails officeDetails = OfficeDetails.builder()
//					.employeeId(employeeId)
//					.dateOfJoining(officeDetailsDto.getDateOfJoining())
//					.employeeStatus(officeDetailsDto.getEmployeeStatus())
//					.employeeType(officeDetailsDto.getEmployeeType())
//					.gradeId(officeDetailsDto.getGradeId())
//					.location(location)
//					.baseBranch(baseBranch)
//					.supervisor(supervisor)
//					.parentDetails(parentDetails)
//					.subIouId(officeDetailsDto.getSubIouId())
//					.build();
//			log.info(officeDetails.toString());
			findOfficeById.get().setDateOfJoining(officeDetailsDto.getDateOfJoining());
			findOfficeById.get().setEmployeeStatus(officeDetailsDto.getEmployeeStatus());
			findOfficeById.get().setEmployeeType(officeDetailsDto.getEmployeeType());
			findOfficeById.get().setGradeId(officeDetailsDto.getGradeId());
//			findOfficeById.get().setLocation(location);
//			findOfficeById.get().setBaseBranch(baseBranch);
//			findOfficeById.get().setSupervisor(supervisor);
//			findOfficeById.get().setParentDetails(parentDetails);
//			findOfficeById.get().setSubIouId(officeDetailsDto.getSubIouId());
			log.info(findOfficeById.get().toString());
			 officeDetailsDao.save(findOfficeById.get());
			
		}
	   return "updated Successfull";

		
		
	}

	@Override
	public List<OfficeDetails> fetchEmployees() {
		return officeDetailsDao.findAll();
	}

	@Override
	public OfficeDetails fetchByEmployeeId(Integer userId) {
		return officeDetailsDao.findById(userId).get();
	}

}
