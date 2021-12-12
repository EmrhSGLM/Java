package day39_overridingKurallari_polymorphism;

public class Test { 

	public static void main(String[] args){ 

		Parent obj1 = new Parent(); 
		
		// obj1.m1(); ==> Ulasmak istedigimiz method private oldugu icin kendi class'i haricinde kesinlikle ulasilamaz
		obj1.m2(); // Parent class'da protected access modifier

		Child obj2 = new Child(); 

		// obj2.m1();  ==> Ulasmak istedigimiz method private oldugu icin kendi class'i haricinde kesinlikle ulasilamaz
		obj2.m2(); // Child class'da public access modifier
		
		Parent obj3 = new Child();
		obj3.m2();

	} 

} 