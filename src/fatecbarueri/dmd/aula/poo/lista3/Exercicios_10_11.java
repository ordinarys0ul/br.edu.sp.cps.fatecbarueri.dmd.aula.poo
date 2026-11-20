package fatecbarueri.dmd.aula.poo.lista3;

import java.util.Scanner;

public class Exercicios_10_11 {
	
	
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        // Exercício 10 
	      

	        int soma = 0;
	        int numero;

	        do {
	            System.out.print("Digite um número (0 para sair): ");
	            numero = entrada.nextInt();

	            soma += numero;

	        } while (numero != 0);

	        System.out.println("Soma total: " + soma);


	        // Exercício 11 
	        System.out.println("\nExercício 11 - Validação de número");

	        int valor;

	        do {
	            System.out.print("Digite um número entre 1 e 10: ");
	            valor = entrada.nextInt();

	            if (valor < 1 || valor > 10) {
	                System.out.println("Número inválido. Tente novamente.");
	            }

	        } while (valor < 1 || valor > 10);

	        System.out.println("Número válido: " + valor);

	        entrada.close();
	    }
	}

