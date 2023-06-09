package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {

	public double lado;

	public Quadrado(int posX, int posY, double lado) {
		super(posX, posY, lado, lado);
		this.lado = lado;
	}

	public String toString() {
		return String.format(
				"Quadrado na %s com lado de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)",
				this.getPosString(), this.lado, this.getArea(), this.getPerimetro());
	}

}
