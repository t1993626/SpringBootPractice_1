package com.example.demo.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.company.dao.CompanyDao;
import com.example.demo.company.entity.Company;
@Service
public class CompanyService {
	@Autowired
	CompanyDao dao;

	public List<Company> findAll() {
		return dao.findAll();
	}
	public void insert(Company company) {
		dao.save(company);
	}
}
