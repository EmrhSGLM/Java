package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		 // Soru 4 ) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		//           ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("lutfen dikdortgenin 1. kenar uzunlugunu girin : ");
		
		double kenar1=scan.nextDouble();
		
        System.out.print("lutfen dikdortgenin 2. kenar uzunlugunu girin : ");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {System.out.println("girilen dikdortgen karedir");
			
		}
		
		if (kenar1!=kenar2) {System.out.println("girilen dikdortgen kare degildir");
			
		}
		
		scan.close();
		 // kullanýcýnýn girecegi tum yanlýþ kodlar gözönüne alýnmaasý gerekir

	}

}
