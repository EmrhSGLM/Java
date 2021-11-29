package day28_constructorCall_staticKeyword;

public class C03 {

	public static void main(String[] args) {
	// java run time bir programdir
	// run tusuna bastigimizda java calismaya baslar ve islemler yapar
	// java'nın isi bittiginde (calisma tusu kirmizidan geriye dondugunde)
	// hersey basa doner
		
	// static variable ve methodlar bulunduklari class ile ilintilidir (obje ile degil class ile)
	// baska bir class da iken C02 de ki static variable veya methoda ulasmak istedigimizde 
	// C02.staticVariableIsmive C02.staticMethodIsmi() yazmamiz yeterli olur

		C02 obje1 = new C02();
		System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);
		obje1.x++;
		C02.y++;
		//obje1.y++;
	// static bir variable'a class ismi uzerinden ulasmak yerine
	// instance variable'lar gibi ile ulasmaya calisirsaniz
	// Java CTE vermez ama solda ! isreti ile bizi uyarir
	// static bir field olan C02.y'ye static yoldan ulas der
		System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);

		C02 obje2 = new C02();
		System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + C02.y);
		obje2.x++;
		C02.y++;
		System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + C02.y);

		System.out
				.println("obje 2 olusturulduktan ve islemden sonra obje1'in " + " x : " + obje1.x + " y : " + C02.y);

		C02 obje3 = new C02();

		obje3.x = 20;
		C02.y = 40;

		System.out.println("\nobje3 den sonra obje1'in x : " + obje1.x); // 6
		System.out.println("obje3 den sonra obje2'in x : " + obje2.x); // 6
		System.out.println("obje3 den sonra obje3'in x : " + obje3.x); // 20

		System.out.println("\nobje3 den sonra obje1'in y : " + C02.y); // 40
		System.out.println("obje3 den sonra obje2'in y : " + C02.y); // 40
		System.out.println("obje3 den sonra obje3'in y : " + C02.y); // 40

	}

}
