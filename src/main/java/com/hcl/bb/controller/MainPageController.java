package com.hcl.bb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @author Rasool Malik Vempalli
 */
@Controller
public class MainPageController {

	@GetMapping("/")
	public String home()
	{
		return "main";
	}
}
