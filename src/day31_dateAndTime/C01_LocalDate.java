package day31_dateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate tarih = LocalDate.now();
		
		System.out.println("\n"+tarih); // 2021-12-02		
		System.out.println(tarih.getDayOfYear()); // 336 Bugun yilin hangi gunde oldugunu yazdirir		
		System.out.println(tarih.getDayOfMonth()); // 2 Bugun ayin hangi gunde oldugunu yazdirir		
		System.out.println(tarih.getDayOfWeek());  // THURSDAY		
		System.out.println(tarih.getMonthValue()); // 12		
		System.out.println(tarih.getMonth()); // DECEMBER
		
		System.out.println("\n"+tarih.plusDays(20)); // 2021-12-22    20 gun sonra tarih ne olur ?
		System.out.println(tarih.plusMonths(5)); // 2022-05-02   5 ay sonra
		System.out.println(tarih.plusWeeks(15)); // 2022-03-17   15 hafta sonra
		System.out.println(tarih.plusYears(4)); // 2025-12-02    4 yil sonra
		
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10)); // 2032-10-12 10yil 10ay 10gun sonra
		
		
		System.out.println("\n"+tarih.minusDays(20)); // 2021-11-12   20 gun once
		System.out.println(tarih.minusWeeks(20)); // 2021-07-15  20 hafta once
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5)); // 2016-06-27 5 yil 5 ay 5 gun once

		System.out.println("\n"+tarih.minusYears(21).isLeapYear()); // true
		
		LocalDate dogumTarihi1 = LocalDate.of(1998, Month.JANUARY , 12); // 1998-01-12
		LocalDate dogumTarihi2 = LocalDate.of(2000, 01, 12); // 2000-01-12
		LocalDate dogumTarihi3 = LocalDate.ofYearDay(2000, 136); // 2000-05-15
		LocalDate dogumTarihi4 = LocalDate.of(1985, 10, 10);
		
		
		System.out.println("\n"+dogumTarihi1 + " , " + dogumTarihi2); // 1998-01-12 ,2000-01-12
		
		System.out.println(dogumTarihi2.isAfter(dogumTarihi3)); // false
		System.out.println(dogumTarihi4.isBefore(dogumTarihi1)); // true
		 
		
	}

}
