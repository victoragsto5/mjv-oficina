package br.com.mjv.oficina.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.mjv.oficina.model.Peca;
import br.com.mjv.oficina.model.PecaRowMapper;


@Repository
public class PecasDaoImpl implements PecasDao{
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@Override
	public List<Peca> listarPecas() {
		try {
			String sql = " SELECT * FROM TB_PECAS ";

			List<Peca> lista = this.template.query(sql, new PecaRowMapper());
			
			return lista;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	
}
