package day13_StringManipulations;

public class H01_Homeworh {

	public static void main(String[] args) {
		// Soru 1)  String  methodlarini kullanarak “	Java  ogrenmek123 Cok guzel@	”	String’ini “Java
		//          ogrenmek cok guzel.” sekline getirin.
		
	
		String ifade="	Java  ogrenmek123 Cok guzel@	";
		
		System.out.println("Verilen yazzým sekli : " + ifade);
		
		ifade=ifade.trim(); // "Java  ogrenmek123 Cok guzel@" (en bastaki space lerden kurtulduk)
		ifade=ifade.replaceAll("\\d", ""); // "Java  ogrenmek Cok guzel@" (rakamlardan kurtulduk)
		ifade=ifade.replace("@", ""); // "Java  ogrenmek Cok guzel"  (@ ifagdesini yok ettik)
		ifade=ifade.replace("C", "c"); // "Java  ogrenmek cok guzel" ( C harfini c harfine donusturduk )
		
		System.out.println("istenilen yazim sekli : "+ifade);
		

	}

}
