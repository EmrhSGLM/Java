package day04_IncrementDecrement;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
		
		// atama i�lemi olursa say�n�n de�eri kal�c� olarak de�i�ir
		// atama i�lemi olmadan yap�lan toplama,��karma vs i�lemler sadece o sat�rda yap�l�r 
		// say�n�n de�erini kal�c� olarak de�i�tirmez
		
		int sayi1=10;
		
		System.out.println(sayi1+=5);//15
		// bu i�lem sayi1'in degerini 5 art�r�p sayi1'e assign ediyor
		// dolay�s�yla sayi1'in de�eri kal�c� olarak degi�iyor
		
		System.out.println(sayi1);//15
		
		System.out.println(sayi1+12);//27
		
		System.out.println(sayi1);//15
		
		sayi1++;
		// her ne kadar = i�areti g�r�lmesede sayi1++ i�leminde assign vard�r
		// dolay�s�yla de�er kal�c� olarak de�i�ir
		
		System.out.println(sayi1);//16
		

	}

}
