package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int  id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		float  salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean  estaDeFerias = false;
		
		char status = 'A';
		
		//System.out.println(anosDeEmpresa * 365);
		
		//numeros de viagem
        System.out.println(numerosDeVoos / 2);
        
        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        
        System.out.println(id + ": ganha R$ " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status " + status + "tivo");
	}

}
