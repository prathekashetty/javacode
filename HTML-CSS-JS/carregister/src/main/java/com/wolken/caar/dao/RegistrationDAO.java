package com.wolken.caar.dao;

import com.wolken.caar.entity.LoginEntity;
import com.wolken.caar.entity.RegistrationEntity;

public interface RegistrationDAO {

	String save(RegistrationEntity entity);

	LoginEntity getByEmail(String email);

	int forgotPassword(LoginEntity entity);

	int deleteData(String email);

}