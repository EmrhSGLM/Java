package day32_varargs_stringBuilder;

public class C05_Varargs {

public static void main(String[] args) {
		
		topla(5,8,10,13);
		
		// varargs'dan once farkli parametreler kullanilabilir
		// ama varargs'dan sonra parametre yazilamaz
		// yazarsaniz java vararg son parametre olmalidir diye sizi uyarir 
		// ve CTE verir

	}

	private static void topla(int... sayilar ) {
		int toplam=0;
		for (int each : sayilar) {
			
			toplam += each;
			
		}
		
		System.out.println("Girilen sayilari toplami : " +toplam);
		
	}

}
