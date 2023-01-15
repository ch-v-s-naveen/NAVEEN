package com.organization.dto.persist;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.bean.DepartmentVO;

@Service
public class EntityPersistOperation {
	
	@Autowired
	EntityManagerFactory emf;
	
	public DepartmentVO saveORGDto(DepartmentVO DepartmentVO) {
		Session sf = emf.unwrap(Session.class);
		sf.save(DepartmentVO);
		//sf.persist(DepartmentVO);
		return DepartmentVO;
	}

}
