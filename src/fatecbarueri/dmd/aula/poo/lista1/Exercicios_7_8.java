package fatecbarueri.dmd.aula.poo.lista1;

public class Exercicios_7_8 {
	public class Exercicio_7 {

	    private String codigoISO;
	    private String nome;
	    private long populacao;
	    private double dimensao;

	    private Exercicio_7[] fronteiras = new Exercicio_7[40];
	    private int quantidadeFronteiras = 0;

	    public Exercicio_7(String codigoISO, String nome, double dimensao) {
	        this.codigoISO = codigoISO;
	        this.nome = nome;
	        this.dimensao = dimensao;
	    }

	    public String getCodigoISO() {
	        return codigoISO;
	    }

	    public void setCodigoISO(String codigoISO) {
	        this.codigoISO = codigoISO;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public long getPopulacao() {
	        return populacao;
	    }

	    public void setPopulacao(long populacao) {
	        this.populacao = populacao;
	    }

	    public double getDimensao() {
	        return dimensao;
	    }

	    public void setDimensao(double dimensao) {
	        this.dimensao = dimensao;
	    }

	    public boolean equals(Exercicio_7 pais) {
	        return pais != null && codigoISO.equals(pais.codigoISO);
	    }

	    public boolean adicionarFronteira(Exercicio_7 pais) {
	        if (pais == null || equals(pais) || fazFronteira(pais)
	                || quantidadeFronteiras >= 40) {
	            return false;
	        }

	        fronteiras[quantidadeFronteiras] = pais;
	        quantidadeFronteiras++;
	        return true;
	    }

	    public boolean fazFronteira(Exercicio_7 pais) {
	        for (int i = 0; i < quantidadeFronteiras; i++) {
	            if (fronteiras[i].equals(pais)) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public double densidadePopulacional() {
	        if (dimensao == 0) {
	            return 0;
	        }

	        return populacao / dimensao;
	    }

	    public Exercicio_7[] vizinhosComuns(Exercicio_7 pais) {
	        Exercicio_7[] comuns = new Exercicio_7[40];
	        int quantidade = 0;

	        for (int i = 0; i < quantidadeFronteiras; i++) {
	            if (pais.fazFronteira(fronteiras[i])) {
	                comuns[quantidade] = fronteiras[i];
	                quantidade++;
	            }
	        }

	        Exercicio_7[] resultado = new Exercicio_7[quantidade];

	        for (int i = 0; i < quantidade; i++) {
	            resultado[i] = comuns[i];
	        }

	        return resultado;
	    }
	}

}
