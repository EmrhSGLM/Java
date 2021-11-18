package day13_StringManipulations;

public class H02_HOMEWORK {

	public static void main(String[] args) {
		// Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz  String str1 = �$13.99�
				
		//       String str2 = %10.55$
		//		 ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
		
		String str1="13.99$" , str2="10.55$";
		
		str1=str1.replace("$","");
		str2=str2.replace("$","");
		
		
		System.out.println("Girilen sayilarin toplami : "+ (Double.parseDouble(str1)+Double.parseDouble(str2)   ));
		
		
		
		
		


	}

}
