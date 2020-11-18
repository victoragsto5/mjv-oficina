package br.com.mjv.oficina.home.dao;

import java.util.List;

import br.com.mjv.oficina.home.model.Automovel;


public interface AutomovelDao {
	
	public List<Automovel> listar();
	
	public Automovel incluir(Automovel automovel);
}
