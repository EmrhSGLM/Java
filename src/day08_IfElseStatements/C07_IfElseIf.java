package day08_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIf {

	public static void main(String[] args) {
		// Soru 7)  Kullanicidan 100   uzerinden notunu  isteyin. Not�u  harf sistemine cevirip yazdirin.
		//          50�den kucukse �D�, 50-60 arasi �C�, 60-80 arasi �B�, 80�nin uzerinde ise �A�
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen notunuzu giriniz : ");
		
		double not=scan.nextDouble();
		
		if(not<0 || not>100) {System.out.println("Lutfen gecerli bir not yaziniz");} else
		
		if (not<50) {System.out.println("notunuz :"+" "+"D");
			
		} else if(not<60) {System.out.println("notunuz :"+" "+"C");

		} else if(not<80) { System.out.println("notunuz :"+" "+"B");}
		else {System.out.println("notunuz :"+" "+"A");}
			
		
		
		scan.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		


	}


