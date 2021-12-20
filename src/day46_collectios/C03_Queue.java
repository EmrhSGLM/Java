package day46_collectios;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		// Queue ==> Gelen sona gelir, silinen bastan silinir.
		// Buna da FIFO(First in First out) ilk gelen ilk gider denir
		
		
		Queue<String> kuyruk = new LinkedList<>();
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk); // [Lutfullah, Mustafa, Ridvan]
		
		kuyruk.remove(); // Queue yapisi oldugu icin remove bastan cikarir
		System.out.println(kuyruk); // [Mustafa, Ridvan]
		
		kuyruk.remove();
		System.out.println(kuyruk); // [Ridvan]
		
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk); // [Ridvan, Ridvan]
		
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null); 
		System.out.println(kuyruk); // [Ridvan, Ridvan, null, null, null]
		

	}

}
