package jogovelha;


import java.util.Scanner;
	public class Jogo_da_velha {
	

	    static char[][] tabuleiro = new char[3][3];
	    static Scanner entrada = new Scanner(System.in);

	    public static void main(String[] args) {

	        char jogador = 'X';
	        boolean terminou = false;

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tabuleiro[i][j] = ' ';
	            }
	        }

	        while (!terminou) {

	            exibirTabuleiro();
	            realizarJogada(jogador);

	            if (verificarVitoria(jogador)) {
	                exibirTabuleiro();
	                System.out.println("O jogador " + jogador + " venceu!");
	                terminou = true;

	            } else if (tabuleiroCompleto()) {
	                exibirTabuleiro();
	                System.out.println("A partida terminou empatada!");
	                terminou = true;

	            } else {
	                jogador = trocarJogador(jogador);
	            }
	        }

	        entrada.close();
	    }

	    public static void exibirTabuleiro() {

	        System.out.println("\n    1   2   3");
	        System.out.println("  +---+---+---+");

	        for (int i = 0; i < 3; i++) {
	            System.out.print((i + 1) + " |");

	            for (int j = 0; j < 3; j++) {
	                System.out.print(" " + tabuleiro[i][j] + " |");
	            }

	            System.out.println();
	            System.out.println("  +---+---+---+");
	        }
	    }

	    public static void realizarJogada(char jogador) {

	        int linha;
	        int coluna;

	        while (true) {

	            System.out.print("\nJogador " + jogador + ", informe a linha: ");

	            if (!entrada.hasNextInt()) {
	                System.out.println("Digite um número entre 1 e 3.");
	                entrada.next();
	                continue;
	            }

	            linha = entrada.nextInt();

	            System.out.print("Jogador " + jogador + ", informe a coluna: ");

	            if (!entrada.hasNextInt()) {
	                System.out.println("Digite um número entre 1 e 3.");
	                entrada.next();
	                continue;
	            }

	            coluna = entrada.nextInt();

	            if (!posicaoValida(linha, coluna)) {
	                System.out.println("Posição inválida. Escolha valores entre 1 e 3.");

	            } else if (tabuleiro[linha - 1][coluna - 1] != ' ') {
	                System.out.println("Essa posição já está ocupada. Escolha outra posição.");

	            } else {
	                tabuleiro[linha - 1][coluna - 1] = jogador;
	                break;
	            }
	        }
	    }

	    public static boolean posicaoValida(int linha, int coluna) {
	        return linha >= 1 && linha <= 3
	                && coluna >= 1 && coluna <= 3;
	    }

	    public static boolean verificarVitoria(char jogador) {

	        for (int i = 0; i < 3; i++) {

	            if (tabuleiro[i][0] == jogador
	                    && tabuleiro[i][1] == jogador
	                    && tabuleiro[i][2] == jogador) {
	                return true;
	            }

	            if (tabuleiro[0][i] == jogador
	                    && tabuleiro[1][i] == jogador
	                    && tabuleiro[2][i] == jogador) {
	                return true;
	            }
	        }

	        if (tabuleiro[0][0] == jogador
	                && tabuleiro[1][1] == jogador
	                && tabuleiro[2][2] == jogador) {
	            return true;
	        }

	        if (tabuleiro[0][2] == jogador
	                && tabuleiro[1][1] == jogador
	                && tabuleiro[2][0] == jogador) {
	            return true;
	        }

	        return false;
	    }

	    public static boolean tabuleiroCompleto() {

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {

	                if (tabuleiro[i][j] == ' ') {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public static char trocarJogador(char jogador) {

	        if (jogador == 'X') {
	            return 'O';
	        }

	        return 'X';
	    }
	}


