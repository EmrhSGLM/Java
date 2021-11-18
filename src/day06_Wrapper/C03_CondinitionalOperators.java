package day06_Wrapper;

public class C03_CondinitionalOperators {

	public static void main(String[] args) {


		System.out.println(5+3==8 || 6+5==10 || 7-2==3);//true yazdýrýr
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);//false yazdýrýr
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c ;
		
		System.out.println(sonuc );//true
		
		// && isareti yerine bir tane & de kullanilabilir anca arada bir nuans var
		// 
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);//false 
		// && ilk false gördüðünde diger iþlemleri yapmadan false sonucunu veriyor
		
		
		System.out.println(5+3==8 & 6+5==10 & 7-2==3);
		// & false iþlemini görsede sonucu yazdýrmýyor diger iþlemleride yapýyor 
		
		// && iþareti ilk false buldugunda bu iþlemin sonucunun false olacagýný bilir ve 
		//                         geriye kalan iþlemleri kontrol etmeden sonucu false yazdýrýr
		// & iþareti ise önce tüm iþlemleri bitirir sonra sonucu false olarak yazdýrýr.
		
		int yas=50;
		int boy=180;
		char cinsiyet='M';
		System.out.println(yas<30 && boy>170 && cinsiyet=='M');//false
		
		
		
	}

}
