package day33_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ogrendik");
		
		// araya cok iyi ekleyelim
		
		sb.insert(4, "'yi cok iyi");
		
		System.out.println(sb); // Java'yi cok iyi ogrendik
		
		// 
		
		String str2="cok iyiyim";
		sb.insert(8, str2, 0, 4); // sb.insert(8, "cok iyiyim", 0, 4); ikiside olur
		
		System.out.println(sb); // Java'yi cok cok iyi ogrendik
		
		
	}

}
