package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDouble;

public class ExerciciosDoubleTest {
	
	private ExerciciosDouble exerciciosDouble = new ExerciciosDouble();
	
	@Test
	public void menorValorEntreDoisTest(){
		Assert.assertTrue(exerciciosDouble.menorValorEntreDois(109D, 201D) == 109D);
	}
	
	@Test
	public void menorValorEntreTresTest(){
		Assert.assertTrue(exerciciosDouble.menorValorEntreTres(109D, 201D, 100D) == 100D);
		Assert.assertTrue(exerciciosDouble.menorValorEntreTres(19D, 201D, 100D) == 19D);
	}
	
	@Test
	public void mediaTresNumerosTest(){
		Assert.assertTrue(exerciciosDouble.mediaTresNumeros(10D, 20D, 30D) == 20D);
		Assert.assertTrue(exerciciosDouble.mediaTresNumeros(20D, 40D, 30D) == 30D);
	}
	
	@Test
	public void areaTrianguloTest(){
		Assert.assertTrue(exerciciosDouble.areaTriangulo(12D, 5D) == 30D);
		Assert.assertTrue(exerciciosDouble.areaTriangulo(4D, 4D) == 8D);
	}
	
	
}
