package com.food.ordering.restaurant;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestoService {

	@Autowired
	private RestaurantRepo restoRepo;
	
	public Object getRestaurant() {
		
//		Restaurant resto = new Restaurant();
//		resto.setNorthMenu(new North());
//		resto.setName("Kitchen");
//		resto.setETA((long)4);
//		resto.getNorthMenu().setDishname("Chole Bhature");
//		resto.getNorthMenu().setPrice((long)10);
//		
//		resto.setSouthMenu(new South());
//		resto.getSouthMenu().setDishname("Dosa");
//		resto.getSouthMenu().setPrice((long)10);
//		
//		resto.setChineseMenu(new Chinese());
//		resto.getChineseMenu().setDishname("Noodles");
//		resto.getChineseMenu().setPrice((long)10);
//		restoRepo.save(resto);
		
		ArrayList<ArrayList<String>> final_d = new ArrayList<>();
		Iterable<Restaurant> result =  restoRepo.findAll();
		
		for (Restaurant restaurant : result) {
			ArrayList<String> Data = new ArrayList<>();
			Data.add(restaurant.getName());
			Data.add(String.valueOf(restaurant.getETA()));
			final_d.add(Data);
		}
		
		return final_d;
	}
	
	public Object getMenu(String resto) {
		
		List<Restaurant> result = restoRepo.findByName(resto);
		HashMap<String, Long> hm = new HashMap<>();
	
		for (Restaurant restaurant : result) {
			hm.put(restaurant.getNorthMenu().getDishname(),restaurant.getNorthMenu().getPrice());
			hm.put(restaurant.getSouthMenu().getDishname(),restaurant.getSouthMenu().getPrice());
			hm.put(restaurant.getChineseMenu().getDishname(),restaurant.getChineseMenu().getPrice());
		}
		
		
		return hm;
	}
}
