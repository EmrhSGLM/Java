package day17_ForLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question
		//		Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
		//		sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan = new Scanner (System.in);
		System.out.println("10 dan kucuk bir sayi giriniz : ");
		int sayi=scan.nextInt();
		
		int faktoryel=1;
		
		System.out.print(sayi+"! = "  );
		
		
		
		
		for (int i = sayi; i > 1; i--) {
			
			faktoryel *= i;
			System.out.print(i+"*");
			
		}
		
		System.out.print("1 = " +faktoryel);
		scan.close();
	}

}
