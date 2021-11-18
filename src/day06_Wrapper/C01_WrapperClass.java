package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		int sayi=10;
		Integer sayi2=20;
		
		// sayi1. yazdigimizda hicbir method ��kmaz, cunku sayi1 int'dir yani primitive dir
		// sayi2. yazd�g�m�zda ise bir �ok method geliyor ��nk� sayi2 Integerd�r.Yani wrapper class'dir.
		
		String tel1="3578987";
		String tel2="3245434";
		
		System.out.println(tel1+tel2);// 35789873245434
		
		 // bu sayilari toplamak isterseniz 
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));//6824421
		
		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println(Integer.MAX_VALUE);//2147483647
		
		System.out.println(Double.MAX_VALUE);//1.7976931348623157E308 E308 10 �zeri 308
		
		//String caddeNo="B203"; degi�tirmemiz lazim yoksa toplamaz numerik ifade olmas� gerekir
		String caddeNo="203";
		String sokakNo="1564";
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		
		// Integer.valueOf(String numerik ifade) method'u string olarak kaydedilmis
		// numerik ifadeleri sayiya cevirir
		// ancak String ifadede numerik olmayan bir karakter olursa
		// Java NumberFormatException hatasi verir ve calismaya durdurur
		// stops execution
		
		System.out.println("Hello Word");
		
		
		
		

	}

}
