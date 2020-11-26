package br.com.mjv.oficina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mjv.oficina.dao.PecasDao;
import br.com.mjv.oficina.model.Peca;

@Service
public class PecasServiceImpl implements PecasService {

	@Autowired 
	private PecasDao dao;
	
	@Override 
	public List<Peca> listar(){
		return dao.listarPecas();
	} 
	
}
