package br.com.mjv.oficina.home.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.mjv.oficina.home.model.Pecas;
import br.com.mjv.oficina.home.model.PecasRowMapper;


@Repository
public class PecasDaoImpl implements PecasDao{
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@Override
	public List<Pecas> listarPecas() {
		try {
			String sql = " SELECT * FROM TB_PECAS ";

			List<Pecas> lista = this.template.query(sql, new PecasRowMapper());
			
			return lista;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public Pecas incluir(Pecas hq) {
		return null;
	}



	
}
