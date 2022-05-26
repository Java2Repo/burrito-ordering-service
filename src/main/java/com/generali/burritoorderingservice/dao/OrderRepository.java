package com.generali.burritoorderingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generali.burritoorderingservice.entity.OrderEntity;




public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

}
