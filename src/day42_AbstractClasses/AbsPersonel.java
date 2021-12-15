package day42_AbstractClasses;

public abstract class AbsPersonel {
	
	
	// Class ve nethodu abstract olarak tanimladigimda child class'lar mecburen
	// bu methodu override edecekler
	
	public abstract void statu();
	
	public abstract void abstractMethod();
	
	public void concreteEthod() {
		System.out.println("Personel class'indaki concrete method calisti");
	}
	
	
}
