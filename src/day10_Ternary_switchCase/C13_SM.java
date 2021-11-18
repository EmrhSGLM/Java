package day10_Ternary_switchCase;

import java.util.Locale;

public class C13_SM {

	public static void main(String[] args) {
		// verilen String in tamamini buyuk veya kucuk harfe cevirir
		
		String isim="aLI"; // bunu Ali olarak yazdiralim
		
		System.out.println(""+isim.toUpperCase().charAt(0)+isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));
		
		// turkca local harfler kullanarak tamamini kucuk harfe cevirelim
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("ja")));
		
		
		
		
	}

}
