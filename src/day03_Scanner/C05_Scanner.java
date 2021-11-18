package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		
		// Kullanýcýdan isim ve soyismini ayri ayri isteyip 
		// girilen ismi asagidaki gibi yazdiriniz
		
		// girilen isim : Mehmet Bulutluoz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println("lutfen soyisminizi yaziniz...");
		
		String soyisim=scan.next();
		
		System.out.println("girilen isim : "+isim+" " + soyisim);

	}

}
