package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_ForLoop_C02 {

	public static void main(String[] args) {

		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen rakamlari toplamini bulmak icin pozitif bir tamsayi giriniz : ");
		int sayi = scan.nextInt();// 345 data turu int

		int rakamlarToplami = 0;
		int rakam=0;
		String sayiStr = "" + sayi;// 345 data turu String
		
		// integer olarak verilen bir sayinin basamak sayisini bulmak istersek
		// kisa yoldan o sayiyi String'e cevirip, str.length() method'unu kullanabiliriz.
		

		for (int i = 0 ; i < sayiStr.length(); i++) { // for(int i=sayi;i>0;i/=10) kullanabilir miydik hocam

			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;

		}
		
		System.out.println("girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}

}
