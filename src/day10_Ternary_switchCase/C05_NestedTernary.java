package day10_Ternary_switchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// Soru: Eger cal�san kad�nsa 60 yas�ndan buyuk oldugunda emekli olabilir,
		//       cal�san erkekse 65 yas�ndan buyukse emekl� olabilir.
		
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
