package day11_StringManipulations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		// equlsIgnorecase iki String degiskeni buyuk kucuk harf farki gozetmeksizin karsilastirir
		
		 String str1 = "ali";
		 String str2 = "can";
		 String str3 = "Ali Can";
		 String str4= str1 + " " + str2;
		 
		 System.out.println(str4); // Ali Can
		 System.out.println(str4 == str3); // False hem degerler hem de referanslar farklý
		 System.out.println(str3.equals(str4)); // False degerler farklý
		 
		 System.out.println(str3.equalsIgnoreCase(str4)); // true icerik ayný, case sensiive degil
		
	}

}
