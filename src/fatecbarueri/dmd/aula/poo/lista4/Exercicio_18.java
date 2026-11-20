package fatecbarueri.dmd.aula.poo.lista4;


import java.util.Scanner;

public class Exercicio_18 {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int[][] matriz1 = new int[3][3];
	        int[][] matriz2 = new int[3][3];
	        int[][] soma = new int[3][3];

	        System.out.println("Digite os números da primeira matriz:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Posição [" + i + "][" + j + "]: ");
	                matriz1[i][j] = entrada.nextInt();
	            }
	        }

	        System.out.println("\nDigite os números da segunda matriz:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Posição [" + i + "][" + j + "]: ");
	                matriz2[i][j] = entrada.nextInt();
	            }
	        }

	        System.out.println("\nSoma das matrizes:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                soma[i][j] = matriz1[i][j] + matriz2[i][j];
	                System.out.print(soma[i][j] + " ");
	            }
	            System.out.println();
	        }

	        entrada.close();
	    }
	}


