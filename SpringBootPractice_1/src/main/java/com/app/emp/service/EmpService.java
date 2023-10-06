package com.app.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.emp.dao.EmpRepository;
import com.app.emp.entity.Emp;

@Service
public class EmpService {

	@Autowired
	EmpRepository reps;
	
	public void insert(Emp emp) {
		reps.save(emp);
	}
	public List<Emp> findAll(){
		return reps.findAll();
	}
}
