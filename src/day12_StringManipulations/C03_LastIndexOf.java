package day12_StringManipulations;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Lutfen bir cumle giriniz : ");
				
				String cumle=scan.nextLine();
				System.out.println("Lutfen varl�g�n� kontrol etmek icin bir harf giriniz : ");
				
				
				char krk=scan.next().charAt(0);
				
				int index= cumle.lastIndexOf(krk);
				
				if (index == -1) {
					System.out.println("harf cumlede kullan�lmam�s");
					
				} else {
					System.out.println("harf cumlede kullan�lm�s");

				}

	}

}
