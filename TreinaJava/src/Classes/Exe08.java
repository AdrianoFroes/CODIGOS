package Classes;

import javax.swing.JOptionPane;

public class Exe08 {
	
	public static void main(String[] args) {
		
		double real = 0;
		double dolar = 0;
		double cotacao = 0;
		
		JOptionPane.showInputDialog("Infome a quantidade em Dolar");
		JOptionPane.showInputDialog("Informe a cotacao do Dolar");
		
		real = dolar * cotacao;
		
		JOptionPane.showMessageDialog(null, "Quantidade em reias convertido " + real + " R$");

	}

}
