package day35_encapsulation_inheritance;

public class Personel {
	
	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	// eEger variable'lara access modifier yazmassak java access modifier olarak
	// default acc. mod. atar boyle olunca sadece o package altindaki child class'lar
	// Personal class'ini inherit edebilir
	// Baska package'lardaki child class'larin da Personal inherit edebilmesi icin
	// variable ve method'larin acc. mod.'larini protected yapariz
	// Pyblic yapsak da inherit edilebilir ama biz herkesin erismmesini degil de
	// sadece child class'larin erismesini istedigimizden protected  tercih ederiz
	
 
	public static void main(String[] args) {
		
		
	}
	

}
