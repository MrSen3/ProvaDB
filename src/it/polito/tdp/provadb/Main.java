package it.polito.tdp.provadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public void run() {
		
		//NEL MODEL NON DEVE ESSERCI CODICE JDBC. Questo sarà incapsulato in classi DAO (o una classe con più metodi) e queste saranno le uniche a contattare il database, ma senza sapere il PERCHE' 
		//Il client e il DAO si parlano tramite oggetti
		//Sistemista
		String jdbcURL = "jdbc:mysql://localhost/dizionario?useTimeZone=true&serverTimeZone=UTC&user=root&password=treno";
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
						
			String parola = "gatto"; //immaginiamo che provenga da un txtParola.getText
			
			//Esperto di db
			String sql = "SELECT * FROM parola "+ //occhio agli spazi
					"WHERE nome = ?";
			
			//Non useremo MAI Statement, ma SOLO PreparedStatement
			PreparedStatement st = conn.prepareStatement(sql);
			
			//bisogna dire al programma qual è il valore del parametro ignoto
			st.setString(1, parola);
			
			ResultSet rs = st.executeQuery();
			
			//Colui che si occupa di algoritmi... quindi in questo programma ci sono tante cose diverse, sarebbe meglio dividerle
			//Quindi ResultSet ha metodi per spostare il cursore...
			while (rs.next()) {
				//e i metodi per acquisire i dati che voglio(get...)
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				
				System.out.println(nome);
			}
			
			conn.close(); //RICORDA DI CHIUDERE SEMPRE LA CONNESSIONE
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Main test = new Main(); //istanza di sè stesso
		 test.run();
		 //quando faccio un programmino non metto mai le istruzioni nel main perchè è un metodo statico
	}

}
