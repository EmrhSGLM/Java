package day10_Ternary_switchCase;

public class C10_SwitchCase {

	public static void main(String[] args) {
		// Soru3 : Kullanicidan bir sayi girmesini isteyin
		// Girilen sayi
		// 10 ise �Iki basamakli en kucuk sayi 
		// 100 ise �uc basamakli en kucuk sayi�
		// 1000 ise �dort basamakli en kucuk sayi�
		// diger durumlarda �Girdigin sayiyi degistir� yazdirin
		
		int sayi=10000;
		
		switch (sayi) {
		
		case 10 :
			System.out.println("Iki basamakli en kucuk sayi");
			break;
		case 100 :
			System.out.println("uc basamakli en kucuk sayi");
			break;
		case 1000 :
			System.out.println("dort basamakli en kucuk sayi");
			break;
		default :
			System.out.println("Girdigin sayiyi degistir");
		
		}
		
		
		
	}

}
