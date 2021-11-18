package day04_IncrementDecrement;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		
		// eger buyuk data turundeki bir veriyi daha kucuk data turundeki
		// variable'a atamak istersek java bunu otomatik olarak yapmaz
		
		int sayi1=140;
		
		short sayi2= (short) sayi1;
		
		// esitligin sagi ile solundaki veri t�rleri farkl� oldu�undan java missmatch hatas� verir
		// hatay� d�zeltmek i�in b�y�k data turundeki de�erin onune manuel onay�m�z� g�steren 
		// (short) yaz�l�r
		
		System.out.println("sayi 2 : " + sayi2);
		
		byte sayi3= (byte) sayi2;
		
		System.out.println("sayi 3 : " + sayi3);
		// deger byte'in s�n�rlar�ndan buyuk oldugu i�in java int 300'u kendi y�ntemine gore
		// byte'a donusturur ve bu arada bizim datam�z DEGISIR
		
		double sayi4= 87.3;
		
		int sayi5= (int) sayi4;
		
		System.out.println("sayi 5 : " + sayi5); // budayacak say�y�, ��nk� int tamsay� oldu�u i�in
		
		
		int sayi6= 27;
		int sayi7= 4;
		 
		System.out.println(sayi6 / sayi7); 
		
		// bolme �slem� yap�lan �k� say�da int oldugu i�in java sonucu int olarak yazar
		
		double sayi8=4;
		double sayi9=17;
		
		System.out.println(sayi6 / sayi8);//6,75 islem yapilan say�lardan daha geni� datat turune sahip olan 
		// double oldugundan sonucu double yazd�r�r
		
		System.out.println(sayi9 / sayi7);
	}

}
