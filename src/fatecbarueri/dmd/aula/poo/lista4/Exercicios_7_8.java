package fatecbarueri.dmd.aula.poo.lista4;

import java.util.Scanner;
public class Exercicios_7_8 {
	

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int[] numeros = new int[10];

	        System.out.println("Digite 10 números:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = entrada.nextInt();
	        }

	        System.out.print("\nDigite o número que deseja: ");
	        int x = entrada.nextInt();

	        // Exercício 7 

	        boolean encontrado = false;

	        for (int i = 0; i < 10; i++) {
	            if (numeros[i] == x) {
	                encontrado = true;
	            }
	        }

	        if (encontrado) {
	            System.out.println("O número " + x + " está presente no vetor.");
	        } else {
	            System.out.println("O número " + x + " não está presente no vetor.");
	        }

	        // Exercício 8 

	        int quantidade = 0;

	        for (int i = 0; i < 10; i++) {
	            if (numeros[i] == x) {
	                quantidade++;
	            }
	        }

	        System.out.println("O número " + x + " aparece " + quantidade + " vez(es) no vetor.");

	        entrada.close();
	    }
	}


