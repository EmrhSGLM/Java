package day06_Wrapper;

public class C04_If {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		
		if (a>5) {System.out.println("a sayisi 5'ten b�y�k");
			
		}
		
		if (a>b) {System.out.println("a sayisi b'den buyuk");
			
		}
		
		if (b>100) {System.out.println("\"b sayisi 100 den b�y�k\"");
			
		}
		
		
		// �art cumlesi mutlaka BOOLEAN olma�d�r
		// basit if cumleleri bag�ms�z �al���r, tum if lerin body'si calisabilir, baz�lar� �ali�abilir 
		//          hatta hicbirinin body'si calismayabilir
		// her bir if cumlesi kendi �art�na bakar, �art true ise body calisir,
		//      sart false ise body calismaz
		
	}

}
