package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
	public static void main(String[] args) {
		
		LocalTime saat = LocalTime.now();
		
		System.out.println("baslangic saati : " + saat); // 23:04:21.305897100
		
		int sayi=10;
		
		for (int i = 0; i < 10000; i++) {
			
		}
		
		LocalTime saatBitis = LocalTime.now();
		System.out.println("bitis saati : " + saatBitis);
		
		// Eger bir islemin baslangic ve bitis zamanini katdetmek istiyorsak
		// Hem basinda , hem de sonunda LocalTime objesi olusturmaliyiz
		
		double nano1= saat.getNano(); 
		double nanoBitis = saatBitis.getNano();
		
		System.out.println("For Loop " + (nanoBitis-nano1) + " nano saniyede tamamlandi");
		
		System.out.println(saat.getMinute()); // 28 su anki dakika yi aldi
		System.out.println(saat.plusMinutes(10000)); // 22:10:01.862594 10000dk sonra 
		
		System.out.println(saat.minusHours(20)); // 03:31:46.511788700 20 saat once
		
		LocalTime yerelSaat = LocalTime.now(ZoneId.of("USA")); // hata var
		
		System.out.println(yerelSaat);
		
		
	
		
	
	}
	
}	
