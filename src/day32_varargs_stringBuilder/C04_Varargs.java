package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		
		kafanaGoreIslem(5, 10, 13, 0);
		
		// Varargs'da hic eleman olmasa da java itiraz etmez
		// once int olarak tanimlanan sayilari eslestirir
		// kalan tum sayilari varargs'a doldurur

		

	}

	private static void kafanaGoreIslem(int sayi1,int sayi2,int sayi3,int sayi4, int... sayilar) {
		int toplam = 0;
		for (int each : sayilar) {

			toplam += each;

		}

		System.out.println("ilk sayi ile digerlerinin toplaminin carpimi : " + sayi1 * toplam);

	}

}
