package day04_IncrementDecrement;

public class C06_PreincrementPostincrement {

	public static void main(String[] args) {
		// preincrement ve postincrement sadece sayi++ ve sayi-- yazimi icin gecerlidir
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi);//13
		
		System.out.println(sayi++);//13  // bu sat�rda iki i�lem var
		                           // bir artirma, bir de yazdirma
		
		System.out.println(sayi);//14
		
		// Once artirmak sonra yazdirmak isterseniz ++sayi
		// Once yazdirmak sonra artirmak isterseniz sayi++
		
		System.out.println(++sayi); //15


	}

}
