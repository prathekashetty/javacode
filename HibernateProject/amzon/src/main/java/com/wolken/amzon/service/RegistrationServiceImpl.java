package com.wolken.amzon.service;

import com.wolken.amzon.dao.RegistrationDAO;
import com.wolken.amzon.dao.RegistrationDAOImpl;
import com.wolken.amzon.dto.UserDTO;
import com.wolken.amzon.entity.UserEntity;

public class RegistrationServiceImpl implements RegistrationService {

	RegistrationDAO dao=new RegistrationDAOImpl();
	
	public String validateandsave(UserDTO dto) {
		// TODO Auto-generated method stub
		UserEntity entity=new UserEntity();
		entity.setId(dto.getId());
		entity.setUsername(dto.getUsername());
		entity.setEmail(dto.getEmail());
		entity.setContactNumber(dto.getContactNumber());
		entity.setPassword(dto.getPassword());
		
		int rows = dao.save(entity);
		return "validated";
			}

}
