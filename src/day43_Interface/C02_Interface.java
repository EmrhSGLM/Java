package day43_Interface;

public interface C02_Interface {
	
	void motor(); // normal class'larda access modifier yazmazsaniz java default access mod. kabul eder
				  // interface'de ise access modifier yazmazsaniz java public access mod. kabul eder
	
	int sayi=10; // final ve static (olarak kabul etti) oldugu icin sayi variable ismini mavi yapti
	
	
	// interface'de body'si olan bir method yazmak isterseniz 
	// java size iki alternatif sunar
	// 1 - Method'un basina "default" keyword yazabilirsiniz
	//     ancak burada yazilan default access mod. degil, Java'nin interface icin ozel kabul ettigi bir keyword'dur
	
	public default void kaporta() {
		System.out.println("default keyword sayesinde body olusturabildim");		
	}
	
	public static void sanzuman() {
		System.out.println("static keyword ile body olusturabildim");
	}

}
