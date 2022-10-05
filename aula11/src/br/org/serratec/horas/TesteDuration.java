package br.org.serratec.horas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TesteDuration {

	public static void main(String[] args) {
		LocalDateTime primeiroPeriodo = LocalDateTime.of(2001, 2, 1, 17, 30);
		LocalDateTime segundoPeriodo = LocalDateTime.now();
		
		Duration duration = Duration.between(primeiroPeriodo, segundoPeriodo);
		Long dias = duration.toDays();
		System.out.println(dias);
		
		Duration duration2 = duration.minus(2, ChronoUnit.DAYS);
		System.out.println(duration2.toHours());
	}

}
