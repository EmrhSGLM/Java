package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin

		Scanner scan =new Scanner(System.in);
		
		System.out.print("lutfen dikdortgenin 1. kenar uzunlugunu girin : ");
		
		double kenar1=scan.nextDouble();
		
        System.out.print("lutfen dikdortgenin 2. kenar uzunlugunu girin : ");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {System.out.println("girilen dikdortgen karedir");
			
		} else {System.out.println("girilen dikdortgen kare degildir");

		}
		
		//if (kenar1==kenar2) {System.out.println("girilen dikdortgen karedir");}
		
		//if (kenar1!=kenar2) {System.out.println("girilen dikdortgen kare degildir");}
		
		scan.close();
	}

}
