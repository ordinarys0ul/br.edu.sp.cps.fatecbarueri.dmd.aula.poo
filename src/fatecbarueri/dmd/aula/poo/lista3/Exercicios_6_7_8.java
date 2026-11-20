package fatecbarueri.dmd.aula.poo.lista3;


import java.util.Scanner;

public class Exercicios_6_7_8 {

	
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        // Exercício 6 
	        System.out.println("Exercício 6 - Maior número");

	        int maior = 0;

	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int numero = entrada.nextInt();

	            if (i == 1 || numero > maior) {
	                maior = numero;
	            }
	        }

	        System.out.println("Maior número: " + maior);


	        // Exercício 7 
	        System.out.println("\nExercício 7 - Positivos e negativos");

	        int positivos = 0;
	        int negativos = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int numero = entrada.nextInt();

	            if (numero > 0) {
	                positivos++;
	            } else if (numero < 0) {
	                negativos++;
	            }
	        }

	        System.out.println("Quantidade de positivos: " + positivos);
	        System.out.println("Quantidade de negativos: " + negativos);


	        // Exercício 8 
	        System.out.println("\nExercício 8 - Média de valores");

	        System.out.print("Quantos números deseja informar? ");
	        int quantidade = entrada.nextInt();

	        if (quantidade <= 0) {
	            System.out.println("Quantidade inválida.");
	        } else {
	            double soma = 0;

	            for (int i = 1; i <= quantidade; i++) {
	                System.out.print("Digite o " + i + "º número: ");
	                double numero = entrada.nextDouble();

	                soma += numero;
	            }

	            double media = soma / quantidade;

	            System.out.println("Média dos valores: " + media);
	        }

	        entrada.close();
	    }
	}


