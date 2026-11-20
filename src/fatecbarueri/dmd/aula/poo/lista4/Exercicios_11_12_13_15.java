package fatecbarueri.dmd.aula.poo.lista4;

import java.util.Scanner;
public class Exercicios_11_12_13_15 {
	

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int[][] matriz = new int[3][3];

	        // Exerc 11  

	        System.out.println("Digite os 9 números da matriz:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = entrada.nextInt();
	            }
	        }

	        System.out.println("\nMatriz digitada:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Exercíc 12

	        int soma = 0;

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                soma += matriz[i][j];
	            }
	        }

	        System.out.println("\nSoma de todos os elementos: " + soma);

	        // Exerc 13 

	        int somaDiagonal = 0;

	        for (int i = 0; i < 3; i++) {
	            somaDiagonal += matriz[i][i];
	        }

	        System.out.println("Soma da diagonal principal: " + somaDiagonal);

	        // Exerc 15

	        int pares = 0;

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (matriz[i][j] % 2 == 0) {
	                    pares++;
	                }
	            }
	        }

	        System.out.println("Quantidade de números pares: " + pares);

	        entrada.close();
	    }
	}


