package fatecbarueri.dmd.aula.poo.lista2;


import java.util.Scanner;
public class Exercicio_19 {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite a temperatura em °C: ");
	        double temperatura = entrada.nextDouble();

	        // temp
	        if (temperatura < 0) {
	            System.out.println("Temperatura congelante.");
	        } else if (temperatura < 15) {
	            System.out.println("Temperatura fria.");
	        } else if (temperatura < 25) {
	            System.out.println("Temperatura agradável.");
	        } else if (temperatura < 35) {
	            System.out.println("Temperatura quente.");
	        } else {
	            System.out.println("Temperatura muito quente.");
	        }

	        entrada.close();
	    }
	}


