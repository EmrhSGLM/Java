package day13_StringManipulations;

import java.util.Scanner;

public class H05_HOMEWORK {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen 4 harfli bir kelime giriniz : ");
		String kelime=scan.next();
		
		if (kelime.length() == 4) {
			System.out.println(kelime.substring(3)+kelime.substring(2,3)+
					kelime.substring(1,2)+kelime.substring(0,1)  );
			
		} else {
			System.out.println("Lutfen 4 harfli bir kelime giriniz");

		}
		
		
		
		scan.close();
		
		
	}

}
