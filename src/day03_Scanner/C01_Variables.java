package day03_Scanner;

public class C01_Variables {

	public static void main(String[] args) {
		
	/*
	 * 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
	 * 2- isim ve soyisim icin iki variable olusturun ve bunlari
	      isminiz: Mehmet
	      soyisminiz: Bulutluoz seklinde yazdirin
	 * 3- iki farkli data turunden 2 variable olusturun bunlarin toplamini yazdirin
	 * 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
	 * 5- Bir tamsayi, bir de char degiskeni olusturun
	 * ve bunlarin toplamini yazdirin	
	 */
		
		String ismim="Mehmet Bulutluoz";
		
		System.out.println(ismim);
		
		char ilkHarf='S';
		
		boolean anlasildiMi=true;
		
		String isminiz="Ali";
		String soyisminiz="Tuskan";
		
		//isminiz: Mehmet
		
		System.out.println("isminiz : " + isminiz);
		
		//soyisminiz: Bulutluoz seklinde yazdirin
		
		System.out.println("soyisminiz : "+soyisminiz);
		
		//iki farkl� data turunden 2 variable olu�turun bunlar�n toplam�n� yazd�r�n
		
		int a=10;
		short b=20;
		
		System.out.println(a+b);//30
		
		// Bir tamsay�, bir de char de�i�ken olu�turun ve bunlar�n toplam�n� yazd�r�n
		
		int sayi=25;
		char karakter='a';
		
		// char degiskenler matematiksel i�leme sokulursa char degiskeninin bar�nd�rd�g� karekterin 
		// ascii degeri isleme girer.
		
		System.out.println(sayi+karakter); // 122 ASCII Table
		
		
		
			
		
		

	}

}
