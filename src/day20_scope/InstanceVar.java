package day20_scope;

public class InstanceVar {
	
	
	int notMat=50;
	int notFen;
	// instance variable'larin scope'unda main method yoktur

	public static void main(String[] args) {
		
		//System.out.println(notMat); // main method static oldugu icin static olmayan variable'lar 
									// main method'da direk kullanilmaz veya goruntulenemez
		
		// instance variable'lara main method'dan ulasmak istersek obje olusturup
		// obje uzerinden erisim saglayabiliriz
		// icinde oldugumuz class'dan bir obje olusturalim
		
		InstanceVar emrah=new InstanceVar();
		System.out.println(emrah.notMat); // 50
		
		InstanceVar eda=new InstanceVar();
		
		eda.notMat=70;
		System.out.println(eda.notMat); // 70
		// instance variable'larda deger atamazsak java instance olarak atanan degeri alir
		// bu class icin notMat=50 gibi
		// ama istersek deger de atayabiliriz, 
		// bu durumda deger atadigimiz obje icin yeni deger gecerli olur
		
		System.out.println(emrah.notMat); // 50 
		
		// emrah'ın notunu degistirmek istiyorsak emrah.notMat'a deger atamaliyiz
		emrah.notMat=90;
		
		System.out.println(emrah.notMat); // 90
			
		emrah.method2(); // method2 static olmadigi icin main method'dan direk cagirilamaz
		
		
	}

	
	public static void staticMethod() {
		// System.out.println(notFen); // instance variable'lara static method'lardan direk ulasilamaz
		
	}
	
	public void method2 () {
		System.out.println("method2'deki notFen : "+notFen); // Bu method static olmadigi icin instance variable'lara ulasabilir
		// instance variable olustururken deger atanmasa da olur
		// bu durumda java default degerler atar 
		// int icin default deger 0'dir
		
		notFen=100;
		System.out.println("method2'deki duzeltilmis notFen : "+notFen);
	}
	
	
	
	
	
	
	
	
	
	
}
