package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// verilen bir listede, icinde belirli bir harf olan elemanlari
		// silen bir metod yaziniz

		List<String> str = new ArrayList<>();

		str.add("Jeyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");

		System.out.println(str);

		String silinecekharf = "a";

		str = killThemAll(str, silinecekharf);
		System.out.println(str);

	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {
		
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains("a")) {
				str.remove(i);	
				i--;
			}
			
		}
		
		return str;
	}

}
