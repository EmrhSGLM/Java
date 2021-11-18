package day10_Ternary_switchCase;

public class C07_SwitchCase {

	public static void main(String[] args) {
		// gun numarasina gore gun isimlerini yazdiralim
		
		//Scanner scan = new Scanner(System.in);
		//System.out.println("lutfen gun numarasýný giriniz :");
		//int gunNo=scan.nextInt();
		
		
		int gunNo=5;
		
		switch(gunNo) {
			
		case 1:
			System.out.println("PAZARTESI");
			break;
		case 2:
			System.out.println("SALÝ");
			break;
		case 3:
			System.out.println("CARSAMBA");
			break;
		case 4:
			System.out.println("PERSEMBE");
			break;
		case 5:
			System.out.println("CUMA");
			break;
		case 6:
			System.out.println("CUMARTESI");
			break;
		case 7:
			System.out.println("PAZAR");
			break;
		default :
			System.out.println("Lutfen gecerli bir gun numarasi giriniz");
			
		}
		
		

	}

}
