package day46_collectios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		// Verilen bir Array'deki tekrar eden sayilari silip
		// unique degerlerden olusan bir array olusturun

		int arr[] = { 3, 4, 6, 4, 2, 1, 6, 8, 6, 5, 3, 1, 2, 4, 6, 7 };
		
		Set<Integer> benzersizSet = new HashSet<>();
		
		for (Integer each : arr) {
			
			benzersizSet.add(each);
			
		}
		
		System.out.println(benzersizSet); // siralama garantisi yoktur
		
		Object[] tekrarsizArr = benzersizSet.toArray();
		
		System.out.println(Arrays.toString(tekrarsizArr));
		
		int arr2[] = new int[benzersizSet.size()];
		
		int index=0;
		for(int each : benzersizSet) {
			arr2[index] =each;
			index++;
		}
		
		System.out.println(Arrays.toString(arr2));
		
		

	}

}
