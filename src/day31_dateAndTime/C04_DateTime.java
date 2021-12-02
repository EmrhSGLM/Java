package day31_dateAndTime;

import java.time.LocalTime;

public class C04_DateTime {

	public static void main(String[] args) {
		// Bir string ve bir int variable olusturalim
		// bir loop icerisinde bu variable'lari 1000 kere degistirelim
		// ve islem surelerini kiyaslayalim ?

		// verilen iki gogum tarihinin hangisinin daha once oldugunu bulunuz

		LocalTime saat = LocalTime.now();

		System.out.println("baslangic saati : " + saat); // 23:04:21.305897100

		int sayi = 10;

		for (int i = 0; i < 10000; i++) {
			sayi++;
		}

		LocalTime saatBitis = LocalTime.now();
		System.out.println("bitis saati : " + saatBitis);
		
		double nano1= saat.getNano(); 
		double nanoBitis = saatBitis.getNano();
		
		System.out.println("For Loop " + (nanoBitis-nano1) + " nano saniyede tamamlandi");
		
		
		
		LocalTime saatS = LocalTime.now();

		System.out.println("\nbaslangic saati : " + saat); // 23:04:21.305897100

		String str = "Celil";

		for (int i = 0; i < 10000; i++) {
			str += " ";
		}

		LocalTime saatBitisS = LocalTime.now();
		System.out.println("bitis saati : " + saatBitis);
		
		double nano1S= saatS.getNano(); 
		double nanoBitisS = saatBitisS.getNano();
		
		System.out.println("For Loop " + (nanoBitisS-nano1S) + " nano saniyede tamamlandi");
		
		double stringSure = nanoBitisS - nano1S; // 1993800.0 1.993.800
		double intSure = nanoBitis - nano1; // 3.79116E7 3.7911.600
		
		System.out.println("\nint String'den " + (stringSure-intSure) + " nano saniye daha hizli bitirdi");

	}

}
