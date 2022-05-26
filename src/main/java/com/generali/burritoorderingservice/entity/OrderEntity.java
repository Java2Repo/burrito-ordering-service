package com.generali.burritoorderingservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderEntity {
	@Id	
	@GeneratedValue
	private int orderId;
	private String tortilla ;
	private String protein ;
	private String vegetables ;
	private String salsa ;
	private String extras ;
}
