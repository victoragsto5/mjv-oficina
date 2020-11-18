package br.com.mjv.oficina.home.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
  *Classe de mapeamento do modelo{@link Defeitos} para a tabela TB_ATENDIMENTO
  *@author Victor de Paula
*/
public class DefeitosRowMapper implements RowMapper<Defeitos> {
	
	@Override
	public Defeitos mapRow(ResultSet rs, int rowNum) throws SQLException {

		Defeitos defeitos = new Defeitos();
		
		defeitos.setId(rs.getInt("ID_DEFEITOS"));
		defeitos.setDescricao(rs.getString("DESCRICAO_DEFEITOS"));
		
		return defeitos;
	}
}
