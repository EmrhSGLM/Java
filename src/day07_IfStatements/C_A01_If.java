package day07_IfStatements;

import java.util.Scanner;

public class C_A01_If {

	public static void main(String[] args) {
		// Kullanicidan bir gün alin : yazilan gun ; "Cuma" ise "Muslunmanlar icin kutsal gun" , "Cumartesi" ise "Yahudiler icin kutsal gun" ,
		// "Pazar" ise "Hristiyanlar icin kutsal gun yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen sizin icin degerli gunu yaziniz : ");
		String gun=scan.next().toUpperCase();
		
		if (gun.equals("CUMA")) {System.out.println("MUSLUMANLAR ICIN KUTSAL GUN");
			
		}
		
		if (gun.equals("PAZAR")) {System.out.println("HIRISTIYANLAR ICIN KUTSAL GUN");
			
		}
		
		if (gun.equals("CUMARTESI")) {System.out.println("YAHUDILER ICIN KUTSAL GUN");
			
		}
		
		if (gun.equals("PAZARTESI") || gun.equals("SALI") || gun.equals("CARSAMBA") ||  gun.equals("PERSEMBE")){System.out.println("GECERSIZ BIR GUN GIRDINIZ.LUTFEN TEKRAR YAZINIZ");
			
		}
		
		
		
		
	}

}
