package day05_matematikselislemler;

public class C01_Matematikselislemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2);//14
		
		
		// i�lem yap�lan say�lar int oldugu i�in sonu� tamsay� sonu� verir 
		
		System.out.println(4*(2+5)/3);//9
		
		// sonucu virgullu yazdirmak istersek
		
		double sonuc=((4*(2+5)/3));
		
		// int olarak i�lemi yapar ona g�re yazd�r�r
		// assigment i�lemlerinde �nce de�er bulunur sonra atama yapar 
		
		System.out.println(sonuc);//9.0
		
		// i�lemin i�inde herhangi bir say�y� double yapmam�z yeterlidir sonucu ondal�k yapmak i�in
		
		sonuc= (double) 4 *(2+5)/3;
		
		System.out.println(sonuc);//9.333333333333334
		
        sonuc=  4 *(2+5)/(double)3;
		
		System.out.println(sonuc);//9.333333333333334
		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		
		System.out.println(sayi1/sayi2);
		
		System.out.println(sayi1/sayi3);

		System.out.println(sayi1+sayi3/sayi2);//6.0

	}
}



