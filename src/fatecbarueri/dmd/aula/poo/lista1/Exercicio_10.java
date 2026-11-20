package fatecbarueri.dmd.aula.poo.lista1;

import java.util.Arrays;
public class Exercicio_10 {



    private String[] elementos;

    public Exercicio_10() {
        elementos = new String[0];
    }

    public boolean adicionar(String elemento) {
        if (elemento == null || pertence(elemento)) {
            return false;
        }

        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = elemento;

        return true;
    }

    public boolean pertence(String elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }

        return false;
    }

    public Exercicio_10 uniao(Exercicio_10 outro) {
        Exercicio_10 resultado = new Exercicio_10();

        for (String elemento : elementos) {
            resultado.adicionar(elemento);
        }

        for (String elemento : outro.elementos) {
            resultado.adicionar(elemento);
        }

        return resultado;
    }

    public Exercicio_10 inter(Exercicio_10 outro) {
        Exercicio_10 resultado = new Exercicio_10();

        for (String elemento : elementos) {
            if (outro.pertence(elemento)) {
                resultado.adicionar(elemento);
            }
        }

        return resultado;
    }

    public Exercicio_10 menos(Exercicio_10 outro) {
        Exercicio_10 resultado = new Exercicio_10();

        for (String elemento : elementos) {
            if (!outro.pertence(elemento)) {
                resultado.adicionar(elemento);
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
    public static void main(String[] args) {

        Exercicio_10 conjunto1 = new Exercicio_10();
        Exercicio_10 conjunto2 = new Exercicio_10();

        conjunto1.adicionar("A");
        conjunto1.adicionar("B");
        conjunto1.adicionar("C");

        conjunto2.adicionar("B");
        conjunto2.adicionar("C");
        conjunto2.adicionar("D");

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);

        System.out.println("Pertence: " + conjunto1.pertence("A"));
        System.out.println("União: " + conjunto1.uniao(conjunto2));
        System.out.println("Interseção: " + conjunto1.inter(conjunto2));
        System.out.println("Diferença: " + conjunto1.menos(conjunto2));
    }
}


