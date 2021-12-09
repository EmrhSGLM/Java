package day37_Inheritance;

class Person {
	
	public Person() {
		System.out.println("Person Constructor");
	}
	
	public void talk() {
		System.out.println("First Program");
	}

}

class Student extends Person{
	
	public void talk() {
		System.out.println("Second Program");
	}
}
