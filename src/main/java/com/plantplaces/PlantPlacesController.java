package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantPlacesController {

	
	@RequestMapping("/start")
	public String strat() {
	
		return "start";
	}
	
	/*
	 * 		Add index startpoint
	 */
	
	
	@RequestMapping("/")
	public String index() {
	
		return "start";
	}
	
}
