package day14_MethodCreation;

import java.util.Scanner;

public class H03_Homework {

	public static void main(String[] args) {

		/*
		 * 			Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
			numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
			sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
			duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
			geri dondurun.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen isminizi giriniz :");		
		String isim=scan.next();
		System.out.print("Lutfen isminizi giriniz :");		
		String soyisim=scan.next();
		
		
		System.out.print("Lutfen 16 haneli kredi karti numaranizi giriniz : ");
		String kK=scan.next();
		
		// soruda yazdirilmasi istenmemistir ama bu kisim kor bile bi goreyim demis oldugundan dolayi 
		// gosterilmek istendi
		
		String sonIsim=isimSoyisim( isim,soyisim);		
		System.out.println(sonIsim);
		
		String kKNo=kK(kK);
		System.out.println(kKNo);
		
		
		scan.close();
	
	}

	public static String kK(String kK) {
		
		kK=kK.substring(0, 4)+kK.substring(5, 6).replaceAll("\\d", " ")+kK.substring(4, 8)+kK.substring(5, 6).replaceAll("\\d", " ")+
				kK.substring(8, 12)+kK.substring(5, 6).replaceAll("\\d", " ")+	kK.substring(12,16)	;
							
		 return kK ;
		
	}

	private static String isimSoyisim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0, 1).toUpperCase()+soyisim.substring(1).toLowerCase();
		
		
		return isim+" "+soyisim ;
		
	}

}