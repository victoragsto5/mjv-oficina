package br.com.mjv.oficina.dao;

import java.util.List;

import br.com.mjv.oficina.model.Automovel;


public interface AutomovelDao {
	
	public List<Automovel> listar();
	
	public Automovel incluir(Automovel automovel);
}
