package it.polito.tdp.provadb;

import it.polito.tdp.provadb.db.DizionarioDAO;

public class Main {
	
	public void run() {
						
			String parola = "gatto"; //immaginiamo che provenga da un txtParola.getText
			
			DizionarioDAO dao = new DizionarioDAO();
			
			if(dao.esisteParola(parola))
				System.out.println("La parola " +parola+ " esiste!\n");
			else
				System.out.println("La parola " +parola+ " non esiste!\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Main test = new Main(); //istanza di sè stesso
		 test.run();
		 //quando faccio un programmino non metto mai le istruzioni nel main perchè è un metodo statico
	}

}
