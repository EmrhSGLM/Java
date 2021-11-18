package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		
		// Kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip
		// toplamaya devam edin
		// kullanici sifira basdiginda 
		// o ana kadar sifir haric kac sayiyi girdigini ve girilen sayilari toplamini yazdirin
		
		// kullanicidan 5 sayi alan dese
		for (int i = 0; i < args.length; i++) {
			
		}
		
		Scanner scan = new Scanner (System.in);
		// loop un icinde kullanacagim ogle ve variable lari 
		// loop dan once daha guzeldir
		// cunku loop un icinde olusturursak loop her dondugunde yeni bir obje veya variable olusturur ve bu da hafizayi doldurur
		
		int sayi=100; // o'in disinda ne olursa olsun onemli degil
		int toplam=0;
		int sayac=0;
		
		
		while ( sayi != 0 ) {
				System.out.println("Lutfen toplama eklemek icin bir tamsayi yazin \nbitirmek icin sifira basin");
				sayi=scan.nextInt();
				toplam+=sayi;
				sayac++;
					
			
		}
		
		// kullanici sifira bastiginda loop islemini son kez yapip
		// sonra basa donecek ve loop bitecek
		
		System.out.println("Girilen sayi adeti : " + (sayac - 1)  );
		System.out.println("girilen sayilari toplami : " + toplam );
		

		scan.close();
	}

	
}
