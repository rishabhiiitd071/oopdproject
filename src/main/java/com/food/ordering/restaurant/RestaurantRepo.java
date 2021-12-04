package com.food.ordering.restaurant;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends CrudRepository<Restaurant, Long> {
	
	List<Restaurant> findByName(String name);
	List<Restaurant> findByCity(String city);
	
}
