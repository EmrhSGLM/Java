package day05_matematikselislemler;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {
		// Kullanicidan 6 basamakl� bir sayiyi alin ve 
		// rakamlar toplamini bulun
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 6 basamakl� bir sayi giriniz");
		int sayi=scan.nextInt();
		
		
		int rakamlarToplami=0;		
		int rakam=sayi%10; 		
		rakamlarToplami+=rakam;
		sayi/=10;
		
		// bu i�lemi basaak sayisi kadar
		// tekrar edersek rakamlar toplamini buluruz
		
		rakam=sayi%10; 		
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10; 		
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10; 		
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10; 		
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10; 		
		rakamlarToplami+=rakam;
		sayi/=10;
		
		System.out.println("Girdiginiz sayinin rakamlar toplami = "+rakamlarToplami);
		
		//6 basamak istedi�inde fazla basamak girerse son 6 basamag� toplar
		
		scan.close();
	}

}
