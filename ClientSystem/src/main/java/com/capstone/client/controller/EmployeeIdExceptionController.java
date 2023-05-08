package com.capstone.client.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class EmployeeIdExceptionController {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandler(Exception exp){
		return new ResponseEntity<String>("Please Enter Valid Integer Employee Id",HttpStatus.EXPECTATION_FAILED);
	}
	

}
