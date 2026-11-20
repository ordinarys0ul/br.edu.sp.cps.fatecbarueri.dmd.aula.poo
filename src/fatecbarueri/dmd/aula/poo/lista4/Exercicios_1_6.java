package fatecbarueri.dmd.aula.poo.lista4;


import java.util.Scanner;
public class Exercicios_1_6 {
	

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int[] numeros = new int[5];

	        // Exerc 1 

	        System.out.println("Digite 5 números:");

	        for (int i = 0; i < 5; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = entrada.nextInt();
	        }

	        System.out.println("\nNúmeros digitados:");

	        for (int i = 0; i < 5; i++) {
	            System.out.print(numeros[i] + " ");
	        }

	        // Exerc 6

	        System.out.println("\n\nNúmeros na ordem inversa:");

	        for (int i = 4; i >= 0; i--) {
	            System.out.print(numeros[i] + " ");
	        }

	        entrada.close();
	    }
	}


