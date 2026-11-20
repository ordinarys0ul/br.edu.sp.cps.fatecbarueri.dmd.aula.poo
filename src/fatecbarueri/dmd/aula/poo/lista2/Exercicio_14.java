package fatecbarueri.dmd.aula.poo.lista2;

import java.util.Scanner;
public class Exercicio_14 {
	 public static void main(String[] args) {
	
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o primeiro lado: ");
	        double lado1 = entrada.nextDouble();

	        System.out.print("Digite o segundo lado: ");
	        double lado2 = entrada.nextDouble();

	        System.out.print("Digite o terceiro lado: ");
	        double lado3 = entrada.nextDouble();

	        
	        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ||
	            lado1 + lado2 <= lado3 ||
	            lado1 + lado3 <= lado2 ||
	            lado2 + lado3 <= lado1) {

	            System.out.println("Os valores não formam um triângulo.");

	        } else if (lado1 == lado2 && lado2 == lado3) {
	            System.out.println("Triângulo equilátero.");

	        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	            System.out.println("Triângulo isósceles.");

	        } else {
	            System.out.println("Triângulo escaleno.");
	        }

	        entrada.close();
	    }
	}
