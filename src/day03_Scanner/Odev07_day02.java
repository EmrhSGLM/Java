package day03_Scanner;

import java.util.Scanner;

public class Odev07_day02 {

	public static void main(String[] args) {
		
		// 7- Kullanicidan ismini alip isminin bas harfini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi yaziniz : ");
		
		char ilkHarf=scan.next().charAt(0);
		
		System.out.println("isminizin ilk harfi : "+ilkHarf);
		

	}

}
