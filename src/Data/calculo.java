package Data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculo {
	
	public  static void main (String[]args) {
		
		
		LocalDate d01 = LocalDate.parse("2024-11-15");
		
		LocalDateTime d02 = LocalDateTime.parse("2024-11-15T20:00:26");
		
		Instant d03 = Instant.parse("2024-11-15T20:00:26Z");
		
		LocalDate pastWeekLocalDate =  d01.minusDays(7); // diminuir dias...
		LocalDate nextWeekLocalDate = d01.plusDays(7);//aumentando dias...
		
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		
		
		LocalDateTime pastWeekLocalDateTime =  d02.minusDays(7); // diminuir dias...
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);//aumentando dias...
		
		
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		
		Instant pastWeekInstant =  d03.minus(7,ChronoUnit.DAYS); // diminuir dias...
		Instant nextWeekInstant = d03.plus(7,ChronoUnit.DAYS);//aumentando dias...
		
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);		
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0) , d02);
		Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay() , d02);
		Duration t4 = Duration.between(pastWeekInstant,d03);
		
		System.out.println( "numero de dias:" +  t1.toDays());
		System.out.println( "numero de dias:" +  t2.toDays());//nao pode calcular usando local date, tem que converter para localdatetime
		System.out.println( "numero de dias:" +  t3.toDays());//nao pode calcular usando local date, tem que converter para localdatetime
		System.out.println( "numero de dias:" +  t4.toDays());
	}

}
