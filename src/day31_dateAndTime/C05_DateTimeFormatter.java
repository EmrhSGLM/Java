package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat); // 2021-12-02T23:44:37.873869900
		
		// Eger tarih veya saati kendi istedigimiz bicimde yazdirmak istersek
		// gun / ay / yil  saat:dakika
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd / MM / YYYY EEEE  HH : mm");
		
		System.out.println("\n"+duzenle.format(tarihSaat)); // 02 / 12 / 2021   23 : 52
		
		/*
		 format olustururken
		 Gun
		 d :    basta 0 varsa onu yazmadan gun numarasini yazar
		 dd :   tek haneli gunleri 01 gibi basina 0 yazarak gun numarasi
		 ddd :  yilin kacinci gunu
		 E,EE,EEE :   gun isminin ilk 3 harfi 
		 EEEE : gun isminin tamamini
		 
		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami
		 
		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini
		 
		 
		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
		 
		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati
		 
		 a yazarsak AM veya PM degerini yazar
		 
		 
		 
		 
		 */
		
		
		
		

	}

}
