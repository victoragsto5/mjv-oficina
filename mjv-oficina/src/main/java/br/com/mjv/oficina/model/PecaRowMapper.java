package br.com.mjv.oficina.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
  *Classe de mapeamento do modelo{@link Peca} para a tabela TB_PECAS
  *@author Victor de Paula
*/
public class PecaRowMapper implements RowMapper<Peca> {
	
	@Override
	public Peca mapRow(ResultSet rs, int rowNum) throws SQLException {

		Peca pecas = new Peca();
		
		pecas.setId(rs.getInt("ID_PECAS"));
		pecas.setDescricao(rs.getString("PECAS_DESCRICAO"));
		pecas.setPreco(rs.getDouble("PECAS_PRECO"));
		
		return pecas;
	}
}
