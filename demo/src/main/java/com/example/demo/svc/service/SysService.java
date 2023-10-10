package com.example.demo.svc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.svc.dao.SysRespostory;
import com.example.demo.svc.entity.Sys;

@Service
public class SysService {
	@Autowired
	SysRespostory respostory;
	
	public void insert(Sys sys) {
		
		respostory.save(sys);
	}
}
