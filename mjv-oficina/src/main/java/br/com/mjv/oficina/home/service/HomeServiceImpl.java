package br.com.mjv.oficina.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mjv.oficina.home.dao.DefeitosDao;
import br.com.mjv.oficina.home.dao.AutomovelDao;
import br.com.mjv.oficina.home.dao.PecasDao;
import br.com.mjv.oficina.home.model.Defeitos;
import br.com.mjv.oficina.home.model.Automovel;
import br.com.mjv.oficina.home.model.Pecas;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private AutomovelDao dao;

	@Override
	public List<Automovel> listarAutomovel() {
		return dao.listar();
	} 
	
	@Autowired 
	private PecasDao pecasDao;
	
	@Override 
	public List<Pecas> listarPecas(){
		return pecasDao.listarPecas();
	} 
	
	@Autowired
	private DefeitosDao atendimentoDao; 
	
	
	public List<Defeitos> listarDefeitos(){
		return atendimentoDao.listarDefeitos();
	}
}
