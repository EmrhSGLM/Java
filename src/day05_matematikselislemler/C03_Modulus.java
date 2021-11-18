package day05_matematikselislemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		
		// Kullan�c�dan �� basamakl� bir sayi alip 
		// rakamlar toplam�n� yazd�ran 
		// bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 3 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
		
		// sayi 573 olsun
		
		int rakamlarToplami=0;// eger bir �eyi bulmak istiyorsak bir variable atar�z rakamlarToplam� variable
		
		int rakam=sayi%10; // bana birler basamag�n� verir rakam=3
		
		rakamlarToplami+=rakam; // rakamlar toplam� 3 oldu
		
		// sayimiz hala 573
		// 3 ten kurtulmak istiyorum
		// cunku 3 ile i�im bitti
		// sayiyi 57 haline getirin
		
		sayi/=10;
		
		// sayim artik 57
		// 7 yi nasil alirim
		
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		// sayi hala 57
		// 7 den de kurtulal�m
		
		sayi/=10;
		// sayi art�k 5
		
		rakamlarToplami+=sayi;
		
		System.out.println("Girdiginiz sayinin rakamlar toplami = "+rakamlarToplami);
		
		
		
		
		
		
		
		scan.close();
		
		

	}

}
