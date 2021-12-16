package day42_AbstractClasses;

public abstract class AbsPersonel {
	
	
	// Class ve methodu abstract olarak tanimladigimda child class'lar mecburen
	// bu methodu override edecekler
	
	public abstract void statu(); // abstract method'lara body yazilmaz
	
	public abstract void abstractMethod();
	
	public void concreteEthod() {
		System.out.println("Personel class'indaki concrete method calisti");
	}
	
	
}
