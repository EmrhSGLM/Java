package day32_varargs_stringBuilder;

public class C06_StringBuilder {
	
	public static void main(String[] args) {
		
		String str = "Ali Can";
		
		String str2 = new String ("Veli Can");
		
		
		StringBuilder sb = new StringBuilder("Yasasin Java");
		
		sb.append("!!!");
		sb.substring(3);
		System.out.println(sb);
		
		sb.toString().toUpperCase(); // StringBuilder'i String'e cevirip String Manipulation kullanabiliriz
	}

}
