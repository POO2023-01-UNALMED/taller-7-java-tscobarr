package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		 return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
	}
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
