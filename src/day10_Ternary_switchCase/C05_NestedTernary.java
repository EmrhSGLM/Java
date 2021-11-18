package day10_Ternary_switchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// Soru: Eger calýsan kadýnsa 60 yasýndan buyuk oldugunda emekli olabilir,
		//       calýsan erkekse 65 yasýndan buyukse emeklý olabilir.
		
		// Her seferinde scanner olusturmak yerine 
		// test data larimizi variable olarak da olusturabiliriz
		// ve kod yazimi bittiginde bu test datalarini degistirerek 
		// kodlarimizi test edebiliriz
				
		
		char cinsiyet='E' ;
		int yas=71;
		
		String sonuc= cinsiyet=='K' ? (yas>60 ? "Emekli olabilirsin" : "Emekli olamazsin") :

										(yas>=65 ? "Emekli olabilirsin" : "Emekli olamazsin") ;
		
		System.out.println(sonuc);
		
		
		
		

	}

}
