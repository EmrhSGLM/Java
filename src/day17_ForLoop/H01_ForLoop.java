package day17_ForLoop;

public class H01_ForLoop {

	public static void main(String[] args) {
		/* 
		Soru 12 )
		Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
		asagidaki sekli cizdirin
		*
		* *
		* * *
		* * * *
		Soru
		*/
		
		
		for (int i = 1; i <= 4 ; i++) {// i satir sayisini temsil eder
			
			for (int j = 1; j <= i ; j++) { // j sutun sayisini tanimlar
				System.out.print("*"+ " ");
				
			}
			
			System.out.println("");
		}
		 

	}

}
