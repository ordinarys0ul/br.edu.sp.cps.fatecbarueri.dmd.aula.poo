package fatecbarueri.dmd.aula.poo.lista5;


import java.util.Scanner;
public class Exercicio_5 {
	


	    public static void mostrarMenu() {
	        System.out.println("\n=== CALCULADORA ===");
	        System.out.println("1 - Somar");
	        System.out.println("2 - Subtrair");
	        System.out.println("3 - Multiplicar");
	        System.out.println("4 - Dividir");
	        System.out.println("0 - Sair");
	    }

	    public static double somar(double a, double b) {
	        return a + b;
	    }

	    public static double subtrair(double a, double b) {
	        return a - b;
	    }

	    public static double multiplicar(double a, double b) {
	        return a * b;
	    }

	    public static double dividir(double a, double b) {
	        return a / b;
	    }

	    public static double lerNumero(Scanner entrada) {
	        System.out.print("Digite um número: ");
	        return entrada.nextDouble();
	    }

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int opcao;
	        double n1, n2, resultado;

	        do {
	            mostrarMenu();

	            System.out.print("Escolha uma opção: ");
	            opcao = entrada.nextInt();

	            if (opcao >= 1 && opcao <= 4) {

	                n1 = lerNumero(entrada);
	                n2 = lerNumero(entrada);

	                switch (opcao) {
	                    case 1:
	                        resultado = somar(n1, n2);
	                        System.out.println("Resultado: " + resultado);
	                        break;

	                    case 2:
	                        resultado = subtrair(n1, n2);
	                        System.out.println("Resultado: " + resultado);
	                        break;

	                    case 3:
	                        resultado = multiplicar(n1, n2);
	                        System.out.println("Resultado: " + resultado);
	                        break;

	                    case 4:
	                        if (n2 != 0) {
	                            resultado = dividir(n1, n2);
	                            System.out.println("Resultado: " + resultado);
	                        } else {
	                            System.out.println("Não é possível dividir por zero.");
	                        }
	                        break;
	                }

	            } else if (opcao == 0) {
	                System.out.println("Calculadora encerrada.");
	            } else {
	                System.out.println("Opção inválida.");
	            }

	        } while (opcao != 0);

	        entrada.close();
	    }
	}


