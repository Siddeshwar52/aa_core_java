package am_dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd+"-"+mm+"-"+yy);
		System.out.printf("%d-%d-%d",dd,mm,yy);
		System.out.println("\n----------------------------");
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("\n%d:%d:%d:%d",h,m,s,n);
		System.out.println("\n");
		System.out.println("----------------------------");
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		LocalDateTime dt1 = LocalDateTime.of(1995,Month.APRIL,28,12,45);
		System.out.println(dt1);
		System.out.println("After Six months: "+dt1.plusMonths(6));
		System.out.println("Before Six months: "+dt1.minusMonths(6));
		System.out.println("----------------------------");
		
		ZoneId z = ZoneId.systemDefault();
		System.out.println(z);
		
		ZoneId za = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(za);
		System.out.println(zt);
		System.out.println("----------------------------");
		

		LocalDate localdate = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1995,11,13);
		Period p = Period.between(localdate, birthdate);
		System.out.println(p);
		System.out.println("----------------------------");
		
		//Leap year
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year which u want to check for leap year");
		int year = sc.nextInt();
		sc.close();
		Year y = Year.of(year);
		if(y.isLeap()) System.out.println(year+" is a leap year");
		else System.out.println(year+" is not a leap year");
	}
}
