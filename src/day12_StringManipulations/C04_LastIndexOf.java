package day12_StringManipulations;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		/*
		 * Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
	            - Girilen kelime cumlede kullanilmamis.
	           - Girilen kelime cumlede 1 kere kullanilmis.
	         - Girilen kelime cumlede 1�den fazla kullanilmis.
	     */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz : ");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varl�g�n� kontrol etmek icin bir kelime giriniz : ");
		
		String kelime=scan.nextLine();
		
		int ilkIndex=cumle.indexOf(kelime);
		int sonIndex=cumle.lastIndexOf(kelime);
		
		
		if (ilkIndex==(-1)) {
			System.out.println("Girilen kelime cumlede kullan�lmamis");
			
		} else if(ilkIndex == sonIndex) {
			System.out.println("Girilen kelime cumlede 1 kere kullanilmis");

		} else {
			System.out.println("Girilen kelime cumlede 1 den fazla kullanilmis");
			
		}
		
		scan.close();
	}

}
