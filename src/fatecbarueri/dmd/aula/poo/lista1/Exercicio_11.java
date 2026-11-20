package fatecbarueri.dmd.aula.poo.lista1;

public class Exercicio_11 {
	
	    private double[][] matriz;
	    private int linhas;
	    private int colunas;

	    public Exercicio_11(int linhas, int colunas) {
	        this.linhas = linhas;
	        this.colunas = colunas;
	        matriz = new double[linhas][colunas];
	    }

	    public double getElemento(int linha, int coluna) {
	        return matriz[linha][coluna];
	    }

	    public void setElemento(int linha, int coluna, double valor) {
	        matriz[linha][coluna] = valor;
	    }

	    public boolean equals(Exercicio_11 outra) {
	        if (outra == null || linhas != outra.linhas || colunas != outra.colunas) {
	            return false;
	        }

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                if (matriz[i][j] != outra.matriz[i][j]) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public Exercicio_11 transposta() {
	        Exercicio_11 resultado = new Exercicio_11(colunas, linhas);

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                resultado.matriz[j][i] = matriz[i][j];
	            }
	        }

	        return resultado;
	    }

	    public Exercicio_11 oposta() {
	        Exercicio_11 resultado = new Exercicio_11(linhas, colunas);

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                resultado.matriz[i][j] = -matriz[i][j];
	            }
	        }

	        return resultado;
	    }

	    public void gerarNula() {
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                matriz[i][j] = 0;
	            }
	        }
	    }

	    public boolean identidade() {
	        if (linhas != colunas) {
	            return false;
	        }

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                if (i == j && matriz[i][j] != 1) {
	                    return false;
	                }

	                if (i != j && matriz[i][j] != 0) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public boolean diagonal() {
	        if (linhas != colunas) {
	            return false;
	        }

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                if (i != j && matriz[i][j] != 0) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public boolean singular() {
	        if (!diagonal()) {
	            return false;
	        }

	        for (int i = 1; i < linhas; i++) {
	            if (matriz[i][i] != matriz[0][0]) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public boolean simetrica() {
	        if (linhas != colunas) {
	            return false;
	        }

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                if (matriz[i][j] != matriz[j][i]) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public boolean antiSimetrica() {
	        if (linhas != colunas) {
	            return false;
	        }

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                if (matriz[i][j] != -matriz[j][i]) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public void adicionar(Exercicio_11 outra) {
	        if (linhas != outra.linhas || colunas != outra.colunas) {
	            throw new IllegalArgumentException("Dimensões diferentes.");
	        }

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                matriz[i][j] += outra.matriz[i][j];
	            }
	        }
	    }

	    public void subtrair(Exercicio_11 outra) {
	        if (linhas != outra.linhas || colunas != outra.colunas) {
	            throw new IllegalArgumentException("Dimensões diferentes.");
	        }

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                matriz[i][j] -= outra.matriz[i][j];
	            }
	        }
	    }

	    public void multiplicar(Exercicio_11 outra) {
	        if (colunas != outra.linhas) {
	            throw new IllegalArgumentException("Dimensões incompatíveis.");
	        }

	        double[][] resultado = new double[linhas][outra.colunas];

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < outra.colunas; j++) {
	                for (int k = 0; k < colunas; k++) {
	                    resultado[i][j] += matriz[i][k] * outra.matriz[k][j];
	                }
	            }
	        }

	        matriz = resultado;
	        colunas = outra.colunas;
	    }

	    public Exercicio_11 copiar() {
	        Exercicio_11 copia = new Exercicio_11(linhas, colunas);

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                copia.matriz[i][j] = matriz[i][j];
	            }
	        }

	        return copia;
	    }
	}


