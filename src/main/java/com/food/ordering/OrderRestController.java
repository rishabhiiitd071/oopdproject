package com.food.ordering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.food.ordering.restaurant.RestoService;

@RestController
@CrossOrigin
public class OrderRestController {

	@Autowired
	private RestoService serve; 
	
	@GetMapping("/getresto")
	public Object getRestaurant() {
		
		return serve.getRestaurant();
	}
	
	@GetMapping("/getmenu")
	@ResponseBody
	public Object getMenu(@RequestParam(name = "restName") String restName) {
		
		return serve.getMenu(restName);
	}
	
}
