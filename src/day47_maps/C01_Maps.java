package day47_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {

		// 1- Bir map olusturmadan once map'e koyacagimiz Key ve Value degerlerini
		// incelemeliyiz
		// Tum degerleri koyabilmek icin Key ve Value icin Object,Object secebiliriz
		// Ama bu durumda map icerisindeki elemanlara ait bilgilere ulasmakta
		// zorlanabiliriz
		// Data turunu secerken hem icine koyacagimiz tum elemanlari kapsayacak bir data
		// turu secmeliyiz
		// Hem de icine koydugumuz tum elemanlari isleyebilecek sekilde basit data turu
		// secmeliyiz

		// 2- Map'i olustururken map'in turune de karar vermeliyiz

		Map<Integer, String> sinif = new HashMap<>();

		sinif.put(101, "Ali, Can, J.Dev");
		sinif.put(102, "Veli, Yan, QA");
		sinif.put(103, "Ali, Yan, C#");

		int no = 104;
		String isim = "Ayse";
		String soyisim = "Can";
		String brans = "QA";

		sinif.put(no, isim + ", " + soyisim + ", " + brans);

		System.out.println(sinif);
		// { 101=Ali, Can, J.Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#, 104=Ayse, Can,
		// QA}
		// map parc key1, value1 key2 value2 key3 value3 key4 value4

		// no su 102 olan ogrencinin bilgilerini gorelim
		System.out.println(sinif.get(102)); // Veli, Yan, QA

		System.out.println(sinif.get(104));// Ayse, Can, QA

		// Map de ki tum key'leri gorelim
		System.out.println(sinif.keySet()); // [101, 102, 103, 104] Bir Set olarak key degerlerini dondurur

		// Map de ki tum value'leri gormek istersek
		// ancak yazdirma islemi disinda bir sey yapamayiz
		System.out.println(sinif.values()); // [Ali, Can, J.Dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]
											// Collection olarak value degerlerini getirir
		
		
		// Siniftaki ogrencilerin isimlerini bir liste ekleyip yazdiralim
		
		List<String> valueList = new ArrayList<>(sinif.values());
		System.out.println("value List : "+valueList);
		System.out.println("value List size"+valueList.size()); // 4
		
		List<String> isimListesi = new ArrayList<>();
		String bilgiler[] = new String[3];
		
		for (int i = 0; i < valueList.size(); i++) {
			bilgiler = valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]);
		}
		System.out.println(isimListesi);
		
		String name = "";		
		for (String each : valueList) {
			
			name += each.substring(0,each.indexOf(","))+" ";
		}
		System.out.println(name);
		
		
		

	}

}
