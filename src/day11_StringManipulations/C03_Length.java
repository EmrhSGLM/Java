package day11_StringManipulations;

public class C03_Length {

	public static void main(String[] args) {
		
		
		String str1= "Ali Kahyaoglu";
		
				
		System.out.println(str1.length());//13
		
		// verilen str1 in son harfini yazdirin
		
		System.out.println(str1.charAt(str1.length()-1));  // u str1.length()-1 son harfin index i
		
		
		String str2 = "";
		System.out.println(str2.length());
		
		 String str3=null;
		// System.out.println(str3.length()); // Eger Stringi olusturur ama deger atamazsak yazdirdigimizda hata aliriz	
		
		
		String str4;
		
		System.out.println(str3); // null degeri bizim bu variable bilerek olusturdugumuzu ve bilerek deger atamadigimizi belirtiyor	
		// System.out.println(str4); // 
		
		// null pointer olusturdugumuz fakat sonra kullanacagimiz bir String'i isaretlemek icin kullanýlýr
		// "Bir stringi yazdirdigimizda null cikiyorsa turkce olarak
		// "Ben bu degiskeni olusturdum henuz deger atamadim" demek istiyor
		
		
		
	}

}
