package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Arrays {

	public static void main(String[] args) {
		/*
		 * Soru 5 Kullanicidan bir cumle isteyin ve 
		 * 		  cumledeki kelime sayisini yazdirin(Her sey, javayla kolay)
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a sentence : ");
		String cumle=scan.nextLine();
		String kelimeler[]= cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler)); // [Her, sey,, javayla, kolay]
		System.out.println("Girilen cumlede " + kelimeler.length + " adet kelime var");
		
		System.out.println();
		for (int i = kelimeler.length ; i >= 0 ; i--) {
			System.out.print(kelimeler[i]+" ");
		}
		scan.close();
		

	}

}
