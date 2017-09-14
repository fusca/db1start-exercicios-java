package br.com.db1;

public class ExerciciosInteger {
	
	
	public Integer somar(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

	public Integer subtrair(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}

	public Integer dividir(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}

	public Integer multiplicar(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}
	
	public Boolean isNumeroPar(Integer valor){
		if(valor%2 == 0){
			return Boolean.TRUE;}
		else{
			return Boolean.FALSE;}
	}
	
	public Integer maiorNumero(Integer valor1, Integer valor2){
		return valor1.compareTo(valor2);
	}
	
	public Integer quantidadeImparesAteCem(Integer valor){
		Integer contador = 0;
		for(Integer i=valor;i<100;i=i+2){
			++contador;
		}
		return contador;
	}
}
