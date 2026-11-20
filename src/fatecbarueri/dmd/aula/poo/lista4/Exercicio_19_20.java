package fatecbarueri.dmd.aula.poo.lista4;


import java.util.Scanner;

public class Exercicio_19_20 {
	


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

	        // Exercício 19 

	        boolean identidade = true;

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (i == j && matriz[i][j] != 1) {
	                    identidade = false;
	                }

	                if (i != j && matriz[i][j] != 0) {
	                    identidade = false;
	                }
	            }
	        }

	        if (identidade) {
	            System.out.println("\nA matriz é identidade.");
	        } else {
	            System.out.println("\nA matriz não é identidade.");
	        }

	        // Exercício 20

	        System.out.println("\nSoma de cada linha:");

	        for (int i = 0; i < 3; i++) {
	            int somaLinha = 0;

	            for (int j = 0; j < 3; j++) {
	                somaLinha += matriz[i][j];
	            }

	            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
	        }

	        System.out.println("\nSoma de cada coluna:");

	        for (int j = 0; j < 3; j++) {
	            int somaColuna = 0;

	            for (int i = 0; i < 3; i++) {
	                somaColuna += matriz[i][j];
	            }

	            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
	        }

	        entrada.close();
	    }
	}


