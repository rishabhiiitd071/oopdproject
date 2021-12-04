package com.food.ordering.restaurant;

import javax.persistence.Embeddable;

@Embeddable
public class Chinese extends Menu {
	public String getDishname() {
		return dishname;
	}

	public void setDishname(String dishname) {
		this.dishname = dishname;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

}
