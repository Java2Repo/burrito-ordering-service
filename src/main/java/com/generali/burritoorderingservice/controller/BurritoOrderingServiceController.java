package com.generali.burritoorderingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generali.burritoorderingservice.entity.OrderEntity;
import com.generali.burritoorderingservice.model.Order;
import com.generali.burritoorderingservice.service.OrderService;


@RestController
public class BurritoOrderingServiceController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders/{orderId}")
	public OrderEntity getOrderByID(@PathVariable int id) {
		return orderService.getOrderById(id);
	}
	
	@PostMapping("/orders")
	public List<OrderEntity> getOrder(@RequestBody Order order) {
		return orderService.getOrder();
	}
	

	@GetMapping("/ping")
	public String ping() {
		return "Connection Successfull";
	}
	
}
