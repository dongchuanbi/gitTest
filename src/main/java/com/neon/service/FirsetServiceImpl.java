package com.neon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.dao.FirstDao;
import com.neon.domain.EmpRole;

@Service
public class FirsetServiceImpl implements FirsetService{
	@Autowired
	private FirstDao firstDao;
	@Override
	public int firstMethod() {
		EmpRole empRole=new EmpRole();
		empRole.setEmpId("1");
		empRole.setRoleIe("15010591799");
		empRole.setStatus("3");
		empRole.setUpdatedBy("10086");
		empRole.setVersion("5");
		int a= firstDao.insertFirst(empRole);
		return a;
	}
	
}
