package listapoo;

public class Quadrado {
	public double valorLado;
	
	public void mudarValorLado (double novoValorLado) {
		valorLado = novoValorLado;
	}
	public double retornarValorLado() {
		return valorLado;
	}
	public double calcularArea() {
		return Math.pow(valorLado, 2);
	}

}
