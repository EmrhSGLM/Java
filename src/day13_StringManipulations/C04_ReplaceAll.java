package day13_StringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		
		String str="*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll metodleri kullanarak Java ogrenmek  cok kolay
		
		str=str.replaceAll("\\d","");
		
		System.out.println(str); //*Java ogrenmek c..ok kolay
		
		str=str.replaceAll("\\s", "x" );// *Javaxogrenmekxc..okxkolay
		
		System.out.println(str);
		
		str=str.replaceAll("\\W",""); // Javaxogrenmekxcokxkolay // BUYUK HARFLE YAZINCA OLMAYANLARI SÝL
		
		System.out.println(str);
		
		str=str.replace("x"," "); // Java ogrenmek cok kolay
		
		System.out.println(str);
		
		

	}

}
