package fatecbarueri.dmd.aula.poo.lista5;


import java.util.Scanner;
import java.util.Random;
public class Exercicios_11_12 {


	    // EXERCICIO 11 - JOGO DE ADIVINHAr

	    public static int sortearNumero() {
	        Random random = new Random();
	        return random.nextInt(100) + 1;
	    }

	    public static int lerPalpite(Scanner entrada) {
	        System.out.print("Digite seu palpite (1 a 100): ");
	        return entrada.nextInt();
	    }

	    public static boolean verificarAcerto(int palpite, int numero) {
	        return palpite == numero;
	    }

	    public static void mostrarDica(int palpite, int numero) {
	        if (palpite < numero) {
	            System.out.println("O número é maior!");
	        } else {
	            System.out.println("O número é menor!");
	        }
	    }

	    public static void mostrarVitoria() {
	        System.out.println("Parabéns! Você acertou!");
	    }

	    public static void jogarAdivinhacao(Scanner entrada) {
	        int numero = sortearNumero();
	        int palpite;

	        System.out.println("\n=== JOGO DE ADIVINHAÇÃO ===");

	        do {
	            palpite = lerPalpite(entrada);

	            if (verificarAcerto(palpite, numero)) {
	                mostrarVitoria();
	            } else {
	                mostrarDica(palpite, numero);
	            }

	        } while (!verificarAcerto(palpite, numero));
	    }

	    // EXERCI1CIO 12 - PEDRA, PAPEL OU TESOURA

	    public static void mostrarMenu() {
	        System.out.println("\n=== PEDRA, PAPEL OU TESOURA ===");
	        System.out.println("1 - Pedra");
	        System.out.println("2 - Papel");
	        System.out.println("3 - Tesoura");
	    }

	    public static int jogadaComputador() {
	        Random random = new Random();
	        return random.nextInt(3) + 1;
	    }

	    public static int jogadaJogador(Scanner entrada) {
	        System.out.print("Escolha sua jogada: ");
	        return entrada.nextInt();
	    }

	    public static String verificarVencedor(int jogador, int computador) {
	        if (jogador == computador) {
	            return "Empate!";
	        }

	        if ((jogador == 1 && computador == 3) ||
	            (jogador == 2 && computador == 1) ||
	            (jogador == 3 && computador == 2)) {
	            return "Você venceu!";
	        }

	        return "O computador venceu!";
	    }

	    public static void mostrarResultado(int jogador, int computador,
	                                        String resultado) {

	        String[] jogadas = {"", "Pedra", "Papel", "Tesoura"};

	        System.out.println("Sua jogada: " + jogadas[jogador]);
	        System.out.println("Computador: " + jogadas[computador]);
	        System.out.println(resultado);
	    }

	    public static void jogarPedraPapelTesoura(Scanner entrada) {
	        mostrarMenu();

	        int jogador = jogadaJogador(entrada);

	        if (jogador < 1 || jogador > 3) {
	            System.out.println("Jogada inválida!");
	            return;
	        }

	        int computador = jogadaComputador();
	        String resultado = verificarVencedor(jogador, computador);

	        mostrarResultado(jogador, computador, resultado);
	    }

	    // MAIN - EXERCÍCIOS 11 E 12

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int opcao;

	        do {
	            System.out.println("\n=== MENU DE JOGOS ===");
	            System.out.println("1 - Jogo de Adivinhação");
	            System.out.println("2 - Pedra, Papel ou Tesoura");
	            System.out.println("0 - Sair");

	            System.out.print("Escolha uma opção: ");
	            opcao = entrada.nextInt();

	            switch (opcao) {
	                case 1:
	                    jogarAdivinhacao(entrada);
	                    break;

	                case 2:
	                    jogarPedraPapelTesoura(entrada);
	                    break;

	                case 0:
	                    System.out.println("Encerrando jogos...");
	                    break;

	                default:
	                    System.out.println("Opção inválida!");
	            }

	        } while (opcao != 0);

	        entrada.close();
	    }
	}


