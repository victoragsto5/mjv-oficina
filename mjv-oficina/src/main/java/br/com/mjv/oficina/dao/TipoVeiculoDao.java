package br.com.mjv.oficina.dao;

import java.util.List;

import br.com.mjv.oficina.model.TipoVeiculo;


public interface TipoVeiculoDao {
	
	public List<TipoVeiculo> listar();
	
	public TipoVeiculo incluir(TipoVeiculo automovel);
}
