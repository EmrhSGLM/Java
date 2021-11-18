package day01_02_Variables;

public class C01_Variables {

	public static void main(String[] args) {
		
		// variable oluşturmak ve değer atamak farklı işlemlerdir
		// istersek variable oluşturma ve değer atamayı aynı satırda yapabiliriz
		
		String ogrenciIsim= "Cengiz";
				
		System.out.println(ogrenciIsim); // Cengiz
		
		// istersek de once olusturur, istedigimiz zaman da deger atayabiliriz
		
		int sayi;
		sayi=12;
		
		System.out.println(sayi); //12
		
		// biz daha once olusturulmus ve deger atamasi yapilmis bir degiskene
        // yeni deger atayabiliriz
        // bu durumda java variable'in eski degerini silip yeni degeri variable'a atar
		
		sayi=68;
		
		System.out.println(sayi); // 68
		
		ogrenciIsim="Osman";
		
		System.out.println(ogrenciIsim);
			
				
				
	}

}
