package day23_multiDimensionalArrays;

public class C04_MDArrays {

	public static void main(String[] args) {
		/*
		 * Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son
		 * elemanlarin carpimini ekrana yazdiran bir program yaziniz { { 1,2,3}, { 4,5},{6}}
		 */
		
		int arr[][]={ { 1,2,3}, { 4,5},{6} };
		int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
			carpim*=arr[i][arr[i].length-1];
			
		}
		
		System.out.println("Son elementlerin carpimi : "+carpim); // 90
		
		/*
		int arr[][]={ { 1,2,3}, { 4,5},{6} };
		
		int carpimi=1;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = arr[i].length-1; j < arr[i].length; j++) {
				carpimi*=arr[i][j];				
			}
			
		}
		System.out.println("Son elementlerin carpimi : "+carpimi); // 90
	*/
	}

}
