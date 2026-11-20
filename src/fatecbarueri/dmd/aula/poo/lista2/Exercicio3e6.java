package fatecbarueri.dmd.aula.poo.lista2;

import java.util.Scanner;
public class Exercicio3e6 {
	
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        // Exerc 3 
        if (idade < 0) {
            System.out.println("Idade inválida.");
        } else {
            if (idade >= 18) {
                System.out.println("Maior idade.");
            } else {
                System.out.println("Menor idade.");
            }

            // Exerc 6 
            if (idade < 12) {
                System.out.println("Criança");
            } else if (idade < 18) {
                System.out.println("Adolescente");
            } else if (idade < 60) {
                System.out.println("Adulto");
            } else {
                System.out.println("Idoso");
            }
        }

        entrada.close();
    }
}
