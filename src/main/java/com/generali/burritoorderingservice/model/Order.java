package com.generali.burritoorderingservice.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int orderId;
	private Tortilla tortilla;
	private Protein protein;
	private Vegetables vegetables;
	private Salsa salsa;
	private Extras extras;
	

}
