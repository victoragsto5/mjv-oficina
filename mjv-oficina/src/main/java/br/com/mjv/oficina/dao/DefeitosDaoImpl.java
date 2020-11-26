package br.com.mjv.oficina.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.mjv.oficina.model.Defeitos;
import br.com.mjv.oficina.model.DefeitosRowMapper;



@Repository
public class DefeitosDaoImpl implements DefeitosDao{
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@Override
	public List<Defeitos> listarDefeitos() {
		try {
			String sql = " SELECT * FROM TB_DEFEITOS ";

			List<Defeitos> lista = this.template.query(sql, new DefeitosRowMapper());
			
			return lista;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public Defeitos incluir(Defeitos defeitos) {
		return null;
	}



	
}
