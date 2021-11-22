package day23_multiDimensionalArrays;

public class C03_MDArrays {

	public static void main(String[] args) {
		/*
		 * Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini
		 * ekrana yazdiran bir method yaziniz. { { 1,2,3}, {4,5,6}
		 */
		
		int arr[][]={ { 1,2}, {4,5,6,7}};
		int sayi=0;
		int carpimlar=1;
		for (int i = 0; i < arr.length ; i++) {
			
			for (int j = 0; j < arr[i].length ; j++) {
				sayi= arr[i][j];
				carpimlar*=sayi;
				
			}
		}
		System.out.println("Carpimlari : "+carpimlar);
		
		
	}

}
