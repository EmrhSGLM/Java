package day19_whileLoop_doWhileLoop;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		// Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin
		
		//char krk='m';
		System.out.println("**** for loop cozumu ****");
		
		for (char i = 'm' ; i > 'c' ; i--) {
			System.out.print(i+ " ");			
		}
		
		
		
		
		
		System.out.println("\n**** while loop cozumu **** ");
		
		char krk='m';
		
		while (krk > 'c') {
			System.out.print(krk+ " ");
			krk--;
		}
		
		
		
		
		
		System.out.println("\n**** do-while loop cozumu ****");
		
		char harf='m';
		
		do {
			System.out.print(harf+ " ");
			harf--;
			
		}while( harf > 'c');
		
		
		

	}

}
