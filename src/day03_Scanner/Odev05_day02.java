package day03_Scanner;

import java.util.Scanner;

public class Odev05_day02 {

	public static void main(String[] args) {
		/*
		 *  5- Kullanicidan isim ve soyismini isteyip asagidaki sekilde yazdirin
		              Isminiz : Mehmet
	                  Soyisminiz : Bulut
	                  Kursumuza katiliminiz alinmistir,tesekkur ederiz
	      */
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen isminizi giriniz : ");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz : ");
		
		String soyisim=scan.next();
		
		System.out.println("Isminiz    : " +isim );
		System.out.println("Soyisminiz : "+soyisim);
		System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");
	       
	}

}
