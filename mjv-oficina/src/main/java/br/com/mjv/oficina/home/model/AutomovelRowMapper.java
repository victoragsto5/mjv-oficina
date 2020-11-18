package br.com.mjv.oficina.home.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
  *Classe de mapeamento do modelo{@link Automovel} para a tabela TB_AUTOMOVEL
  *@author Victor de Paula
*/
public class AutomovelRowMapper implements RowMapper<Automovel> {
	
	@Override
	public Automovel mapRow(ResultSet rs, int rowNum) throws SQLException {

		Automovel automovel = new Automovel();
		
		automovel.setId(rs.getInt("ID_AUTOMOVEL"));
		automovel.setMarca(rs.getString("MARCA_AUTOMOVEL"));
		automovel.setModelo(rs.getString("MODELO_AUTOMOVEL"));
		automovel.setCor(rs.getString("COR_AUTOMOVEL"));
		
		return automovel;
	}
}
