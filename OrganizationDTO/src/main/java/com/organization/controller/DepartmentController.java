package com.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.organization.dto.DepartmentDTO;
import com.organization.service.DepartmentServiceImpl;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImpl deptService;
	
	@PostMapping(value ="saveDept", consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE} )
	public ResponseEntity<DepartmentDTO> saveDepartmentDto(@RequestBody DepartmentDTO deptDto){
		
		DepartmentDTO dto = 	deptService.saveDepartment(deptDto);
		return new ResponseEntity(dto, HttpStatus.CREATED);
	}

}
