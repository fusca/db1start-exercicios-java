package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {
	
	private ExerciciosInteger exerciciosInteger = new ExerciciosInteger();

	@Test
	public void somarTest(){
		Assert.assertTrue(exerciciosInteger.somar(0, 6) == 6);
	}
	
	@Test
	public void subtrairTest(){
		Assert.assertTrue(exerciciosInteger.subtrair(10, 6) == 4);
	}
	
	@Test
	public void dividirTest(){
		Assert.assertTrue(exerciciosInteger.dividir(10, 5) == 2);
	}
	
	@Test
	public void multiplicarTest(){
		Assert.assertTrue(exerciciosInteger.multiplicar(10, 6) == 60);
	}
	
	@Test
	public void isNumeroParTest(){
		Assert.assertTrue(exerciciosInteger.isNumeroPar(6));
		Assert.assertFalse(exerciciosInteger.isNumeroPar(5));
	}
	
	@Test
	public void maiorNumeroTest(){
		Assert.assertTrue(exerciciosInteger.maiorNumero(10, 6) == 1);
		Assert.assertTrue(exerciciosInteger.maiorNumero(1, 6) == -1);
		Assert.assertTrue(exerciciosInteger.maiorNumero(2, 2) == 0);
	}
	
	@Test
	public void quantidadeImparesAteCemTest(){
		Assert.assertTrue(exerciciosInteger.quantidadeImparesAteCem(90) == 5);
		Assert.assertTrue(exerciciosInteger.quantidadeImparesAteCem(85) == 8);
		Assert.assertTrue(exerciciosInteger.quantidadeImparesAteCem(80) == 10);
	}
}
