package day10_Ternary_switchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		// Soru 4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi yaziniz :");
		double sayi=scan.nextDouble();
		
		// sayi>0 ? System.out.println("sayi pozitiftir ") :  System.out.println("sayi*sayi");
		// ternary de direk sonuc veya sonuc dondurecek bir islem yapabiliriz
		
		
		System.out.println(sayi>0 ? "sayi pozitiftir" : Math.pow(sayi, 2));
		
		
		scan.close();

	}

}
