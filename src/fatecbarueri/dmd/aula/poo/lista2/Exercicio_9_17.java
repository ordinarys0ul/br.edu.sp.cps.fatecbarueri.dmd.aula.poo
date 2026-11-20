package fatecbarueri.dmd.aula.poo.lista2;

import java.util.Scanner;

public class Exercicio_9_17 {


	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        String usuarioCorreto = "user";
	        String senhaCorreta = "1234";

	        // Exerc 9
	        System.out.print("Digite o usuário: ");
	        String usuario = entrada.nextLine();

	        System.out.print("Digite a senha: ");
	        String senha = entrada.nextLine();

	        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
	            System.out.println("Login realizado com sucesso!");
	        } else {
	            System.out.println("Usuário ou senha incorretos.");
	        }

	        // Exerc 17
	        int tentativas = 0;
	        boolean acessoPermitido = false;

	        while (tentativas < 3 && !acessoPermitido) {
	            System.out.print("\nDigite o usuário: ");
	            usuario = entrada.nextLine();

	            System.out.print("Digite a senha: ");
	            senha = entrada.nextLine();

	            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
	                System.out.println("Acesso permitido!");
	                acessoPermitido = true;
	            } else {
	                tentativas++;
	                System.out.println("Dados incorretos.");

	                if (tentativas < 3) {
	                    System.out.println("Tentativas restantes: " + (3 - tentativas));
	                }
	            }
	        }

	        if (!acessoPermitido) {
	            System.out.println("Acesso bloqueado após 3 tentativas.");
	        }

	        entrada.close();
	    }
	}


