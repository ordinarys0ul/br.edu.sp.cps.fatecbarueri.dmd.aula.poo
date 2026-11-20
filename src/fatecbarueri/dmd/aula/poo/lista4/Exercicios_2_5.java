package fatecbarueri.dmd.aula.poo.lista4;

import java.util.Scanner;
public class Exercicios_2_5 {
	

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int[] numeros = new int[10];

	        // Exercício 2 

	        int soma = 0;

	        System.out.println("Digite 10 números:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = entrada.nextInt();

	            soma += numeros[i];
	        }

	        System.out.println("\nSoma dos elementos: " + soma);

	        // Exercício 5 

	        int pares = 0;

	        for (int i = 0; i < 10; i++) {
	            if (numeros[i] % 2 == 0) {
	                pares++;
	            }
	        }

	        System.out.println("Quantidade de números pares: " + pares);

	        entrada.close();
	    }
	}


