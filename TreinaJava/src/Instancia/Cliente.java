package Instancia;

public class Cliente {
	
	String primeroNome;
	String ultimoNome;
	String telefone;
	String email;
	
	String obterNomeCompletoCliente(Cliente cliente) {
		String nomeCompleto = cliente.primeroNome + "" + cliente.ultimoNome;
		
		return nomeCompleto;
	}
	

}
