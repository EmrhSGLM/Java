package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
		// kullan�c�dan deger almak icin 3 ad�m takip edilir
		// 1. ad�m Scanner objesi olusturmak
		
		Scanner scan=new Scanner (System.in);
		
		// 2. adim kullan�c�ya ne istedigimizi soylemek
		
		System.out.println("lutfen isminizi yaziniz");
		
		String isim=scan.next();
		
		System.out.println("isminiz....: "+isim);
		
		// scan bir Scanner objesidir
		// isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz
		// scan bir obje oldugu i�in bir non-primitive dir
		// primitive data turleri sadece deger icerirken 
		// non-primitive data turleri degerin yan�nda method'lar barindirir
		// scan. dedi�imizde kullanbilece�imiz bu method'lar� gorebiliriz
		
		
		

	}

}
