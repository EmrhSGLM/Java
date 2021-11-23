package day04_IncrementDecrement;

import java.util.Scanner;

public class C03_AutoWidening {

	public static void main(String[] args) {
		
		byte sayi1=71;
		
		short sayi2= sayi1;
		//esitligin sol tarafi short, sag tarafibyte
		// iki data turu farkli oldugu halde java itiraz etmiyor
		// Cunku atama yapilan variable'in data turu (short) 
		// atananan degeri verilerinden (byte) buyuk oldugundan sorun olusmaz
		
		
		System.out.println("sayi2  :  " + sayi2);
		
		int sayi3= 55;
		
		double sayi4= sayi3;
		
		System.out.println("sayi 4 : "+sayi4);
		
		// atanan degerin data turu, deger atanan variable'in data turunden kucukse
        // Java casting'i otomatik yapar
        // bu isleme auto widening denir
        // 
		
		Scanner scan = new Scanner (System.in);
		float a=scan.nextFloat();
		 short b=(short) a;
		 System.out.println(b);
		 scan.close();

	}

}
