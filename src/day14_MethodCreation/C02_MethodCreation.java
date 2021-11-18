package day14_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		
		// Kullanýcýdan iki sayi isteyin
		// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
		// Kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method , 3 yazarsa kupler toplamini yapan method calissin,,
		
		/*
		 Bir method'u 4 adimda olustururuz
		 1- method'u javaya olusturabilmek icin method call yapiyoruz
		 2- arguman ihtiyaci var mi belirleyelim
		 3- java'da yardim alarak method'u olusturalim
		 4- axcess modifire ve return type'a karar ver 
		 bundan sonra method'u yapacagi islevi gerceklestirecek kodlarimizi yazariz 
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen iki sayi girin \nilk sayidan sonra enter'a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		/*
		System.out.println("Lutfen sayi1'i giriniz : ");
		double sayi1=scan.nextDouble();
		System.out.println("Lutfen sayi2'i giriniz : ");
		double sayi2=scan.nextDouble();
		*/
		System.out.println("Lutfen us giriniz : ");
		int us=scan.nextInt();
		
		if (us==2 || us==3 ) {
			
			if (us == 2) {
				karelerininToplami(sayi1,sayi2);
				
			} else {
				kuplerininToplami(sayi1,sayi2);

			}
			
		} else {
			System.out.println("Adam ol istenileni gir");

		}
		
		
		
		
		
		
		scan.close();

	}

	private static void kuplerininToplami(double sayi1, double sayi2) {
		 // bizim arguman isimlerimizle, parametre isimlerimiz ayni olmak zorunda degil
		//  java isimlere degil degerlere bakar
		// bu bir zorunluluk degil imkandir,istedigimizi tercih edebiliriz
		System.out.println("Girilen sayilari kuplerinin Toplami : "+ ((sayi1*sayi1*sayi1) + (sayi2*sayi2*sayi2))  );
		
	}

	private static void karelerininToplami(double sayi1, double sayi2) {
		
		System.out.println("Girilen sayilari karelerinin Toplami : "+ ((sayi1*sayi1) + (sayi2*sayi2))  );
		
		
		
		
		
	}


}
