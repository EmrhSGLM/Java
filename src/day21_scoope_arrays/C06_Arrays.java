package day21_scoope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int arr[] = {1,2,5,4,3,6};
		
		int toplama=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplama+=arr[i];
			
		}
		
		System.out.println("toplam = "+toplama);
		
		// array'in tum elemanlarini once kucukten buyuge sonra buyukten kucuge yazdirin
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// buyukten kucuge
		// ya for loop ile elemanlari yazdirabiliriz
		
		for (int i = arr.length-1 ; i >= 0 ; i--) {
			
			System.out.print(arr[i] + " ");
			
		}
		
		// array yapmak isterseniz ayni uzunlukta bir array olusturup
		// elemanlari ters sirada yeni arraye tasiyabilirsiniz
		
		System.out.println(" ");
		
		int tersArray[] = new int[arr.length];
		
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i] = arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(tersArray));
		
		
		
		
		
	}

}
