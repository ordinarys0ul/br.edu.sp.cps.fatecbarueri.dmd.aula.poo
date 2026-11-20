package fatecbarueri.dmd.aula.poo.lista5;

import java.util.Scanner;
public class Exercicios_6_7 {



	    

	    public static int lerNumero(Scanner entrada) {
	        System.out.print("Digite um número: ");
	        return entrada.nextInt();
	    }

	    public static void mostrarLinha(int numero, int multiplicador) {
	        System.out.println(numero + " x " + multiplicador
	                + " = " + (numero * multiplicador));
	    }

	    public static void exibirTabuada(int numero) {
	        for (int i = 1; i <= 10; i++) {
	            mostrarLinha(numero, i);
	        }
	    }

	  

	    public static void mostrarNumeros() {
	        System.out.println("\nNúmeros de 1 a 100:");

	        for (int i = 1; i <= 100; i++) {
	            System.out.print(i + " ");
	        }

	        System.out.println();
	    }

	    public static void mostrarPares() {
	        System.out.println("\nNúmeros pares:");

	        for (int i = 2; i <= 100; i += 2) {
	            System.out.print(i + " ");
	        }

	        System.out.println();
	    }

	    public static void mostrarImpares() {
	        System.out.println("\nNúmeros ímpares:");

	        for (int i = 1; i <= 100; i += 2) {
	            System.out.print(i + " ");
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        
	        System.out.println("Exercício 6 - Tabuada");

	        int numero = lerNumero(entrada);
	        exibirTabuada(numero);

	        
	        System.out.println("\nExercício 7 - Contador inteligente");

	        mostrarNumeros();
	        mostrarPares();
	        mostrarImpares();

	        entrada.close();
	    }
	}


