package day13_StringManipulations;

import java.util.Scanner;

public class H03_HOMEWORK {

	public static void main(String[] args) {
		// Soru 3) Kullanicidan isim isteyin. Eger
		//         isim “a”  harfi iceriyorsa “Girdiginiz isim a  harfi iceriyor”
		//         isim “Z”   harfi iceriyorsa “Girdiginiz isim Z  harfi iceriyor”
		//         ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz : ");
		String isim=scan.nextLine();
		
		if (isim.contains("a") || isim.contains("Z")) {
			
			if (isim.contains("a") && isim.contains("Z")) {
				System.out.println("Girdiginiz isim hem a hem de Z harfi iceriyor");
				
			} else if (isim.contains("a")) {
				System.out.println("Girdiginiz isim a  harfi iceriyor");
				
			} else {
				System.out.println("Girdiginiz isim Z  harfi iceriyor");

			}
			
			
			
		} else {
			System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
		}
		
		
		
		
		scan.close();
		
	}

}
