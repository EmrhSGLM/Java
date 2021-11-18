package day14_MethodCreation;

import java.util.Scanner;

public class H02_Homework {

	public static void main(String[] args) {

		/*
		 		Email kontrolu yapan bir program yazin.Kullanicinin girdigi email
			-@ isareti icermiyorsa gecersiz email yazdirin			-
			-@gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin			-
			-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz" yazdirin
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen email adresinizi giriniz : ");
		String email=scan.next();
		
		isaret(email);
		
		
		
		scan.close();
		
		
	}

	public static void isaret(String email) {
		
		if (!email.contains("@")) {
			System.out.println("gecersiz email ");}
		
		 if (!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresinizi girin");		
		}  
		
		if (!email.endsWith("@gmail.com")) {
			
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		}	else {
			System.out.println("Mail girisi basarili");
		}	
		
				
		
		
		
			
		}
		
	}


