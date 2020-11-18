package br.com.mjv.oficina.home.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
  *Classe de mapeamento do modelo{@link Pecas} para a tabela TB_PECAS
  *@author Victor de Paula
*/
public class PecasRowMapper implements RowMapper<Pecas> {
	
	@Override
	public Pecas mapRow(ResultSet rs, int rowNum) throws SQLException {

		Pecas pecas = new Pecas();
		
		pecas.setId(rs.getInt("ID_PECAS"));
		pecas.setDescricao(rs.getString("PECAS_DESCRICAO"));
		pecas.setPreco(rs.getDouble("PECAS_PRECO"));
		
		return pecas;
	}
}
