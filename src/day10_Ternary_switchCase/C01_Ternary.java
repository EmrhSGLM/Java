package day10_Ternary_switchCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		// soru - 1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sayi1 i giriniz :");
		double sayi1=scan.nextDouble();
		System.out.println("Lutfen sayi2 yi daha giriniz :");
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
		
		
		
		
		
		scan.close();
		
		

	}

}
