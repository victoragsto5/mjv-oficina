package br.com.mjv.oficina.home.dao;

import java.util.List;

import br.com.mjv.oficina.home.model.Defeitos;


public interface DefeitosDao {
	
	public List<Defeitos> listarDefeitos();
	
	public Defeitos incluir(Defeitos Defeitos);
}
