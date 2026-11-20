package fatecbarueri.dmd.aula.poo.lista4;

import java.util.Scanner;
public class Exercicio_14 {
	

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int[][] matriz = new int[4][4];

	        System.out.println("Digite os 16 números da matriz:");

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = entrada.nextInt();
	            }
	        }

	        int maior = matriz[0][0];

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                if (matriz[i][j] > maior) {
	                    maior = matriz[i][j];
	                }
	            }
	        }

	        System.out.println("\nMaior valor da matriz: " + maior);

	        entrada.close();
	    }
	}


