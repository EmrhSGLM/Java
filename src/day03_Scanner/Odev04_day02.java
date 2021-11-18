package day03_Scanner;

import java.util.Scanner;

public class Odev04_day02 {

	public static void main(String[] args) {
		
		// 4- Kullanicidan dikdortgenler prizmasinin uzun,kisa kenarlarini ve yuksekligini isteyip 
		//    prizmanin hacmini hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen uzun kenari giriniz = ");
		
		double a=scan.nextDouble();
		
		System.out.println("Lutfen kisa kenari giriniz : ");
		
		double b=scan.nextDouble();
		
		System.out.println("Lutfen yuksekligi giriniz : ");
		
		double h=scan.nextDouble();
		
		double prizmaninhacmi=a*b*h;
		
		System.out.println("Prizmanin Hacmi = "+ prizmaninhacmi);

	}

}
