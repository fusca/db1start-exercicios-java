package br.com.db1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExerciciosDatas {

	public Boolean isAnoBissexto(LocalDate data) {
		return data.isLeapYear();
	}

	public Boolean isDiaUtil(LocalDate data) {
		switch (data.getDayOfWeek()) {
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
				return Boolean.TRUE;
			default:
				return Boolean.FALSE;
		}
	}
	
	public Integer idadePessoa(LocalDate dataNascimento){
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}
	
	public Integer quantidadeDiasEntreDatas(LocalDate data1, LocalDate data2){
		return (int) data1.until(data2, ChronoUnit.DAYS);
	}
	
	public Integer quantidadeMesesEntreDatas(LocalDate data1, LocalDate data2){
		return (int) data1.until(data2, ChronoUnit.MONTHS);
	}
	
	public Integer quantidadeAnosEntreDatas(LocalDate data1, LocalDate data2){
		return (int) data1.until(data2, ChronoUnit.YEARS);
	}
	
	public Double diferencaDuasHoras(LocalTime hora1, LocalTime hora2){
		return (double) hora1.until(hora2, ChronoUnit.HOURS);
	}
}
