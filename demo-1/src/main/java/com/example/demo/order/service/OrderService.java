package com.example.demo.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.order.dao.OrderDao;
import com.example.demo.order.entity.Orders;

@Service
public class OrderService {
	@Autowired
	OrderDao dao;

	public List<Orders> findByCompanyId(Integer companyId) {
		return dao.findByCompanyId(companyId);
	}

	public Orders findByOrderId(Integer orderId) {
		return dao.findByOrderId(orderId);
	}
}
