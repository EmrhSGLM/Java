package day10_Ternary_switchCase;

public class C06_NestedTernary {

	public static void main(String[] args) {
		//   Soru 2 ) verilen karakteri inceleyin
		//   Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse
		//   consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
		
		
		
		char krk='A';
		
		
		// String sonuc=(krk>='a' && krk<='z') ? "Kucuk Harf" : (//sart yanlýs ise sonuc) ;
		
		String sonuc=(krk>='a' && krk<='z') ? "Kucuk Harf" : (
				
				(krk>='A' && krk<='Z') ? "Buyuk Harf" : "girilen karakter harf degil" 
					
				);
		
		System.out.println(sonuc);
				
		
		
		
		

	}

}
