package day32_varargs_stringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {

		kafanaGoreTopla(5, 10, 13, 0);

		

	}

	private static void kafanaGoreTopla(int sayi1, int... sayilar) {
		int toplam = 0;
		for (int each : sayilar) {

			toplam += each;

		}

		System.out.println("ilk sayi ile digerlerinin toplaminin carpimi : " + sayi1 * toplam);

	}

}
