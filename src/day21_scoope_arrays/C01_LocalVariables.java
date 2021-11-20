package day21_scoope_arrays;

public class C01_LocalVariables {

	String okulIsmi;
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Java local variable'lara default deger atamasi yapmaz
		// Kodlarimizda sorun yasamamk icin 
		// olusturdugumuz local variable'lara uygun bir deger atamamizda fayda var
		
		int sayi = 0; // int sayi dersek java CTE veriyor
		System.out.println(sayi);
		
		// int sayi; // bir local'de ayni isimde birden fazla variable OLUSTURULAMAZ
		// String sayi; // data turu farkli olsada java buna izin vermez
		
		
		String isim="Ali";
		
		
	}
	
	public static void staticMethod() {
		// sayi; // bir local'de farkli local'de olusturulan variable (methodlarin static 
			  //  olup olmamasina bagli olup olmamasina bagli olmaksizin) farkli local'de kullanilamaz 
		
		@SuppressWarnings("unused")
		String isim="Veli";
		
	}
	
	
	
	

}
