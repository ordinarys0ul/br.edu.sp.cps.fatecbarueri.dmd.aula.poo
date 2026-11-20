package fatecbarueri.dmd.aula.poo.lista1;



public class Exercicio_1 {

 private int valor;


 public void zerar() {
     valor = 0;
 }

 
 public void incrementar() {
     valor++;
 }

 
 public int getValor() {
     return valor;
 }

 public static void main(String[] args) {

     Exercicio_1 contador = new Exercicio_1();

     contador.incrementar();
     contador.incrementar();
     contador.incrementar();

     System.out.println("Valor do contador: " + contador.getValor());

     contador.zerar();

     System.out.println("Valor após zerar: " + contador.getValor());
 }
}