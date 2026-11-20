package fatecbarueri.dmd.aula.poo.lista2;

import java.util.Scanner;
public class Exercicio4_5_8 {


	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        // Exerc 4
	        System.out.print("Digite o primeiro número: ");
	        int numero1 = entrada.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = entrada.nextInt();

	        if (numero1 > numero2) {
	            System.out.println("O maior número é: " + numero1);
	        } else if (numero2 > numero1) {
	            System.out.println("O maior número é: " + numero2);
	        } else {
	            System.out.println("Os números são iguais.");
	        }

	        // Exercício 5
	        System.out.print("\nDigite o terceiro número: ");
	        int numero3 = entrada.nextInt();

	        if (numero1 >= numero2 && numero1 >= numero3) {
	            System.out.println("O maior número é: " + numero1);
	        } else if (numero2 >= numero1 && numero2 >= numero3) {
	            System.out.println("O maior número é: " + numero2);
	        } else {
	            System.out.println("O maior número é: " + numero3);
	        }

	        // Exerc 8
	        System.out.print("\nDigite um número para verificar o intervalo: ");
	        int numero = entrada.nextInt();

	        if (numero >= 10 && numero <= 20) {
	            System.out.println("O número está entre 10 e 20.");
	        } else {
	            System.out.println("O número está fora do intervalo.");
	        }

	        entrada.close();
	    }
	}


