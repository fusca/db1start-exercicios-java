package br.com.db1.test;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDatas;

public class ExerciciosDatasTest {
	
	private ExerciciosDatas exerciciosDatas = new ExerciciosDatas();

	@Test
	public void isAnoBissextoTest(){
		Assert.assertTrue(exerciciosDatas.isAnoBissexto(LocalDate.of(2016, 1, 1)));
	}
	
	@Test
	public void isDiaUtilTest(){
		Assert.assertTrue(exerciciosDatas.isDiaUtil(LocalDate.of(2017, 9, 13)));
	}
	
	@Test
	public void idadePessoaTest(){
		Assert.assertTrue(exerciciosDatas.idadePessoa(LocalDate.of(1995, 10, 6)) == 21);
	}
	
	@Test
	public void quantidadeDiasEntreDatasTest(){
		Assert.assertTrue(exerciciosDatas.quantidadeDiasEntreDatas(LocalDate.of(2017, 1, 1), LocalDate.of(2017, 12, 31)) == 364);
	}
	
	@Test
	public void quantidadeMesesEntreDatasTest(){
		Assert.assertTrue(exerciciosDatas.quantidadeMesesEntreDatas(LocalDate.of(2017, 1, 1), LocalDate.of(2017, 12, 31)) == 11);
	}
	
	@Test
	public void quantidadeAnosEntreDatasTest(){
		Assert.assertTrue(exerciciosDatas.quantidadeAnosEntreDatas(LocalDate.of(2017, 1, 1), LocalDate.of(2019, 12, 31)) == 2);
	}
	
	@Test
	public void diferencaDuasHorasTest(){
		Assert.assertTrue(exerciciosDatas.diferencaDuasHoras(LocalTime.of(1, 10), LocalTime.of(5, 20)) == 4);
	}
}
