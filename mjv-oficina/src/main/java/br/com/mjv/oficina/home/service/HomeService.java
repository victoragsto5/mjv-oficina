package br.com.mjv.oficina.home.service;

import java.util.List;

import br.com.mjv.oficina.home.model.Defeitos;
import br.com.mjv.oficina.home.model.Automovel;
import br.com.mjv.oficina.home.model.Pecas;

public interface HomeService {

	public List<Automovel> listarAutomovel();

	public List<Pecas> listarPecas(); 
	
	public List<Defeitos> listarDefeitos();
}