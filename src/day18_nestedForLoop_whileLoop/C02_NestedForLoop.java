package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// Kullanicidan 10 dan kucuk pozitif bir tamsayi girmasini isteyin
		// girdigi sayiya gore asagidaki sekli yazdirin
		// orn: 3 girilirse
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);
		System.out.println("10 san kucuk bir sayi giriniz : ");
		int sayi = scan.nextInt();

		for (int satir = 1; satir <= sayi; satir++) {
			for (int j = 1; j <= satir; j++) {
				System.out.print(j + " ");

			}
			System.out.println("");
		}

		scan.close();
	}

}
