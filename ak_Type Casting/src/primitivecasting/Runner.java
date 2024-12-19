package primitivecasting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println(10);   // int
		System.out.println(10.5); // double
		
		float a =(float) 3.5;
		
		float b = 3.5f;
		
		float c = 3.5F;
		
		long mobNo = 999999L;
		
		//Collectors.toList();
		
		//LocalDate date = LocalDate.now(); 
		
		//LocalDateTime t = LocalDateTime.now();
		
		LocalDate birthday =LocalDate.of(1947,8,15);
		
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthday, today);
		
		System.out.println("Age is "+p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days");
		
	}
	

}
