package br.com.ti052023.patrimonio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.ti052023.patrimonio.pojo.Patrimonio;

public class DAOPatrimonio {
	
	public String cadastrar(Patrimonio patrimonio) {
	
		String resp = null;
		
		//variável para a conexão com banco de dados
		Connection con = null;
		
		//para executar as consultas sql utilizaremos 
		//o comando PreparedStatement associado a uma 
		//variavel
		PreparedStatement pst = null;
		
		
		try { 
			//Carregar o drive de comunicação com o banco de dados
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//pasagem da URL de conexão com o banco de dados,
			//nome de usuario, senha e porta de comunicação
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbpatrimonio?useSSL=false", "root", "");
			//criar uma variável para utilizar o comando insert into e, assim cadastrar os dados
			//do patrimonio no bando de dados.
			//Esta consulta utilizá passagem de dados por
			//parâmetro, para evitar SQLinject (comando para proteção contra invasão e danos)
			String consulta = "INSERT INTO tbl_patrimonio(serie,nomepatrimonio,tipo,descricao,localizacao,datafabricacao,dataaquisicao)VALUES(?,?,?,?,?,?,?)";
			//preparar a consulta para ser execuada.
			pst = con.prepareStatement(consulta);
			//passagem dos dados aos parâmetros
			pst.setString(1, patrimonio.getSerie());
			pst.setString(2, patrimonio.getNomepatrimonio());
			pst.setString(3, patrimonio.getTipo());
			pst.setString(4, patrimonio.getDescricao());
			pst.setString(5, patrimonio.getLocalizacao());
			pst.setString(6, patrimonio.getFabricacao());
			pst.setString(7, patrimonio.getDataaquisicao());
			
			//Executar a consulta de inserção. A consulta pode retornar 0 ou 1.
			//Caso retorne 0 significa que os dados do patrimonio não foram cadastrados.
			//Caso retorne 1 significa que cadastrou.
			if(pst.executeUpdate() > 0) {
				resp = "Patrimônio cadastrado com sucesso!";
			}
			else {
				resp = "Não foi possível cadastrar.";
			}
			
		}
		catch(Exception ex) {
			resp = "Erro ao tentar cadastrar o patrimônio."+ex.getMessage();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			         
		}
			
		
		
		return resp;
	}
	
}
