package day24_arraysList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		
		List <String> isimler = new ArrayList<>();
		System.out.println("Bos liste : " + isimler); // Bos liste : []
		
		isimler.add("Ali");
		System.out.println("Bir eleman : " + isimler); // Bir eleman : [Ali]
		
		isimler.add("veli");
		System.out.println("Iki  eleman : " + isimler); // Iki  eleman : [Ali, veli] 
		// add metodu listenin sonuna ekleme yapar
		
		isimler.add("Can");
		System.out.println("Uc  eleman : " + isimler); // Uc  eleman : [Ali, veli, Can]
		
		isimler.add(1, "Ayse");
		System.out.println("1.index'e Ayse ekledik : " + isimler); // 1.index'e Ayse ekledik : [Ali, Ayse, veli, Can]
		
		//isimler.add(5); declare ederken belirtigimiz data turu disinda bir data turunden eklemeyapamayiz	
		
		List <String> liste2 = new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("liste 2 : " + liste2); // liste 2 : [Gunter, Emrah]
		
		isimler.addAll(4, liste2);
		System.out.println("sona liste 2 yi ekledik : " + isimler); // liste 2 yi ekledik : [Ali, Ayse, veli, Can, Gunter, Emrah]
		
		isimler.addAll(liste2);
		System.out.println("index olmadan liste2'yi tekrar ekledik : "+isimler); // index olmadan liste2'yi tekrar ekledik : [Ali, Ayse, veli, Can, Gunter, Emrah, Gunter, Emrah]
		
		// System.out.println(isimler + liste2); // array list leri bu sekilde yazdiramayiz
		
		
	}

}
