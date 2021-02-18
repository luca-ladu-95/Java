package model;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContoCorrente {

	private Double saldo;
	private String pin;

	public ContoCorrente(String pin) {

		this.saldo = 0.0;
		this.pin = pin;
	}

	public Double getSaldo() {
		return saldo;
	}

	private void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void versa(double importo) {

		if (controllo()) {

			this.setSaldo(importo);
			
			JOptionPane.showMessageDialog(null, "Saldo:"+this.saldo);
		}

	}

	public void preleva(double importo) {

		if (controllo()) {

			if(this.saldo-importo < 0)
				JOptionPane.showMessageDialog(null, "Sei povero");
			else
				this.saldo-=importo;
			
			
			JOptionPane.showMessageDialog(null, "Saldo:"+this.saldo);
		}

	}
	

	private boolean controllo() {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		boolean flag = false;
		String s ="";
		
		for(int i=0; i<3 && !flag ;i++) {

		    s= JOptionPane.showInputDialog("Inserisci pin:");
		    
		    if(this.pin.equals(s)) flag=true;
		
		
		}
		
		return flag;

	}

}
