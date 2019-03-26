package it.polito.tdp.provadb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import it.polito.tdp.provadb.model.*;

public class DizionarioDAO {

	
	public boolean esisteParola(String nome) {
		
		Connection conn = DBConnect.getConnection();
		
		try {

			//PROVARE SEMPRE LE QUERY NEL DATABASE
			String sql = "SELECT * FROM parola WHERE nome = ?";
			
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, nome);
			
			ResultSet rs = st.executeQuery();
			
			//Non possiamo mettere return dentro agli if perchè se no non chiudiamo la connessione
			boolean result;
			
			if (rs.next()) {
				result=true;
			} else {
				result=false;
			}
			
			conn.close(); //RICORDA DI CHIUDERE SEMPRE LA CONNESSIONE

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
//	public List<Parola> listAll(){
	//	return dizionario;
	//}
	
	public void creaParola() {
		
	}
	
	
	
}
