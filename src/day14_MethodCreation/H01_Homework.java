package day14_MethodCreation;

import java.util.Scanner;

public class H01_Homework {

	public static void main(String[] args) {
		/*
		 		Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
			kucuk mu oldugunu, ayrica  100’den buyukse birler,onlar ve yuzler basamagindaki
			rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini yazdiran 3 method
			olusturun.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz : ");
		
		int sayi=scan.nextInt();
		tekCift(sayi);
		buyukKucuk(sayi);
		yuz(sayi);
		
		
		
		scan.close();

	}

	public static void yuz(int sayi) {

		if (sayi > 100 || sayi < 100) {
			
			if (sayi > 100) {
				int birler=sayi%100;
				int onlar=(sayi/10)%10;
				int yuzler=sayi/100;
				System.out.println("Girilen sayinin rakamlari toplami : " +(birler+onlar+yuzler));
				
			} else {
				int birler=sayi%10;
				System.out.println("Girilen sayinin birler basamagi : " +birler);

			}
			
		} else {
			System.out.println("Girilen sayi 100'e esit");

		}
		
	}

	public static void buyukKucuk(int sayi) {
		
		if (sayi >0 || sayi < 0) {
			
			if (sayi >0 ) {
				System.out.println("Girilen sayi sifirdan buyuktur");
				
			} else {
				System.out.println("Girilen sayi sifirdan kucuktur");

			}
			
		} else {
			System.out.println("Girilen sayi sifirdir");

		}
		
		
	}

	public static void tekCift(int sayi) {
		
		if (sayi %2 == 0) {
			System.out.println("Girilen sayi cift tir");
			
		} else {
			System.out.println("Girilen sayi tek tir");

		}	
		
		
	}

}
