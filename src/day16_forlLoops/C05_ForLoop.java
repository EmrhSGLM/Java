package day16_forlLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Soru 4)Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya  kadar (sayi dahil)
		//        3’un kati olan sayilari yazdirin.
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");
		double num=scan.nextInt();
		int sayi=(int) num;
		
		
		if (num < 0) {
			System.out.println("negatif sayi girilmez");
			
		} else if (num > 100) {
			System.out.println("Lutfen 100 den kucuk bir sayi giriniz");
			
		} else 	if (sayi != num) {
			System.out.println("Lutfen tamsayi giriniz");
			
		} else  {
			
			for (int i = 1; i <= num ; i++) {
				
				if (i %3 == 0) {
					
					System.out.print(i + " " );
				}
			}

		} 
			scan.close(); 
			
			}
		
			
		

	}


