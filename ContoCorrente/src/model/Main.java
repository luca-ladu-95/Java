package model;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Luca", "Ladu");
		ContoCorrente conto = new ContoCorrente("1234");
		int scelta =0;
		String s="";

		cliente.setConto(conto);

		System.out.println("Benvenuto nel sistema bancario, siamo qui per rubarti i soldi");

		do {
			
			 scelta = JOptionPane.showOptionDialog(null, "vuoi prelevare/depositare o uscire", "banca", 0, 0, null,
					new String[] { "prelevare", "depositare", "esci" }, "esci");
			 
			 
			 
			 switch(scelta) {
				
				case 0: 
					 s= JOptionPane.showInputDialog("inserisci importo da prelevare:");
					 
					cliente.getConto().preleva(Double.valueOf(s));	
					break;
				case 1:
					s= JOptionPane.showInputDialog("inserisci importo da versare:");
					cliente.getConto().versa(Double.valueOf(s));	
					break;
				case 2:
					break;
					
				
				}
			
		} while (scelta!=2);
		
		
		
		
		
		
		
		
		
		

		

	}

}
