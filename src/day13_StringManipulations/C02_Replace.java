package day13_StringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 sayisinin 
		// binden buyuk olup olmadıgını yazdırın
		
		String sonuc="100.000";
		
		sonuc=sonuc.replace(".","");// 10000 ' e cevirip sonuc'a assign ettik
									// = oldugu icin sonuc kalici olarak degisti	
		
		
		if (Integer.valueOf(sonuc) > 1000) {
			System.out.println("verilen deger 1000 den buyuk");
			
		} else {
			System.out.println("verilen deger 1000 den kucuk");

		}
		
		
		
		
	}

}
