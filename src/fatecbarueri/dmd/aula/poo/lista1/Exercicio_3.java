package fatecbarueri.dmd.aula.poo.lista1;

public class Exercicio_3 {

    private double real;
    private double imaginaria;

    public Exercicio_3(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    public void somar(Exercicio_3 numero) {
        real += numero.real;
        imaginaria += numero.imaginaria;
    }

    public void subtrair(Exercicio_3 numero) {
        real -= numero.real;
        imaginaria -= numero.imaginaria;
    }

    public void multiplicar(Exercicio_3 numero) {
        double novoReal = real * numero.real - imaginaria * numero.imaginaria;
        double novaImaginaria = real * numero.imaginaria + imaginaria * numero.real;

        real = novoReal;
        imaginaria = novaImaginaria;
    }

    public void dividir(Exercicio_3 numero) {
        double denominador = numero.real * numero.real
                + numero.imaginaria * numero.imaginaria;

        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }

        double novoReal = (real * numero.real
                + imaginaria * numero.imaginaria) / denominador;

        double novaImaginaria = (imaginaria * numero.real
                - real * numero.imaginaria) / denominador;

        real = novoReal;
        imaginaria = novaImaginaria;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Exercicio_3) {
            Exercicio_3 numero = (Exercicio_3) obj;

            return real == numero.real
                    && imaginaria == numero.imaginaria;
        }

        return false;
    }

    @Override
    public String toString() {
        if (imaginaria >= 0) {
            return real + " + " + imaginaria + "i";
        }

        return real + " - " + (-imaginaria) + "i";
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginaria * imaginaria);
    }
}
