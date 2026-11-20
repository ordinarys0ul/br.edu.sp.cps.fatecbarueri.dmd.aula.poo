package fatecbarueri.dmd.aula.poo.lista2;

	// LISTA 2 - exerc 7
	
	import java.util.Scanner;
	public class Exercicio7 {

	 public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in); 
	double a=entrada.nextDouble(),b=entrada.nextDouble(),media=(a+b)/2; 
	System.out.println("Média: "+media); 
	System.out.println(media<4?"Reprovado":media<6?"Recuperação":"Aprovado"); entrada.close();
	 }
	}
