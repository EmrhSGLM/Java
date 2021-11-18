package day03_Scanner;

import java.util.Scanner;

public class Odev02_day02 {

	public static void main(String[] args) {
		
		// 2- Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen karenin kenar uzunlugunu giriniz : ");
		
		int sayi=scan.nextInt();
		
		System.out.println("karenin cevresi = "+(4*sayi));
		System.out.println("karenin alan�   = "+(sayi*sayi));
		
		

	}

}
