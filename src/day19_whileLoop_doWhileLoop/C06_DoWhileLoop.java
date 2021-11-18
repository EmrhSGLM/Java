package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki
		 * sartlara gore kontrol edin ve sifredeki hatalari yazdirin. Kullanici gecerli
		 * bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
		 * “Sifreniz Kabul edilmistir” yazdirin.
		 * 
		 * - Sifre kucuk harf icermelidir - Sifre buyuk harf icermelidir - Sifre ozel
		 * karakter icermelidir - Sifre en az 8 karakter olmalidir.
		 */

		Scanner scan = new Scanner(System.in);
		String sifre = "";
		boolean khk = false;
		boolean bhk = false;
		boolean okk = false;
		boolean uk = false;
		
		do {
			System.out.println("Lutfen bir sifre giriniz :");
			sifre = scan.nextLine();

			khk = kucukHarfKontrol(sifre);
			bhk= buyukHarfKontrol(sifre);
			okk= ozelKrakterKontrol(sifre);
			uk =  (boolean) uzunlukKontrolu(sifre);

		} while (!khk || !bhk || !okk || !uk);

		System.out.println("Sifreniz basarili bir sekilde kaydedildi");
	}

	private static Object uzunlukKontrolu(String sifre) {
		boolean uk=false ;
		
		if (sifre.length()>= 8) {
			uk=true;
			
		} else {
			System.out.println("Sifreniz en az 8 ozelkarakter icermelidir");
							
		}
				
		return uk;
	}

	private static boolean ozelKrakterKontrol(String sifre) {
		
		String ozelKarakter ="!@#$%^&*()_-+=/?<,>.| ";
		boolean okk=false;
		for (int i = 0; i < sifre.length(); i++) {
			
			if (ozelKarakter.contains(sifre.substring(i,i+1))) {
				okk = true;
				break;
								
			}
			
		}
		if (!okk) {
			System.out.println("Sifreniz en az bir  ozelkarakter icermelidir");	
		}
			
		return okk ;
	}

	
	private static boolean buyukHarfKontrol(String sifre) {
		
		String harfler ="ABCDEFGHIJKLMNOPRSTUVYZWQX";
		boolean bhk=false;
		for (int i = 0; i < sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i,i+1))) {
				bhk = true;
				break;
								
			}
			
		}
		if (!bhk) {
			System.out.println("Sifreniz en az bir buyuk harf icermelidir");	
		}
			
		return bhk ;
	}

	private static boolean kucukHarfKontrol(String sifre) {
		boolean khk = false;

		String harfler = "abcdefghijklmnoprstuvyzqwx";

		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i + 1))) {
				khk = true;
				break; // BREAK KULLANMAMİZİN SEBEBİ : SORUDA 1 TANE KUCUK HARF OLMASİ YETERLİ 
				       //   BIZ KUCUK HARFI BULDUKTAN SONRA KODU DURDURMAZSAK 
				       //   SONRADAN KARSIMIZA CIKACAK BUYUK HARFLER BIZI YANILTIR
			}
			// BU SATIRA GELDIGINDE SIFRE DE KUCUK HARF VARSA KHK=TRUE, HIC KUCUK HARF YOKSA KHK=FALSE,
			// BURAS FOR LOOP UN BITTIGI YER
		}
		
		if ( !khk ) {
			System.out.println("Sifreniz en az bir kucuk harf icermelidir");
			
		}
		return khk;
	}

}
