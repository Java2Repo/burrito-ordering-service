package com.generali.burritoorderingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generali.burritoorderingservice.dao.OrderRepository;
import com.generali.burritoorderingservice.entity.OrderEntity;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	
	public OrderEntity getOrderById(int id) {
		return orderRepository.findById(id).orElse(null);
	}
	
	public List<OrderEntity> getOrder() {
		return orderRepository.findAll();
	}
	
}
