package br.com.mjv.oficina.home.dao;

import java.util.List;

import br.com.mjv.oficina.home.model.Pecas;


public interface PecasDao {
	
	public List<Pecas> listarPecas();
	
	public Pecas incluir(Pecas Pecas);
}
