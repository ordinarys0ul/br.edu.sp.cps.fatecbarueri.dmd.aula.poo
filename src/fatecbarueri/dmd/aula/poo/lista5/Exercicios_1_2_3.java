package fatecbarueri.dmd.aula.poo.lista5;


import java.util.Scanner;

public class Exercicios_1_2_3 {
	// LISTA 5 - EXERCICIOS 1, 2 E 3
	

	

	    // EXERC 1 

	    public static void mostrarTitulo() {
	        System.out.println("===============");
	        System.out.println("    SISTEMA");
	        System.out.println("===============");
	    }

	    public static void mostrarMenu() {
	        System.out.println("1 - Entrar");
	        System.out.println("2 - Sair");
	    }

	    // EXERC 2 - 

	    public static int somar(int a, int b) {
	        return a + b;
	    }

	    public static void mostrarResultado(int resultado) {
	        System.out.println("Resultado da soma: " + resultado);
	    }

	    // EXERC 3 

	    public static int lerNumero(Scanner entrada) {
	        System.out.print("Digite um número: ");
	        return entrada.nextInt();
	    }

	    public static boolean ehPar(int numero) {
	        return numero % 2 == 0;
	    }

	    public static void mostrarResultado(boolean par) {
	        if (par) {
	            System.out.println("Número par");
	        } else {
	            System.out.println("Número ímpar");
	        }
	    }

	    // MAIN - EXERCÍCIOS 1, 2 E 3

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        // Exercício 1
	        System.out.println("EXERCÍCIO 1");
	        mostrarTitulo();
	        mostrarMenu();

	        // Exercício 2
	        System.out.println("\nEXERCÍCIO 2");

	        int n1 = 10;
	        int n2 = 20;

	        int resultado = somar(n1, n2);
	        mostrarResultado(resultado);

	        // Exercício 3
	        System.out.println("\nEXERCÍCIO 3");

	        int numero = lerNumero(entrada);
	        boolean par = ehPar(numero);

	        mostrarResultado(par);

	        entrada.close();
	    }
	}


