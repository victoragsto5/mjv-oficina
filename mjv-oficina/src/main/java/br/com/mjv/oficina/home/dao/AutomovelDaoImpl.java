package br.com.mjv.oficina.home.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.mjv.oficina.home.model.Automovel;
import br.com.mjv.oficina.home.model.AutomovelRowMapper;

@Repository
public class AutomovelDaoImpl implements AutomovelDao{
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@Override
	public List<Automovel> listar() {
		try {
			String sql = " SELECT * FROM TB_AUTOMOVEL ";

			List<Automovel> lista = this.template.query(sql, new AutomovelRowMapper());
			
			return lista;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public Automovel incluir(Automovel hq) {
		return null;
	}

	
}
