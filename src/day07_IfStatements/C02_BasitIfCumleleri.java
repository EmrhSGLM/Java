package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		// Soru 1) Kullan�c�dan bir tamsay� isteyip ve say�n�n 
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir tamsay� giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {System.out.println("girdiginiz say� �ift sayidir");
			
		}
		
		if (sayi%2==1) {System.out.println("girdiginiz sayi tek sayidir");
			
		}

	}

}
