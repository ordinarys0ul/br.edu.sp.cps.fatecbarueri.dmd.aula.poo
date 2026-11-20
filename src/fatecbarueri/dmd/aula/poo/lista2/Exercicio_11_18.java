package fatecbarueri.dmd.aula.poo.lista2;

import java.util.Scanner;

public class Exercicio_11_18 {
	

	
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        // Exerc 11
	        System.out.print("Digite o primeiro número: ");
	        double numero1 = entrada.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double numero2 = entrada.nextDouble();

	        System.out.print("Digite a operação (+, -, *, /): ");
	        char operacao = entrada.next().charAt(0);

	        switch (operacao) {
	            case '+':
	                System.out.println("Resultado: " + (numero1 + numero2));
	                break;

	            case '-':
	                System.out.println("Resultado: " + (numero1 - numero2));
	                break;

	            case '*':
	                System.out.println("Resultado: " + (numero1 * numero2));
	                break;

	            case '/':
	                if (numero2 != 0) {
	                    System.out.println("Resultado: " + (numero1 / numero2));
	                } else {
	                    System.out.println("Não é possível dividir por zero.");
	                }
	                break;

	            default:
	                System.out.println("Operação inválida.");
	        }

	        // Exerc 18
	        int opcao;

	        do {
	            System.out.println("\n--- MENU DA CALCULADORA ---");
	            System.out.println("1 - Somar");
	            System.out.println("2 - Subtrair");
	            System.out.println("3 - Multiplicar");
	            System.out.println("4 - Dividir");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");

	            opcao = entrada.nextInt();

	            if (opcao >= 1 && opcao <= 4) {
	                System.out.print("Digite o primeiro número: ");
	                numero1 = entrada.nextDouble();

	                System.out.print("Digite o segundo número: ");
	                numero2 = entrada.nextDouble();

	                switch (opcao) {
	                    case 1:
	                        System.out.println("Resultado: " + (numero1 + numero2));
	                        break;

	                    case 2:
	                        System.out.println("Resultado: " + (numero1 - numero2));
	                        break;

	                    case 3:
	                        System.out.println("Resultado: " + (numero1 * numero2));
	                        break;

	                    case 4:
	                        if (numero2 != 0) {
	                            System.out.println("Resultado: " + (numero1 / numero2));
	                        } else {
	                            System.out.println("Não é possível dividir por zero.");
	                        }
	                        break;
	                }

	            } else if (opcao != 0) {
	                System.out.println("Opção inválida.");
	            }

	        } while (opcao != 0);

	        System.out.println("Calculadora encerrada.");

	        entrada.close();
	    }
	}

