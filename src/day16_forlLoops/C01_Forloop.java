package day16_forlLoops;

public class C01_Forloop {

	public static void main(String[] args) {
		 
		for (int i = 0; i <= 10 ; i++) {
			System.out.print( i + " ");
			
		}
		// for loop baslangic ve bitis sarti bir sayinin degerine bagli olan 
		// durumlarda tercih edilir
		
		
		/*
		for (int i = 0; i < 10 ; i--) {
			System.out.print(i + " ");
		}
	    // eger baslangic sayisi artis / azalis le bitis degerine yaklasmiyor , uzaklasiyor ise 
		// loop hic bir zaman durmaz
		// bu duruma sonsuzluk deriz ve bu durumun gerceklesmesini istemeyiz
		 * */
		 
		
		
		for (int i = 0; i > 10 ; i++) {
			System.out.println(i+ " ");
			
		}
		
		// eger ilk deger icin bitis sarti true olmasa
		// daha ilk adimda loop broken olur 
		// dolayisiyla loop body hic calismadan loop un sonrasina gecilir
		// loop CALİSİR, ama hic bir islem YAPMAZ
		 
		 
	}
	

}
