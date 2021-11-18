package day04_IncrementDecrement;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
		
		// atama iþlemi olursa sayýnýn deðeri kalýcý olarak deðiþir
		// atama iþlemi olmadan yapýlan toplama,çýkarma vs iþlemler sadece o satýrda yapýlýr 
		// sayýnýn deðerini kalýcý olarak deðiþtirmez
		
		int sayi1=10;
		
		System.out.println(sayi1+=5);//15
		// bu iþlem sayi1'in degerini 5 artýrýp sayi1'e assign ediyor
		// dolayýsýyla sayi1'in deðeri kalýcý olarak degiþiyor
		
		System.out.println(sayi1);//15
		
		System.out.println(sayi1+12);//27
		
		System.out.println(sayi1);//15
		
		sayi1++;
		// her ne kadar = iþareti görülmesede sayi1++ iþleminde assign vardýr
		// dolayýsýyla deðer kalýcý olarak deðiþir
		
		System.out.println(sayi1);//16
		

	}

}
