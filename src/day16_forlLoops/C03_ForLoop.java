package day16_forlLoops;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Soru 2 )10 ile 30 arasindaki sayilari aralarinda virgule olarak ayni satirda yazdirin
		
		for (int i = 10; i <= 30 ; i++) {
			
			
			if (  i == 30) {
				System.out.print(i + "");
				
			} else {
				System.out.print(i + ",");
			
			
			}
						
		}
		System.out.println(); // bos syso sadece alt satir gecmek icin kullanilir

		
		for (int i = 10; i <= 29; i++) {
			System.out.print( i +",");
			
		}
		System.out.println(30);

	}

}
