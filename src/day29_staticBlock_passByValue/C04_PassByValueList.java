package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list olusturalim 
		// sonra list elemanlarini degistir method'u yazip orada
		// list elemanlarindan bazilarini degistirelim
		// method void olsun
		// main method'a dondukten sonra yeniden list'i yazdiralim
		
		List<String> harfler = new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		
			
		
		listElemanlarDegistir(harfler);
		System.out.println("Main Method'a donunce list : " + harfler); // [D, B, C]
		
		// Java'da list ve array gibi objeler icinde pass by value gecerlidir
				// yani farkli bir method'da array veya list'e yeni deger atamasi yaparsaniz 
				// orijinal array veya list degismez
		
		
		listDegistir(harfler); // method'da yeni deger atadigim halde harfler listesi degismedi
		System.out.println("list'e yeni list atatiktan sonra Main Method'da donunce list : " + harfler);

		
		
		
	}

	private static void listDegistir(List<String> harfler) {
		
		harfler=new ArrayList<>();
		System.out.println("LİST'E YENİ DEGER ATAYİNCA : " + harfler); // []
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		System.out.println("method'da degistirdigimiz list : " + harfler);
		
	}

}
