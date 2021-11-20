package day21_scoope_arrays;

public class C02_LoopVariables {

	public static void main(String[] args) {

		int sayi=10;
		
		for (int i = 0; i < 6; i++) {
			String isim="Ali";
			System.out.println(sayi + " " + isim );
			
		}
		
		// System.out.println(isim);
		 // System.out.println(i);
		
		// lop icerisinde olusturulan variable'lar loop disinda kullnilamazlar
		// bunun icin loop disinda da ihtiyacimiz olan bir degisken varsa
		// loop'dan once olusturlur ve emniyetten kalmak icin initialize (ilk deger atamasini ) yapariz
		
		for (int i = 0; i < 10 ; i++) {
			// int sayi=20; sayi variable'i main method'un icinde olusturuldugundan tum main method da gecerlidir
			// dolayisiyla yeniden ayni isimde bir variable olusturamazsiniz
			
			String isim="Veli";
			
		}
		
	}

}
