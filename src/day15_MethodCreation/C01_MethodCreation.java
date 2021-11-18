package day15_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri 
		//   ilk harf buyuk digerleri kucuk olacak sekilde birlestirsin
		// ikinci method isim ve soyismin ilk harfleri buyuk 
		//     kalan harfler * olacak sekilde birlestirsin
		

		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihini sorun ve 
		//   programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen isim ve soyisminizi girin \nisimden sonra enter'a basin ");
		
		String isim=scan.next();
		String soyisim=scan.next();
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1"
				+ " \\ilk harf haric gizli yazilmasini istiyorsaniz 2'e basin"); 
		
		int tercih=scan.nextInt();
		// Bu satira kadar kullanicidan ismini, soyismini ve tercihini aldim
		
		String birlesmisIsim=null; // Emrah Saglam , E**** S*****
		                     // null degeri atamak cok onemli simdi olusturuyoruz sonra atama yapmak icin 
		if (tercih==1) {
			birlesmisIsim=acikIsim(isim,soyisim);
			
		} else if (tercih==2) {
			birlesmisIsim=isimGizle(isim,soyisim);
			
		} else {
			System.out.println("Lutfen 1 veya 2 secin");

		}
		
		// Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak
		// kaydedildi
		
		System.out.println("Kullanici Tercihi : "+birlesmisIsim);
		
		scan.close();
		
	}

	public static String isimGizle(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w" , "*");
		soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w" , "*");
		
		
		return isim+soyisim ;
	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim+" "+soyisim;
	}

}
