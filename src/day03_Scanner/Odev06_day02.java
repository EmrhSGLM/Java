package day03_Scanner;

import java.util.Scanner;

public class Odev06_day02 {

	public static void main(String[] args) {
	//  6- Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
	      // Isim - soyisim : Mehmet Bulutluoz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen isminizi yaziniz : ");
		
		String isim=scan.next();
		
		System.out.println("lutfen soyisminizi yaziniz : ");
		
		String soyisim=scan.next();
		
		System.out.println("Isim - soyisim : "+isim+" "+soyisim);
		
		scan.close();

	}

}
