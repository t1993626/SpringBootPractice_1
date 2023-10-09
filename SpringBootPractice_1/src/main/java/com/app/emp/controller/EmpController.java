package com.app.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.emp.entity.Emp;
import com.app.emp.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService empService;
	
	@PostMapping("/demo/insert")
	public ResponseEntity<String> insert(@RequestBody Emp emp) {
	    empService.insert(emp);
	    return ResponseEntity.ok("success");
	}
	@GetMapping("/demo/getInfo")
	public List<Emp> getInfo(){
		List<Emp> empList = empService.findAll();
		return empList;
	}
}
