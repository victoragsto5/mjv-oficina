package br.com.mjv.oficina.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.mjv.oficina.home.model.Defeitos;
import br.com.mjv.oficina.home.model.Automovel;
import br.com.mjv.oficina.home.model.Pecas;
import br.com.mjv.oficina.home.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService service;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getdata() {

		List<Automovel> listAutomovel = service.listarAutomovel();
		List<Pecas> listPecas = service.listarPecas();
		List<Defeitos> listDefeitos = service.listarDefeitos();
		//List<News> listNews = service.listarNews(); // Falta criar as classes / interfaces para receber os parametros.
		
		//return back to home.jsp
		ModelAndView model = new ModelAndView("home");
		model.addObject("listAUTOMOVEL", listAutomovel);
		model.addObject("listPECAS", listPecas);
		model.addObject("listDEFEITOS", listDefeitos);
		
		return model;

	}
}
