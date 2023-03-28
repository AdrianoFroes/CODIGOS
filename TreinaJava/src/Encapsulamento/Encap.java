package Encapsulamento;

public class Encap {

	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = "Adriano Froes";
//		cliente.telefone = "6521284300";
//		
//		System.out.println("Nome cliente " + cliente.nome);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Adriano Froes ");
		cliente.setTelefone("6521284333");
		
		System.out.println("Nome cliente: " + cliente.getNome() + cliente.getTelefone());
		

	}

}
