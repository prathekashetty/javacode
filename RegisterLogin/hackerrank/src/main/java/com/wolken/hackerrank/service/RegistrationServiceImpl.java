package com.wolken.hackerrank.service;

import java.util.Objects;
import java.util.Scanner;

import com.wolken.hackerrank.dao.RegistrationDAO;
import com.wolken.hackerrank.dao.RegistrationDAOImpl;
import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.entity.LoginEntity;
import com.wolken.hackerrank.entity.UserEntity;

public class RegistrationServiceImpl implements RegistrationService {
	Scanner scanner=new Scanner(System.in);
	RegistrationDAO dao=new RegistrationDAOImpl();
	
	public String validateandsave(UserDTO dto) {

		UserEntity entity=new UserEntity();
		if(dto.getId()>0)
		{
			if(!dto.getUsername().equals(null) && !dto.getUsername().equals(""))
			{
			if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) 
			
			  {
				if(dto.getContactNumber() > 5999999999l && dto.getContactNumber() <= 9999999999l )
				{
					if(dto.getPassword().equals(dto.getCnfpassword()))
					{
						entity.setId(dto.getId());
						entity.setUsername(dto.getUsername());
						entity.setEmail(dto.getEmail());
						entity.setContactNumber(dto.getContactNumber());
						entity.setPassword(dto.getPassword());
						
						int rows = dao.save(entity);
						if(rows >0) return "Data Saved";
						else return "Data not Saved";
					}else
						return "Password and CnfPassword has to be same";
				}else {
					return "Provide vaild contact number";
				}
			}else
				return "Provide vaild emailId";
		}else {
			return "Provide vaild username";
		   }
		}else {
			return "Provide vaild id";
		}
	
			}

	public String validateAndLogin(LoginDTO loginDTO) {
		if(!Objects.isNull(loginDTO)) {
			if(!loginDTO.getEmail().equals(null) && !loginDTO.getEmail().equals(""))
			{
				LoginEntity entity=dao.getByEmail(loginDTO.getEmail());
				if(loginDTO.getPassword().equals(entity.getPassword()))
				{
					return "Login Sucessfully";
				}else
					return "Plz Provioide valid password";
			}else
				return "Invalid emailId plz proivd valid email id";
		}else
		return "DTO object is null";
	}

	public String validateandUpdatePassword(LoginDTO loginDTO) {
		

			if(!loginDTO.getEmail().equals(null) && !loginDTO.getEmail().equals("")) {
				LoginEntity entity=dao.getByEmail(loginDTO.getEmail());
				if(entity!=null) {
				System.out.println("Enter Password");
				String password=scanner.nextLine();
				System.out.println("Enter confirm Password");
				String repassword=scanner.nextLine();
					if(password.equals(repassword)) {
						entity.setEmail(loginDTO.getEmail());
						entity.setPassword(password);
						
						int isUpdate=dao.forgotPassword(entity);
						if(isUpdate>0) {
							return "Password Updated";
							
						}else {
							return "Password not Updated";
						}
					}else{
						return "Password and confirm password has to be same";
					}
				}else {
					return "Enter valid Email";
				}
			}else {
				return "Enter valid Email";
			}
			
		}
	}
	
	


