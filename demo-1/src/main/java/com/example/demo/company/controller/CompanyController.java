package com.example.demo.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping("/demo/insert")
	public ResponseEntity<String> insertCompany(@RequestBody Company company) {
		service.insert(company);
		return ResponseEntity.ok("success");
	}
	
	@GetMapping("/demo/getLastOne")
	public Company getLastOne() {
		List<Company> companies =service.findAll();
		Company company = companies.get(companies.size()-1);
		return company;
	}
}
