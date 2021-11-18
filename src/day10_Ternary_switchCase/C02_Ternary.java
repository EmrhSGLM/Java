package day10_Ternary_switchCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		// Soru 2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin  
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz : ");
		int sayi=scan.nextInt();
		
		System.out.println(sayi%2==0  ? "cift" : "tek");
		
		scan.close();

	}

}
