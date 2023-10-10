package com.example.demo.order.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.order.entity.Orders;

@Repository
public interface OrderDao extends JpaRepository<Orders, Integer> {
	@Query(nativeQuery = true, value="SELECT * FROM Orders o WHERE o.company_Id = ?1")
	List<Orders> findByCompanyId(Integer companyId);
	
	Orders findByOrderId(Integer orderId);
}
