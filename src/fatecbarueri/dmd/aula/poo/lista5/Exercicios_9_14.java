package fatecbarueri.dmd.aula.poo.lista5;


import java.util.Scanner;
public class Exercicios_9_14 {
	

	

	    // Exercício 9 - Sistema bancário simples

	    public static void mostrarMenu() {
	        System.out.println("\n=== SISTEMA BANCÁRIO ===");
	        System.out.println("1 - Depositar");
	        System.out.println("2 - Sacar");
	        System.out.println("3 - Consultar saldo");
	        System.out.println("0 - Encerrar");
	    }

	    public static double depositar(double saldo, double valor) {
	        if (valor <= 0) {
	            System.out.println("Valor inválido.");
	            return saldo;
	        }

	        System.out.println("Depósito realizado com sucesso!");
	        return saldo + valor;
	    }

	    public static double sacar(double saldo, double valor) {
	        if (valor <= 0) {
	            System.out.println("Valor inválido.");
	            return saldo;
	        }

	        if (valor > saldo) {
	            System.out.println("Saldo insuficiente.");
	            return saldo;
	        }

	        System.out.println("Saque realizado com sucesso!");
	        return saldo - valor;
	    }

	    public static void consultarSaldo(double saldo) {
	        System.out.println("Saldo atual: R$ " + saldo);
	    }

	    // Exercício 14 - Caixa eletrônico

	    public static void encerrarSistema() {
	        System.out.println("Sistema encerrado.");
	    }

	    public static double lerValor(Scanner entrada) {
	        System.out.print("Digite o valor: R$ ");
	        return entrada.nextDouble();
	    }

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        double saldo = 1000;
	        int opcao;

	        do {
	            mostrarMenu();

	            System.out.print("Escolha uma opção: ");
	            opcao = entrada.nextInt();

	            switch (opcao) {
	                case 1:
	                    double deposito = lerValor(entrada);
	                    saldo = depositar(saldo, deposito);
	                    break;

	                case 2:
	                    double saque = lerValor(entrada);
	                    saldo = sacar(saldo, saque);
	                    break;

	                case 3:
	                    consultarSaldo(saldo);
	                    break;

	                case 0:
	                    encerrarSistema();
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	            }

	        } while (opcao != 0);

	        entrada.close();
	    }
	}


