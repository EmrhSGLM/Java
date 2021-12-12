package day39_overridingKurallari_polymorphism;

public class C01 {
	
	public static void staticMethod() {
		System.out.println("Parent class static method calisti");
	}
	
	private void privateMethod() {
		System.out.println("Parent class private method calisti");
	}
	
	// final demek bu son hali bir daha degistirilemez demektir
	// dolayisiyla final olarak tanimlanan bir method override edilemez
	public final void finalMethod() {
		System.out.println("Parent class final method");
	}
	
	// child class ile parent class ayni package'de olduklarindan
	// method'larin Access Modifier'lari public,protected veya default olsaydi hicbir sorun olmazdi
	// 
	
}
