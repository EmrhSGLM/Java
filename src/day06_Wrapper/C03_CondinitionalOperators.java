package day06_Wrapper;

public class C03_CondinitionalOperators {

	public static void main(String[] args) {


		System.out.println(5+3==8 || 6+5==10 || 7-2==3);//true yazd�r�r
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);//false yazd�r�r
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c ;
		
		System.out.println(sonuc );//true
		
		// && isareti yerine bir tane & de kullanilabilir anca arada bir nuans var
		// 
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);//false 
		// && ilk false g�rd���nde diger i�lemleri yapmadan false sonucunu veriyor
		
		
		System.out.println(5+3==8 & 6+5==10 & 7-2==3);
		// & false i�lemini g�rsede sonucu yazd�rm�yor diger i�lemleride yap�yor 
		
		// && i�areti ilk false buldugunda bu i�lemin sonucunun false olacag�n� bilir ve 
		//                         geriye kalan i�lemleri kontrol etmeden sonucu false yazd�r�r
		// & i�areti ise �nce t�m i�lemleri bitirir sonra sonucu false olarak yazd�r�r.
		
		int yas=50;
		int boy=180;
		char cinsiyet='M';
		System.out.println(yas<30 && boy>170 && cinsiyet=='M');//false
		
		
		
	}

}
