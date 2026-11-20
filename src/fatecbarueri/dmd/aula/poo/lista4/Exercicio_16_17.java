package fatecbarueri.dmd.aula.poo.lista4;

import java.util.Scanner;

public class Exercicio_16_17 {


	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int[][] matriz = new int[3][3];

	        System.out.println("Digite os 9 números da matriz:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = entrada.nextInt();
	            }
	        }

	        // Exercício 16

	        System.out.println("\nMatriz transposta:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matriz[j][i] + " ");
	            }
	            System.out.println();
	        }

	        // Exercício 17 

	        System.out.print("\nDigite um número para multiplicar a matriz: ");
	        int numero = entrada.nextInt();

	        System.out.println("\nMatriz multiplicada por " + numero + ":");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print((matriz[i][j] * numero) + " ");
	            }
	            System.out.println();
	        }

	        entrada.close();
	    }
	}


