package day03_Scanner;

import java.util.Scanner;

public class Odev03_day02 {

	public static void main(String[] args) {
		
		// 3- Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen yaricapi giriniz = ");
		
		int sayi=scan.nextInt();
		
		System.out.println("Cemberin cevresi = " + (2*3.14*sayi));
		System.out.println("Cemberin alani   = " + (3.14*sayi*sayi));
				
		

	}

}
