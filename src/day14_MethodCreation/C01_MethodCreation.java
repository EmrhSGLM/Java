package day14_MethodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Verilen iki sayinin toplamini ve carpimini yapip yazdiran ik
		//  ayri method olusturun
		
		// method olusturmak icin 4 adim takip edelim
		// 1.adim Method call yazalim
		// 2.adim Method'a arguman yazacakmýyýz karar vermeliyiz
		
		int sayi1 = 44;
		int sayi2 = 55;
		
		carpma (sayi1,sayi2); // bu bir method call
		toplama (sayi1,sayi2); // bu bir method call
		
		// 3. adim 1. ve 2. adimi yaptiktan sonra Java dan yardim alip method'u olustururuz
		
		carpma (sayi1,sayi2); // bu bir method call
			
		
	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi : " + sayi1 * sayi2 );
		// TODO Auto-generated method stub
		
	}

	public static void toplama(int sayi1, int sayi2) {
		// 4. adim erisim duzenleyici ve return type'a karar vermeliyiz 
		// erisim duzenleyici axcess modifier : public yaptik
		// return type : bizden sadece yazdirma istedigi icin void kalabilir
		
		System.out.println("sayilarin toplami : "+ (sayi1+sayi2)    );
		
		
		
		
	}

}
