package com.wolken.hackerrank;



import java.util.Scanner;

import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.service.RegistrationService;
import com.wolken.hackerrank.service.RegistrationServiceImpl;

public class Test {

	public static void main(String[] args) {
		RegistrationService service=new RegistrationServiceImpl();
		
		
		//UserDTO dto = new UserDTO();
		/*dto.setId(1);
		dto.setUsername("Pratheeka shettty");
		dto.setEmail("prath@gmail.com");
		dto.setContactNumber(7893412567l);
		dto.setPassword("prathi@123");
		dto.setCnfpassword("prathi@123");
		
		String isSaved=service.validateandsave(dto);
		System.out.println(isSaved);
		
		LoginDTO loginDTO=new LoginDTO();
		loginDTO.setEmail("prath@gmail.com");
		loginDTO.setPassword("prathi@123");
		String login=service.validateAndLogin(loginDTO);
		System.out.println(login);*/
		
		Scanner sc=new Scanner(System.in);
		String ans=null;
		do {
			System.out.println("1.Registration");
			System.out.println("2.Login");
			System.out.println("3.Forgot Password");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("Enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter user name");
				String name=sc.nextLine();
				System.out.println("Enter email id");
				String email=sc.nextLine();
				System.out.println("Enter contact number");
				long contactNo=sc.nextLong();
				sc.nextLine();
				System.out.println("Enter password");
				String password=sc.nextLine();
				System.out.println("Enter confirm password");
				String cnfpassword=sc.nextLine();
				
				UserDTO dto = new UserDTO();
				dto.setId(id);
				dto.setUsername(name);
				dto.setEmail(email);
				dto.setContactNumber(contactNo);
				dto.setPassword(password);
				dto.setCnfpassword(cnfpassword);
				String isSaved=service.validateandsave(dto);
				System.err.println(isSaved);
			}
			else if(ch==2) {
				sc.nextLine();
				System.out.println("Enter email id");
				String email=sc.nextLine();
				System.out.println("Enter password");
				String password=sc.nextLine();
				
				LoginDTO loginDTO=new LoginDTO();
				loginDTO.setEmail(email);
				loginDTO.setPassword(password);
				
				String login=service.validateAndLogin(loginDTO);
				System.err.println(login);
				
			}
			else if(ch==3) {
				sc.nextLine();
				System.out.println("Enter email id");
				String email=sc.nextLine();
				
				LoginDTO loginDTO=new LoginDTO();
				loginDTO.setEmail(email);
				String forgot=service.validateandUpdatePassword(loginDTO);
				System.err.println(forgot);
			}
			System.out.println("Do you want to continue");
			ans=sc.nextLine();
		}while(ans.equals("yes"));
		
	}
	}

