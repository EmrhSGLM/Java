package day13_StringManipulations;

import java.util.Scanner;

public class H06_HOMEWORK {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre  basari ile tanimlandi”,
		//			sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir  sifre girin” yazdirin
		//          Ilk harf buyuk harf olmali
		//			Son harf kucuk harf olmali
		//			Sifre bosluk icermemeli
		//			Sifre uzunlugu en az 8 karakter olmali
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sifrenizi giriniz : ");
		String sifre=scan.nextLine();
		
		int flag=0;
		
		if (!(sifre.charAt(0) >='A' && sifre.charAt(0) <= 'Z')) {
			System.out.println("Sifre buyuk harfle baslamli");
			flag++;			
		}
		
		if (!(sifre.charAt(sifre.length()-1) >= 'a' && sifre.charAt(sifre.length()-1) <= 'z')) {
			System.out.println("Son harf kucuk harf olmali");
			flag++;			
		}

		if (sifre.contains(" ")) {
			System.out.println("Sifre bosluk icermemeli");
			flag++;			
		}
		
		if ((sifre.length() < 7)) {
			System.out.println("Sifre en 8 karakterli olmalý");
			flag++;			
		}
		
		if (flag > 0) {
			System.out.println("Islem basarisiz,Lutfen yeni bir  sifre girin");
			
		} else {
			System.out.println("Sifre  basari ile tanimlandi");
						
		}
		
		scan.close();
		}


	}

	

