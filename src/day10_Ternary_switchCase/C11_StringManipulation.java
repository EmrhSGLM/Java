	package day10_Ternary_switchCase;

public class C11_StringManipulation {

	public static void main(String[] args) {
		// String olarak verilen bir degisken + ile baska bir degisken ile isleme sokulursa 
		// java bunlarý yan yana ekler.Buna concatenation
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim+ " " +soyisim);// Ali Can
		
		System.out.println(isim.concat(soyisim));//AliCan
		
		// ayni islemi + sembollu yerine concat metodu ile de yapabiliriz
		
		System.out.println(isim.concat(" ").concat(soyisim));//Ali Can
				
				
		
		
		
	}

}
