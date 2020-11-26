package br.com.mjv.oficina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mjv.oficina.dao.TipoVeiculoDao;
import br.com.mjv.oficina.model.TipoVeiculo;

@Service
public class TipoVeiculoServiceImpl implements TipoVeiculoService {

	@Autowired
	private TipoVeiculoDao dao;

	@Override
	public List<TipoVeiculo> listar() {
		return dao.listar();
	}

}
