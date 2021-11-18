package day13_StringManipulations;

import java.util.Scanner;

public class H04_HOMEWORK {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.  
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen isminizi giriniz : ");
		String isim=scan.nextLine();
		System.out.println("Lutfen soyisiminiz giriniz : ");
		String soyisim=scan.nextLine();		
		
	
		
		if (isim.length() == soyisim.length()) {
			System.out.println("isim ve soyisim uzunlugu birbirine esittir");
			
		} else if (isim.length() > soyisim.length()) {
			System.out.println("isim soyisimden daha uzundur");
			
		} else {
			System.out.println("soyisim isim den daha uzundur");

		} 
		
		scan.close();

	}

}
