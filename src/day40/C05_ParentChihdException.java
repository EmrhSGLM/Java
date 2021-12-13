package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChihdException {

	public static void main(String[] args) {
		
		try {
		    FileInputStream fis=new  FileInputStream("src\\day40\\yazi.txt");
		    
		    int k=0;
		    while((k=fis.read())!=-1) {
		        System.out.print((char)k);
		        
		    }
		    }catch(FileNotFoundException e){
		    	
		        System.out.println("Dosya okunamıyor");
		        
		    }catch (IOException a) {
		    	
		        System.out.println("Dosya Silinmiş veya ulaşılamıyor");
		    }
		
		System.out.println("");
		System.out.println("görev tamamlandı");
		
		// 		Birden fazla catch block kullanilacaksa yazilacak exception’larin sirasi
		//	onemlidir.
		
		///  Birbiri ile parent child	iliskisi olan exception’lar	ise once child olan	yazilmalidir. 
		//	 Aksi durumda child exception kullanilmaz olur.
		
	}

}

