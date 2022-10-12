import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int numeroUm = leitor.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int numeroDois = leitor.nextInt();
            
            try {
            	contar(numeroUm, numeroDois);
            
            }catch (ParametrosInvalidosException e) {
            	System.out.println("O primeiro numero é maior que o segundo");
            }
        }
		
	}
	static void contar(int numeroUm, int numeroDois ) throws ParametrosInvalidosException {
		if(numeroUm > numeroDois)
            throw new ParametrosInvalidosException();
        else{
            int contador = numeroDois - numeroUm;
            for(int i =0; i<= contador; i++){
                System.out.println("Imprimindo o numero "+ i); 
            }
        }
	}
}
