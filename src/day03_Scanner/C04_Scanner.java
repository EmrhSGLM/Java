package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
		// kullanýcýdan deger almak icin 3 adým takip edilir
		// 1. adým Scanner objesi olusturmak
		
		Scanner scan=new Scanner (System.in);
		
		// 2. adim kullanýcýya ne istedigimizi soylemek
		
		System.out.println("lutfen isminizi yaziniz");
		
		String isim=scan.next();
		
		System.out.println("isminiz....: "+isim);
		
		// scan bir Scanner objesidir
		// isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz
		// scan bir obje oldugu için bir non-primitive dir
		// primitive data turleri sadece deger icerirken 
		// non-primitive data turleri degerin yanýnda method'lar barindirir
		// scan. dediðimizde kullanbileceðimiz bu method'larý gorebiliriz
		
		
		

	}

}
