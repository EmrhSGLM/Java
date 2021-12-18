package day45_collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll = new LinkedList<>();

		System.out.println(ll); // []

		ll.add(5);
		ll.add(7);

		System.out.println(ll); // [5, 7]
		
		System.out.println(ll.peek()); // silmeden ilk elemani bana getirir
		System.out.println(ll.peekFirst()); // silmeden ilk elemani bana getirir
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		
		System.out.println(ll2.peekFirst()); // null deque'dan geliyor
		System.out.println(ll2.peek()); // queue'dan geliyor
		
		System.out.println(ll.element()); // 5
		// System.out.println(ll2.element()); // java.util.NoSuchElementException
		
		System.out.println(ll.poll()); // 5 yazdirir ve ilk elementi siler
		System.out.println(ll); // [7]
		
		System.out.println(ll.poll()); // 7 yazdirir ve ilk elementi siler
		System.out.println(ll); // []
		
		System.out.println(ll.poll()); // null
		
		System.out.println(ll.hashCode()); // 1 Java'nin verdigi hashCode'u doner
		
		ll2.add(7);
		System.out.println(ll2.hashCode()); // 1 ==> Eklemeden once , 38 ==> Ekledikten sonra
		
		ll2.offer(10); // Hem ekleme yapiyor hem de ekledim diye true donuyor
		System.out.println(ll2.offer(20));
		System.out.println(ll2);// [7, 10, 20]
		
		ll2.push(2); // addFirst() ile ayni
		

	}

}
