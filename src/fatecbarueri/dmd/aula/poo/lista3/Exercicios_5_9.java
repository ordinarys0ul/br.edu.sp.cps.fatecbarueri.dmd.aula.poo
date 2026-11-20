package fatecbarueri.dmd.aula.poo.lista3;

import java.util.Scanner;
public class Exercicios_5_9 {



	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        // Exercício 5 
	    

	        System.out.print("Digite um número: ");
	        int numero = entrada.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;

	            System.out.println(numero + " x " + i + " = " + resultado);
	        }

	        // Exercício 9
	        System.out.println("\nExercício 9 - Fatorial");

	        System.out.print("Digite um número inteiro positivo: ");
	        int valor = entrada.nextInt();

	        if (valor < 0 || valor > 20) {
	            System.out.println("Digite um número entre 0 e 20.");
	        } else {
	            long fatorial = 1;

	            for (int i = 2; i <= valor; i++) {
	                fatorial *= i;
	            }

	            System.out.println(valor + "! = " + fatorial);
	        }

	        entrada.close();
	    }
	}


