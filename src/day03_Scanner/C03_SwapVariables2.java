package day03_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		
		// 2- Verilen sayi1 ve sayi2 variable'larýnýn degerlerini 3. bir variable olmadan 
		// degistiren (SWAP) bir program yapiniz
		
		int sayi1=15;
		int sayi2=20;
		
		//baslangicta sayi1=10 sayi2=20
		
		System.out.println("baslangicta sayi1 ="+sayi1+" ve sayi2 ="+sayi2);
		
		// ucuncu bir variable kullanmayazaksak sayý verilen iki sayinini farkindan istifade ediyoruz
		
		// ilk adým olarak sayilari farkýný ilk sayýya assign ediyorum
		
		sayi1= sayi1-sayi2;
		
		// ikinci adým fark ile sayi2'yi toplayip
		// sayi2'ye assign ediyorum
		
		sayi2= sayi2+sayi1;
		
		// ucuncu adim olarak sayi1'e sayi2 - fark atýyorum
		
		sayi1= sayi2-sayi1;
		
		System.out.println("sonucta sayi1 ="+sayi1+" ve sayi2 ="+ sayi2);
		
		
		

	}

}
