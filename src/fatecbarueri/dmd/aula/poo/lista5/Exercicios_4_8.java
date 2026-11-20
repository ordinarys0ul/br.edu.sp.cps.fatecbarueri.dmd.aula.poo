package fatecbarueri.dmd.aula.poo.lista5;


import java.util.Scanner;
public class Exercicios_4_8 {
	
	
	// LISTA 5 - EXERCiCIOS 4 E 8
	
	

	   

	    public static double lerNota(Scanner entrada) {
	        System.out.print("Digite a nota: ");
	        return entrada.nextDouble();
	    }

	    public static double calcularMedia(double n1, double n2, double n3) {
	        return (n1 + n2 + n3) / 3;
	    }

	    public static String verificarSituacao(double media) {
	        if (media >= 6) {
	            return "Aprovado";
	        } else if (media >= 4) {
	            return "Recuperação";
	        } else {
	            return "Reprovado";
	        }
	    }

	    public static void mostrarResultado(double media, String situacao) {
	        System.out.println("Média: " + media);
	        System.out.println("Situação: " + situacao);
	    }

	    

	    public static String lerNome(Scanner entrada) {
	        System.out.print("Digite seu nome: ");
	        return entrada.nextLine();
	    }

	    public static int lerIdade(Scanner entrada) {
	        System.out.print("Digite sua idade: ");
	        return entrada.nextInt();
	    }

	    public static String lerCidade(Scanner entrada) {
	        entrada.nextLine();
	        System.out.print("Digite sua cidade: ");
	        return entrada.nextLine();
	    }

	    public static void mostrarResumo(String nome, int idade, String cidade) {
	        System.out.println("\n=== RESUMO ===");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Cidade: " + cidade);
	    }

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        // Exerc 4
	        System.out.println("=== EXERCÍCIO 4 - SISTEMA DE NOTAS ===");

	        double n1 = lerNota(entrada);
	        double n2 = lerNota(entrada);
	        double n3 = lerNota(entrada);

	        double media = calcularMedia(n1, n2, n3);
	        String situacao = verificarSituacao(media);

	        mostrarResultado(media, situacao);

	        // Exerc 8
	        System.out.println("\n=== EXERCÍCIO 8 - DADOS PESSOAIS ===");

	        entrada.nextLine();

	        String nome = lerNome(entrada);
	        int idade = lerIdade(entrada);
	        String cidade = lerCidade(entrada);

	        mostrarResumo(nome, idade, cidade);

	        entrada.close();
	    }
	}


