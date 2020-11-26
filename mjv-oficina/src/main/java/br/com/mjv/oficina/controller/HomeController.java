package br.com.mjv.oficina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public ModelAndView iniciarTela() {
		//return back to home.jsp
		ModelAndView model = new ModelAndView("home");
		
		return model;

	}
}
