package com.pcsgpl.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pcsgpl.entity.BaseBranch;
import com.pcsgpl.entity.Location;
import com.pcsgpl.entity.ParentDetails;
import com.pcsgpl.entity.Supervisor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OfficeDetailsDto {
	
	private Integer userId;
	
	private Integer employeeId;
	
	@JsonFormat(pattern="yyyy/MM/dd", shape=JsonFormat.Shape.STRING)
	private LocalDate dateOfJoining;

	private Integer employeeStatus;

	private Integer gradeId;
	
	private String employeeType;

	private Location location;

	private BaseBranch baseBranch;

	private Supervisor supervisor;
	
	private ParentDetails  parentDetails;
	
	private Integer subIouId;
}
