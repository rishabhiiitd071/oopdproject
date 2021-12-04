package com.food.ordering.restaurant;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Menu {
	
	protected String dishname;
	protected Long price;

	

}
