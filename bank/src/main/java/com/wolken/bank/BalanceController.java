package com.wolken.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

	Logger logger=LoggerFactory.getLogger(BalanceController.class);
	@GetMapping("getBalance")
	String getBalance()
	{
		logger.info("inside get balnce");
		return "zero balance";
	}
	
	@GetMapping("getUserAccount")
	String getUserAccount()
	{
		logger.info("get user Account");
		return "User Account";
	}
	
	@GetMapping("getAccountNumber")
	String getAccountNumber()
	{
		logger.info("get user Account Number");
		return "User Account Number";
	}
	@GetMapping("getUserDetails")
	String getUserDetails()
	{
		logger.info("get UserDetails");
		return "User Details";
	}
	@GetMapping("getbyAddress")
	String getbyAddress()
	{
		logger.info("get user Address");
		return "user Address";
	}
}
