package fatecbarueri.dmd.aula.poo.lista3;

public class Exercicio1_2_3_4 {
	// LISTA 3 - EXERCiCIOS 1, 2, 3 E 4
	
	    public static void main(String[] args) {

	        // Exercício 1 
	        System.out.println("Exercício 1 - Contagem de 1 a 10");

	        for (int numero = 1; numero <= 10; numero++) {
	            System.out.println(numero);
	        }

	        // Exercício 2 
	        System.out.println("\nExercício 2 - Contagem regressiva");

	        for (int numero = 10; numero >= 1; numero--) {
	            System.out.println(numero);
	        }

	        // Exercício 3 
	        System.out.println("\nExercício 3 - Números pares");

	        for (int numero = 2; numero <= 50; numero += 2) {
	            System.out.println(numero);
	        }

	        // Exercício 4 
	        System.out.println("\nExercício 4 - Soma de 1 até 100");

	        int soma = 0;

	        for (int numero = 1; numero <= 100; numero++) {
	            soma += numero;
	        }

	        System.out.println("Soma total: " + soma);
	    }
	}


