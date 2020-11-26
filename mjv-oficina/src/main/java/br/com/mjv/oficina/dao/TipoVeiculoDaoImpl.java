package br.com.mjv.oficina.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.mjv.oficina.model.TipoVeiculo;
import br.com.mjv.oficina.model.TipoVeiculoRowMapper;

@Repository
public class TipoVeiculoDaoImpl implements TipoVeiculoDao{
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@Override
	public List<TipoVeiculo> listar() {
		try {
			String sql = " SELECT * FROM TB_TIPO_VEICULO ";

			List<TipoVeiculo> lista = this.template.query(sql, new TipoVeiculoRowMapper());
			
			return lista;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public TipoVeiculo incluir(TipoVeiculo tipoVeiculo) {
		return null;
	}

	
}
