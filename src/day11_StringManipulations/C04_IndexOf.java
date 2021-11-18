package day11_StringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		// parametre olarak Girilen bir char veya string in ilk index ini verir
		
		String str="Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s')); // 4 
		System.out.println(str.indexOf("j")); // 14
		
		int index=str.indexOf("r"); // indexOF metodu bize her zaman int bir deger doner
		
		System.out.println(index); // 6 
		
		System.out.println(str.indexOf('q')); // -1
		// Eger bir string'in index degeri olarak -1 gelirse o string'in olmadigini anlariz
		// Bir String icinde olmayan bir karakter veya kelime ararsak java -1 sonucunu dondurur
		
		System.out.println(str.indexOf('A')); // -1
		System.out.println(str.indexOf("va og")); // 16
		// aradigimiz charSquence anlamli veya anlamsiz bir kelime olabilir 
		// bu durumda java araligimiz CS'i tek bir paket gibi dusunur ve o paketin baslangýc index ini bize verir
		System.out.println(str.indexOf("Java")); //14
		System.out.println(str.indexOf('a',11)); //15
		
		

	}

}
