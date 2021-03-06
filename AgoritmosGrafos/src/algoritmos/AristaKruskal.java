package algoritmos;

public class AristaKruskal implements Comparable<AristaKruskal>{
	private int nodo1;
	private int nodo2;
	private int valor;

	
	public AristaKruskal(int nodo1, int nodo2, int valor) {
		this.nodo1 = nodo1;
		this.nodo2 = nodo2;
		this.valor = valor;
	}


	public int getNodo1() {
		return nodo1;
	}


	public int getNodo2() {
		return nodo2;
	}


	public int getValor() {
		return valor;
	}


	@Override
	public int compareTo(AristaKruskal arg0) {
		return this.valor - arg0.valor;
	}
}
