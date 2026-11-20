package fatecbarueri.dmd.aula.poo.lista2;

import java.util.Scanner;


public class Exercicio_15 {

	    public static void main(String[] args) {
	    	
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite seu peso (kg): ");
	        double peso = entrada.nextDouble();

	        System.out.print("Digite sua altura (m): ");
	        double altura = entrada.nextDouble();

	        if (peso <= 0 || altura <= 0) {
	            System.out.println("Peso ou altura inválidos.");
	        } else {
	            double imc = peso / (altura * altura);

	            System.out.printf("Seu IMC é: %.2f%n", imc);

	            // Classificação do IMC
	            if (imc < 18.5) {
	                System.out.println("Abaixo do peso.");
	            } else if (imc < 25) {
	                System.out.println("Peso normal.");
	            } else if (imc < 30) {
	                System.out.println("Sobrepeso.");
	            } else if (imc < 35) {
	                System.out.println("Obesidade grau I.");
	            } else if (imc < 40) {
	                System.out.println("Obesidade grau II.");
	            } else {
	                System.out.println("Obesidade grau III.");
	            }
	        }

	        entrada.close();
	    }
	}


