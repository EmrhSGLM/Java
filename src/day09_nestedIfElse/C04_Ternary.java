package day09_nestedIfElse;

public class C04_Ternary {

	public static void main(String[] args) {
		
		int x=10;
		
		String tekMiciftMi= x%2==0 ? "cift sayi" : "tek sayi";
		
		System.out.println(tekMiciftMi); // cift
		
		System.out.println(x%2==0 ? "cift sayi" : "tek sayi");
		
		// ternary iki turlu kullanilabilir
		// ya donen sonuca gore bir variable olusturup assign ederiz
		// veya direk syso icine yazip sonucu yazdiririz
		
		System.out.println(x>5 ? "Aferin" : 4); // Aferin
		
		// String sonuc=x>5 ? "Aferin" : 4;
		
		

	}

}
