package day03_Scanner;

import java.util.Scanner;

public class Odev01_day02 {

	public static void main(String[] args) {
				
		// 1- Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("lutfen sayi1'i giriniz : ");
		
		int sayi1=scan.nextInt();
		
		System.out.println("lutfen sayi2'i giriniz : ");
		
		int sayi2=scan.nextInt();
		
		System.out.println("Toplamý : "+(sayi1+sayi2));
		System.out.println("Farki   :"+(sayi1-sayi2));
		System.out.println("Carpimi : "+(sayi1*sayi2));
		

	}

}
