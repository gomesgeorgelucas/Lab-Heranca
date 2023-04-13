package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {

	public double raio;

	public Circulo(int posX, int posY, double raio) {
		super(posX, posY);
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return Math.PI * this.raio * this.raio;
	}

	@Override
	public double getPerimetro() {
		return 2.0 * Math.PI * this.raio;
	}

	@Override
	public String toString() {
		return String.format(
				"Círculo na posição (%d, %d) com raio de %.1fcm (área=%.14fcm2, perímetro=%.14fcm)",
				this.posX, this.posY, this.raio, this.getArea(), this.getPerimetro());
	}
	
	//public static void main(String[] args) {
	//	System.out.println(new Circulo(32, 87, 6));
	//}
}
