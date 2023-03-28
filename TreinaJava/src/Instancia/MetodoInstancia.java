package Instancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.primeroNome = "Adriano";
		cliente.ultimoNome = "Froes da Costa";
		cliente.telefone = "65212843";
		cliente.email = "adriano.costa@nbsi.com.br";
		
		System.out.println("Nome cliente: " + cliente.primeroNome + " " + cliente.ultimoNome);
		 

	}
	
	

}
