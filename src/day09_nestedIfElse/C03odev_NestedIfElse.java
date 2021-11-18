package day09_nestedIfElse;

import java.util.Scanner;

public class C03odev_NestedIfElse {

	public static void main(String[] args) {
		// Kullan�c�dan art�k y�l olup olmad���n� kontrol etmek i�in y�l girmesini
		// isteyin
		// Kural 1: 4 ile b�l�nemeyen y�llar art�k y�l de�ildir
		// kural 2: 4 ile b�l�n�p 100 ile b�l�nemeyen y�llaar art�k y�ld�r
		// Kural 3: 4�n kat� olmas�na ra�men 100 ile b�l�nen y�llar art�k y�ld�r
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir yil giriniz : ");
		int yil=scan.nextInt();
		
		if (yil>0) {
			
			if (yil%4!=0) {System.out.println("Artik yil degil dir");
            
	        } else if (yil%100!=0) {System.out.println("artik yil dir");
	            
	        } else if (yil%400==0) {System.out.println("Artik yil");
	            
	        } else {System.out.println("Artik yil degildir");
	        } {
	        } {
	        }
	        
			
		} else {System.out.println("Gecerli bir yil giriniz ");

		}
		
		

	}

}
