package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {

	public double largura;
	public double altura;

	public Retangulo(int posX, int posY, double largura, double altura) {
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return this.largura * this.altura;
	}

	@Override
	public double getPerimetro() {
		return 2 * (this.largura + this.altura);
	}

	public String toString() {
		return String.format(
				"Retângulo na %s com largura de %.1fcm e altura de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)",
				this.getPosString(), this.largura, this.altura, this.getArea(), this.getPerimetro());
	}

}
