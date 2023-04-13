package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {

	public static void main(String[] args) {
		var formas = new FormaGeometrica[3];
		formas[0] = new Circulo(1, 2, 3);
		formas[1] = new Retangulo(1,2,1,2);
		formas[2] = new Quadrado(1, 2, 3);
		
		for (int i = 0; i < formas.length; i++) {
			System.out.println(formas[i]);
		}
		

	}

}
