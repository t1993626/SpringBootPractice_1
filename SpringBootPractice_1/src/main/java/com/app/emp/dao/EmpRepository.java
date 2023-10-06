package com.app.emp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.emp.entity.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {
	

}
