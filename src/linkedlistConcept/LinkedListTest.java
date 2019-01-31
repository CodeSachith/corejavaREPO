package linkedlistConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		//add data to linked list
		l1.add("test1");
		l1.add("test2");
		l1.add("test3");
		l1.add("test4");
		l1.add("test5");
		
		//print values in linked list
		System.out.println("Content of the linked list" + l1 );
		
		//addfirt
		l1.addFirst("Sachith");
		System.out.println(l1);
		
		//addlast
		l1.addLast("Senevirathna");
		System.out.println("Content of the linked list" + l1 );
		
		//get
		System.out.println(l1.get(0));
		System.out.println(l1);
		
		//set
		l1.set(0, "gamage");
		System.out.println(l1.get(0));
		System.out.println(l1);
		
		//remove first and last element
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		
		//
		l1.remove(3);
		System.out.println(l1);
		
		/*
		 * print values of linked list
		 * 
		 * for loop
		 * advance for loop
		 * Iterator
		 * while loop
		 */
		
		//for loop
		System.out.println("**** print using for loop ****");
		
		for(int i=0;i<l1.size();i++) {
			
			System.out.println(l1.get(i));
		}
		
		//advance for loop
		System.out.println("**** print using advance for loop ****");
		
		for(String str : l1) {
			System.out.println(str);
		}
		
		//Iterator
		System.out.println("**** print using Iterator ****");
		
		Iterator<String> I1 = l1.iterator();
		while(I1.hasNext()) {
			System.out.println(I1.next());
		}
		
		//while loop
		System.out.println("**** print using whil eloop ****");
		
		int num=0;
		while(l1.size() > num) {
			System.out.println(l1.get(num));
			num++;
		}
		
		
		

	}

}
