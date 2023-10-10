package com.example.demo.order.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.order.entity.Orders;
import com.example.demo.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService service;
	
	@GetMapping("/demo/getOrder/{companyId}")
	public List<Orders> getOrderByCompanyId(@PathVariable Integer companyId){
	    return service.findByCompanyId(companyId);
	}
	@GetMapping("/demo/getInfo/{orderId}")
	public Orders getOrderInfo(@PathVariable Integer orderId) {
		return service.findByOrderId(orderId);
	}
}
