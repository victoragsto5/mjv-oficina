package br.com.mjv.oficina.dao;

import java.util.List;

import br.com.mjv.oficina.model.Defeitos;


public interface DefeitosDao {
	
	public List<Defeitos> listarDefeitos();
	
	public Defeitos incluir(Defeitos Defeitos);
}
