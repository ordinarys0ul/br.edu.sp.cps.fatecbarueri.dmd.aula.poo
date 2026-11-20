package fatecbarueri.dmd.aula.poo.lista2;

import java.util.Scanner;
public class Exercicio_16 {

	
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o valor do saque: R$ ");
	        int valor = entrada.nextInt();

	        if (valor <= 0) {
	            System.out.println("Valor inválido.");
	        } else {
	            // notas qtde
	            int notas100 = valor / 100;
	            valor = valor % 100;

	            int notas50 = valor / 50;
	            valor = valor % 50;

	            int notas20 = valor / 20;
	            valor = valor % 20;

	            int notas10 = valor / 10;
	            valor = valor % 10;

	            int notas5 = valor / 5;
	            valor = valor % 5;

	            int notas2 = valor / 2;
	            valor = valor % 2;

	            System.out.println("\nNotas para o saque:");
	            System.out.println("Notas de R$ 100: " + notas100);
	            System.out.println("Notas de R$ 50: " + notas50);
	            System.out.println("Notas de R$ 20: " + notas20);
	            System.out.println("Notas de R$ 10: " + notas10);
	            System.out.println("Notas de R$ 5: " + notas5);
	            System.out.println("Notas de R$ 2: " + notas2);

	            if (valor > 0) {
	                System.out.println("Valor restante: R$ " + valor);
	            }
	        }

	        entrada.close();
	    }
	}

