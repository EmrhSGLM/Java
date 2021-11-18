package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		// Soru 1) Kullanýcýdan bir tamsayý isteyip ve sayýnýn 
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir tamsayý giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {System.out.println("girdiginiz sayý çift sayidir");
			
		}
		
		if (sayi%2==1) {System.out.println("girdiginiz sayi tek sayidir");
			
		}

	}

}
