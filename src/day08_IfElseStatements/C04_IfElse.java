package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		// Soru 3) Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
        //         eger uc kenar uzunlugu birbirine esit ise ekrana "Eskenar ucgen"
        //         diger durumlarda ekrana "Eskenar ucgen degil" yazdir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini yaziniz \nilk kenari girdikten sonra diger kenarlar icin enter'e basin");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble(); 
		
		
		//System.out.println("kenar1'i giriniz : ");
		//double kenar1=scan.nextDouble();
		//System.out.println("kenar2'i giriniz : ");
		//double kenar2=scan.nextDouble();
		//System.out.println("kenar3'i giriniz : ");
		//double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar1==kenar3 ) {System.out.println("Eskenar ucgen");
			
		} else {System.out.println("Eskenar ucgen degil");

		}
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
	}

}
