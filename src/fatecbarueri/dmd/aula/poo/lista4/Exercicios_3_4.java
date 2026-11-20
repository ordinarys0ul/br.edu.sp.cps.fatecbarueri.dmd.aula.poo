package fatecbarueri.dmd.aula.poo.lista4;


import java.util.Scanner;
public class Exercicios_3_4 {



	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        // Exercício 3 
	        int[] numeros = new int[8];

	        System.out.println("Digite 8 números:");

	        for (int i = 0; i < 8; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = entrada.nextInt();
	        }

	        int maior = numeros[0];
	        int menor = numeros[0];

	        for (int i = 0; i < 8; i++) {
	            if (numeros[i] > maior) {
	                maior = numeros[i];
	            }

	            if (numeros[i] < menor) {
	                menor = numeros[i];
	            }
	        }

	        System.out.println("\nMaior número: " + maior);
	        System.out.println("Menor número: " + menor);

	        // Exercício 4 

	        int[] valores = new int[6];
	        int soma = 0;

	        System.out.println("\nDigite 6 números:");

	        for (int i = 0; i < 6; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            valores[i] = entrada.nextInt();

	            soma += valores[i];
	        }

	        double media = soma / 6.0;

	        System.out.println("\nMédia dos números: " + media);

	        entrada.close();
	    }
	}


