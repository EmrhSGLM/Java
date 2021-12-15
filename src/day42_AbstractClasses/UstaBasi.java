package day42_AbstractClasses;


public class UstaBasi  extends Isci{
	/*
	public void statu() {
		System.out.println("Bu classdaki herkes ustabasidir ... \n\t\t\t imza: UstaBasi");
	}
	
	public void maas() {
		System.out.println("Ustabaslari aylik 10.000 Tl maas alir ... \n\t\t\t imza: UstaBasi");
	}
	
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir ... \n\t\t\t imza: UstaBasi");
	}

	 */
	// Obje olusturdugumuz en alttaki class parent class lardaki methodlari 
	// override edince, class dan olusturulan objeler en dogru ve spesifik bilgilere ozelliklere kavustu
	
	// Ama klasik parent-child iliskisinde tum methodlari override etme mecburiyeti yoktur
	
	// Java parent class lardaki tum methodlari override etmek mecburiyeti kazanditmak icin 
	// absract class yapisini olusturmustur
	
	// Yani bir class'i abstract olarak tanimlarsaniz child class lar tum methodlari override 
	// etmek zorunda kalir.
	
	// Dolayisiyla abstract yaptigimiz Parent class lar sadece kalip gorevi yapacaklar
	
	public static void main(String[] args) {
		
		UstaBasi ust1 = new UstaBasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();

	}

}
