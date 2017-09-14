package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {
	
	private ExerciciosString exerciciosString = new ExerciciosString();
	
	@Test
	public void toUpperCaseTest(){
		Assert.assertEquals("PALAVRINHA", exerciciosString.toUpperCase("palavrinha"));
	}
	
	@Test
	public void toLowerCaseTest(){
		Assert.assertEquals("palavrao", exerciciosString.toLowerCase("PALAVRAO"));
	}
	
	@Test
	public void tamanhoPalavraTest(){
		Assert.assertTrue(exerciciosString.tamanhoPalavra("DB1START") == 8);
		Assert.assertTrue(exerciciosString.tamanhoPalavra("DB1START2") == 9);
	}
	
	@Test
	public void tamanhoPalavraComEspacoTest(){
		Assert.assertTrue(exerciciosString.tamanhoPalavraComEspaco(" DB1START ") == 8);
		Assert.assertTrue(exerciciosString.tamanhoPalavraComEspaco(" DB1START2 ") == 9);
	}
	
	@Test
	public void quatroPrimeirasLetrasNomeTest(){
		Assert.assertEquals("Mayz", exerciciosString.quatroPrimeirasLetrasNome("Mayza Yuri Hirose da Costa"));
	}
	
	@Test
	public void aPartirTerceiraLetraNomeTest(){
		Assert.assertEquals("za Yuri Hirose da Costa", exerciciosString.aPartirTerceiraLetraNome("Mayza Yuri Hirose da Costa"));
	}
	
	@Test
	public void quatroUltimasLetrasNomeTest(){
		Assert.assertEquals("osta", exerciciosString.quatroUltimasLetrasNome("Mayza Yuri Hirose da Costa"));
	}
	
	@Test
	public void substituiPrimeiroNomeTest(){
		Assert.assertEquals("ALUNA Yuri Hirose da Costa", exerciciosString.susbtituiPrimeiroNome("Mayza Yuri Hirose da Costa"));
	}
	
	@Test
	public void cortaTextoTest(){
		String[] cortado = exerciciosString.cortaTexto("banana,maca,melancia");
		Assert.assertEquals("banana", cortado[0]);
		Assert.assertEquals("maca", cortado[1]);
		Assert.assertEquals("melancia", cortado[2]);
	}
	
	@Test
	public void quantidadeVogaisTest(){
		Assert.assertTrue(exerciciosString.quantidadeVogais("Mayza") == 2);
		Assert.assertTrue(exerciciosString.quantidadeVogais("MAYZA") == 2);
		Assert.assertTrue(exerciciosString.quantidadeVogais("RAFAEL") == 3);
		Assert.assertTrue(exerciciosString.quantidadeVogais("Rafael") == 3);
	}
	
	@Test
	public void palavraInvetidaTest(){
		Assert.assertEquals("azyaM", exerciciosString.palavraInvertida("Mayza"));
		Assert.assertEquals("leafaR", exerciciosString.palavraInvertida("Rafael"));
	}
}
