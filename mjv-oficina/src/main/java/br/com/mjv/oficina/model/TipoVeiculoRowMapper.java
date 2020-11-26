package br.com.mjv.oficina.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
  *Classe de mapeamento do modelo{@link Automovel} para a tabela TB_AUTOMOVEL
  *@author Victor de Paula
*/
public class TipoVeiculoRowMapper implements RowMapper<TipoVeiculo> {
	
	@Override
	public TipoVeiculo mapRow(ResultSet rs, int rowNum) throws SQLException {

		TipoVeiculo tipoveiculo = new TipoVeiculo();
		
		tipoveiculo.setId(rs.getInt("ID_TIPO_VEICULO"));
		tipoveiculo.setDescricao(rs.getString("DESCR_TIPO_VEICULO"));
		
		return tipoveiculo;
	}
}
