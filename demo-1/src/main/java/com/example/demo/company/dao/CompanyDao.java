package com.example.demo.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.company.entity.Company;

@Repository
public interface CompanyDao extends JpaRepository<Company, Integer> {

}
