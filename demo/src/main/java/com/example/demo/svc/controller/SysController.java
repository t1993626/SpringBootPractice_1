package com.example.demo.svc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.svc.entity.Sys;
import com.example.demo.svc.service.SysService;

@RestController
public class SysController {
	@Autowired
	SysService service;
	
	@PostMapping("/Sys/insert")
	public ResponseEntity<String> insert(@RequestBody Sys sys) {
		System.out.println(sys);
		service.insert(sys);
		return ResponseEntity.ok("success");
		
	}
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}

}
