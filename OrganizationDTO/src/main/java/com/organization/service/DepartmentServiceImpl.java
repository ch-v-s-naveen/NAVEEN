package com.organization.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.bean.DepartmentVO;
import com.organization.dto.DepartmentDTO;
import com.organization.dto.persist.DepartmentPersist;
import com.organization.dto.persist.EntityPersistOperation;

@Service
public class DepartmentServiceImpl {
	
	@Autowired
	EntityPersistOperation deptPersist;
	@Autowired
	ModelMapper model;
	
	public DepartmentDTO saveDepartment(DepartmentDTO deptDTO) {
		DepartmentVO deptVO = model.map(deptDTO, DepartmentVO.class);
		DepartmentVO deptVOSaved = deptPersist.saveORGDto(deptVO);
		DepartmentDTO returnDto = model.map(deptVOSaved, DepartmentDTO.class);
		return returnDto;
	}

}
