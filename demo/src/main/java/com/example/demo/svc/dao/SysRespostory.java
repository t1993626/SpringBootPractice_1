package com.example.demo.svc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.svc.entity.Sys;

@Repository
public interface SysRespostory extends JpaRepository<Sys, Integer> {

}
