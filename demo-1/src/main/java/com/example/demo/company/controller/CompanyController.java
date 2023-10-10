package com.example.demo.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.company.entity.Company;
import com.example.demo.company.service.CompanyService;

@RestController
public class CompanyController {
	@Autowired
	CompanyService service;
	
	@PostMapping("/demo/findcompany")
	public List<Company> getCompany(){
		return service.findAll();
	}

}
