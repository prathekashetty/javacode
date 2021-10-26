package com.wolken.hackerrank.service;

import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;

public interface RegistrationService {
	 String validateandsave(UserDTO dto);
	 String validateAndLogin(LoginDTO loginDTO);
	 String validateandUpdatePassword(LoginDTO loginDTO);
}
