package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Java'da bir dosya'ya ulasmak istedigimizde FileInputStream class'indan yardim aliriz
		 
		
		FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");
		
		// Java bu kodda olasi bir problem ongoruyor
		// bu probleme karsi ne yapmasi gerektigini bize soruyor
		// (Yani alti cizilen her kod CTE degildir)
		
		// Bunun icin iki durum soz konusu
		// 1- try catch kullanark bu problemi HANDLE edip Java'nin yoluna devam etmesini saglayabiliriz
		// 2- Eger dosya okunamiyorsa kod calismasin istiyorsak olayin farkinda oldugumuzu 
		//    ve sorumlulugun biz<de oldugunu Java'ya soylemeliyiz
		
		System.out.println("Gorev tamamlandi");

	}

}
