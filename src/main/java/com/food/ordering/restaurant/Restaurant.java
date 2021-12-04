package com.food.ordering.restaurant;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	
	@Column
	private String address;
	
	@Column 
	private String city;
	
	
	public Long getEta() {
		return eta;
	}

	public void setEta(Long eta) {
		this.eta = eta;
	}

	public South getSouthMenu() {
		return southMenu;
	}

	public void setSouthMenu(South southMenu) {
		this.southMenu = southMenu;
	}

	public Chinese getChineseMenu() {
		return chineseMenu;
	}

	public void setChineseMenu(Chinese chineseMenu) {
		this.chineseMenu = chineseMenu;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	@Column
	private Long eta;
	
	@Embedded
	@AttributeOverrides({
	       @AttributeOverride(name="dishname", column=@Column(name="north_dish")),
	       @AttributeOverride(name="price", column=@Column(name="north_price"))
	   })
	private North northMenu;

	@Embedded
	@AttributeOverrides({
	       @AttributeOverride(name="dishname", column=@Column(name="south_dish")),
	       @AttributeOverride(name="price", column=@Column(name="south_price"))
	   })
	private South southMenu;
	
	
	@Embedded
	@AttributeOverrides({
	       @AttributeOverride(name="dishname", column=@Column(name="chinese_dish")),
	       @AttributeOverride(name="price", column=@Column(name="chinese_price"))
	   })
	private Chinese chineseMenu;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getETA() {
		return eta;
	}

	public void setETA(Long eTA) {
		this.eta = eTA;
	}

	public North getNorthMenu() {
		return northMenu;
	}

	public void setNorthMenu(North northMenu) {
		this.northMenu = new North();
	} 

}
