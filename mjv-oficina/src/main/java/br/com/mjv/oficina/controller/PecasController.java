package br.com.mjv.oficina.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.mjv.oficina.service.PecasService;
import br.com.mjv.oficina.service.TipoVeiculoService;


@Controller
@RequestMapping("/pecas")
public class PecasController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PecasController.class);
	
	@Autowired
	private TipoVeiculoService tipoVeiculoService;
	
	@Autowired
	private PecasService pecasService;
	
	@GetMapping
	public ModelAndView iniciarTela() {
		ModelAndView mv = new ModelAndView("pecas");
		mv.addObject("tiposVeiculoList", tipoVeiculoService.listar());
		
		return mv;
	}
	
	@PostMapping("/listarPecas")
	public ModelAndView listarPecas(Integer idVeiculo, String nomeCliente) {
		LOGGER.info("==================");
		LOGGER.info("LISTAR PEÇAS");
		LOGGER.info("==================");
		ModelAndView mv = new ModelAndView("pecas");
		mv.addObject("listaPecas", pecasService.listar());
		
		return mv;
	}

	
	private void testeChamadaPost() {
		LOGGER.info("==================");
		LOGGER.info("TESTE CHAMADA POST");
		LOGGER.info("==================");
	}
}
