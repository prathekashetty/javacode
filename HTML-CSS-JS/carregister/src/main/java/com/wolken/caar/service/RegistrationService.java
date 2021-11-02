package com.wolken.caar.service;

import com.wolken.caar.dto.LoginDTO;
import com.wolken.caar.dto.RegistrationDTO;

public interface RegistrationService {

	String validateandsave(RegistrationDTO dto);

	String validateandLogin(LoginDTO loginDTO);

	String validateandUpdatePassword(LoginDTO loginDTO);

	String validateandDelete(String email);

}
