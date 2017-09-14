package br.com.db1;

public class ExerciciosDouble {

	public Double menorValorEntreDois(Double valor1, Double valor2) {
		return Math.min(valor1, valor2);
	}

	public Double menorValorEntreTres(Double valor1, Double valor2, Double valor3) {
		return Math.min(valor1, Math.min(valor2, valor3));
	}
	
	public Double mediaTresNumeros(Double valor1, Double valor2, Double valor3){
		return (valor1 + valor2 + valor3)/3;
	}
	
	public Double areaTriangulo(Double base, Double altura){
		return (base*altura)/2;
	}

}
