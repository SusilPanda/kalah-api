package com.cycleon.assesment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KalahGameController {

	@GetMapping(value = "/getStatus")
	public String getGame() {
		return "sucess";
	}
}
