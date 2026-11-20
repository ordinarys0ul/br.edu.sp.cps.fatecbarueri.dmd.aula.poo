package fatecbarueri.dmd.aula.poo.lista1;

public class Exercicio_9 {
	

	    private String nome;
	    private Exercicio_9 pai;
	    private Exercicio_9 mae;

	    public Exercicio_9(String nome, Exercicio_9 pai, Exercicio_9 mae) {
	        this.nome = nome;
	        this.pai = pai;
	        this.mae = mae;
	    }

	    public Exercicio_9(String nome) {
	        this.nome = nome;
	        this.pai = null;
	        this.mae = null;
	    }

	    public boolean equals(Exercicio_9 pessoa) {
	        if (pessoa == null) {
	            return false;
	        }

	        return nome.equals(pessoa.nome) && mae == pessoa.mae;
	    }

	    public boolean irmaos(Exercicio_9 pessoa) {
	        if (pessoa == null || pessoa == this) {
	            return false;
	        }

	        return pai != null && mae != null
	                && pai == pessoa.pai
	                && mae == pessoa.mae;
	    }

	    public boolean antecessor(Exercicio_9 pessoa) {
	        if (pessoa == null) {
	            return false;
	        }

	        if (pai == pessoa || mae == pessoa) {
	            return true;
	        }

	        if (pai != null && pai.antecessor(pessoa)) {
	            return true;
	        }

	        if (mae != null && mae.antecessor(pessoa)) {
	            return true;
	        }

	        return false;
	    }
	}


