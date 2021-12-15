package day42_AbstractClasses;

public class AbsUstaBasi extends AbsIsci{
	
	// Basinda abstract yazmiyorsa concrete bir child class
	
	// concrete bir child class parent'i olan abstract class'lardaki tum abstract method'lari implement etmelidir
	// ama parent'i olan abstract class'lardaki concrete method'lari implement etmek zorunda degildir.

	public static void main(String[] args) {
		AbsUstaBasi ust1 = new AbsUstaBasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();

	}

	@Override
	public void mesai() {
		System.out.println("Bu classdaki herkes ustabasidir ... \n\t\t\t imza: UstaBasi");
		
	}

	@Override
	public void maas() {
		System.out.println("Ustabaslari aylik 10.000 Tl maas alir ... \n\t\t\t imza: UstaBasi");
		
	}

	@Override
	public void statu() {
		System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir ... \n\t\t\t imza: UstaBasi");
		
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}

}
