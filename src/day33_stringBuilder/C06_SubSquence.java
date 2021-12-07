package day33_stringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");		
		
		System.out.println(sb.substring(14)); // kolay
		
		System.out.println(sb.subSequence(14, 19)); // kolay
		
		System.out.println(sb); // atama yapmaz subSquence
		
		// ikiside ayni sonucu dondurur 
		// ancak substring methodu String Class!indan geldigi icin 
		// substring() kullandigimda arkasindan String meyhod'larini kullanabilirim
		// Ancak, subSquence kullandigimda bu mumkun olmaz
		
		

	}

}
