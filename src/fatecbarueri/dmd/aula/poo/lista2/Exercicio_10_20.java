package fatecbarueri.dmd.aula.poo.lista2;

import java.util.Scanner;

public class Exercicio_10_20 {


	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        // Exercício 10
	        System.out.print("Digite o valor do produto: R$ ");
	        double valorProduto = entrada.nextDouble();

	        double desconto;

	        if (valorProduto >= 100) {
	            desconto = valorProduto * 0.10;
	        } else {
	            desconto = valorProduto * 0.05;
	        }

	        double valorFinal = valorProduto - desconto;

	        System.out.println("Desconto: R$ " + desconto);
	        System.out.println("Valor final: R$ " + valorFinal);

	        // Exercício 20 
	        System.out.print("\nDigite o salário: R$ ");
	        double salario = entrada.nextDouble();

	        double imposto;

	        if (salario <= 2000) {
	            imposto = 0;
	        } else if (salario <= 3000) {
	            imposto = salario * 0.08;
	        } else if (salario <= 4500) {
	            imposto = salario * 0.18;
	        } else {
	            imposto = salario * 0.28;
	        }

	        double salarioLiquido = salario - imposto;

	        System.out.println("Imposto: R$ " + imposto);
	        System.out.println("Salário líquido: R$ " + salarioLiquido);

	        entrada.close();
	    }
	}


