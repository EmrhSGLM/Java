package day09_nestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	    //			Kullanicidan bir sifre girmesini isteyin
	    //			Eger ilk harf buyuk harf ise �A� olup olmadigini kontrol edin. Ilk harf A ise   �Gecerli Sifre�     degilse �Gecersiz Sifre� yazdirin.
	    //			Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. Ilk harf z ise   �Gecerli Sifre�     degilse �Gecersiz Sifre� yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sifre giriniz : ");
		
		char ilkKarakter=scan.next().charAt(0);
		//buyuk harfleri secmis olacak
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') {////buyuk harfleri secmis olacak 
		
		if (ilkKarakter=='A') {System.out.println("Gecerli sifre");
			
		} else { System.out.println(" Gecersiz sifre");
			
		}
			
		} else if(ilkKarakter>='a' && ilkKarakter<='z') {//kucuk harfleri secmis olacak
			
		if (ilkKarakter=='z') {System.out.println("Gecerli sifre");
			
		}else {System.out.println("Gecersiz sifre");
		
		}
			
		
		} else { System.out.println("Gecerli sifre olmasi harf ile baslayin");
			
		}
		
		scan.close();
		
			}
		


	}


