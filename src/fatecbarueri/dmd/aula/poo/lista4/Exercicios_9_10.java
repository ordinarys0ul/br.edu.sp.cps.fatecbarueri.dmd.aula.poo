package fatecbarueri.dmd.aula.poo.lista4;


import java.util.Scanner;
import java.util.Arrays;

public class Exercicios_9_10 {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int[] numeros = new int[10];

	        System.out.println("Digite 10 números:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = entrada.nextInt();
	        }

	        // Exercício 9 

	        Arrays.sort(numeros);

	        System.out.println("\nNúmeros em ordem crescente:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print(numeros[i] + " ");
	        }

	        // Exercício 10 

	        System.out.println("\n\nNúmeros sem repetição:");

	        for (int i = 0; i < 10; i++) {
	            if (i == 0 || numeros[i] != numeros[i - 1]) {
	                System.out.print(numeros[i] + " ");
	            }
	        }

	        entrada.close();
	    }
	}


