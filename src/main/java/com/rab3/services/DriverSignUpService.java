package com.rab3.services;

import org.springframework.stereotype.Service;

import com.rab3.dtos.DriverSignUpDto;

@Service
public class DriverSignUpService {
	
	public void driverRegister(DriverSignUpDto driverSignUpDto) {
		System.out.println(driverSignUpDto.toString());
	}
	
}
