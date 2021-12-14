package day41_errors_garbageCollector;

public class C03 {

	public static void main(String[] args) {
		
		System.out.println(C02.pi);
		
		// C02.pi=4.3; // pi sayisini static olarak tanimladik ki heryerden rahatlikla ulasabilelim
		//			               final yaptik ki isteyen degistiremesin diye			
		
		System.out.println(C02.pi);

	}

}
