package fatecbarueri.dmd.aula.poo.lista3;

import java.util.Scanner;
public class Exercicio_12 {
	


	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int opcao;

	        do {
	          
	            System.out.println("\n--- MENU ---");
	            System.out.println("1 - Somar");
	            System.out.println("2 - Subtrair");
	            System.out.println("3 - Sair");
	            System.out.print("Escolha uma opção: ");

	            opcao = entrada.nextInt();

	            if (opcao == 1 || opcao == 2) {
	                System.out.print("Digite o primeiro número: ");
	                int numero1 = entrada.nextInt();

	                System.out.print("Digite o segundo número: ");
	                int numero2 = entrada.nextInt();

	                if (opcao == 1) {
	                    System.out.println("Resultado: " + (numero1 + numero2));
	                } else {
	                    System.out.println("Resultado: " + (numero1 - numero2));
	                }

	            } else if (opcao == 3) {
	                System.out.println("Programa encerrado.");

	            } else {
	                System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao != 3);

	        entrada.close();
	    }
	}


