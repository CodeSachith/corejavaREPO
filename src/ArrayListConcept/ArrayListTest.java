package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static <E> void main(String[] args) {
		
		
		int[] a = new int[3]; //this is a static array, because size is fixed
		
		//non generic array - generics not applied. thats why warnings
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		//get the size of array list
		System.out.println("Array size : "+a1.size());
		
		// since generics is not applied to the array list, you can add any data type to the array list
		a1.add(30.65);
		a1.add("Selenium");
		a1.add('a');
		a1.add(true);
		
		//get the size of array list
		System.out.println("Array size : "+a1.size());
		
		//get the value from given index
		System.out.println(a1.get(3));
		
		
		/*
		 * print values of array list
		 * 
		 * 1. loop
		 * 2. Iterator
		 * 
		 */
		System.out.println("print values of array list using for loop");
		for(int i=0;i<a1.size();i++) {
			
			System.out.println(a1.get(i));
			
		}
		
		//non generics vs generics
		
		/*/
		 * generics defines the type of the data to be stored in the array
		 * wrapper classes are used for this (Integer,Double etc)
		 */
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		a2.add(3);
		a2.add(35);
		//strings not allowed in Integer array list
		//a2.add("test");
		
		ArrayList<String> a3 = new ArrayList<String>();
		
		a3.add("Sachith");
		a3.add("Chapa");
	
		//
		ArrayList<E> a4 = new ArrayList<E>();
		 
		
		System.out.println("********Class objects stored in ArrayList********");
		//Student class objects
		
		Student s1 = new Student("sachith", 30, "QA");
		Student s2 = new Student("chapa", 27, "Eng");
		Student s3 = new Student("pasan", 28, "Doc");
		
		//create array list to store Student objects
		
		ArrayList<Student> a5 = new ArrayList<Student>();
		
		a5.add(s1);
		a5.add(s2);
		a5.add(s3);
		
		//Iterator to traverse the values
		/*
		 * use while loop because Iterator does not work on the basis on index
		 */
		Iterator<Student> it = a5.iterator();
		while(it.hasNext()) {
			Student std = it.next();
			System.out.println("Student Name : "+std.name);
			System.out.println("Student Age : "+std.age);
			System.out.println("Student Department : "+std.dpt);
		}
		
		
		System.out.println("***** addAll() method ******");
		
		//addAll() method
		
		ArrayList<String> a6 = new ArrayList<String>();
		
		a6.add("test1");
		a6.add("test2");
		a6.add("test3");
		
		ArrayList<String> a7 = new ArrayList<String>();
		
		a7.add("test4");
		a7.add("test5");
		a7.add("test6");
		
		a6.addAll(a7);
		
		Iterator<String> it1 = a6.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("****** removeAll() method *****");
		
		//removeAll() method
		
		a6.removeAll(a7);
		for(int i=0;i<a6.size();i++) {
			
			System.out.println(a6.get(i));
		}
		
		System.out.println("***** retainAll() method ******");
		
		//retainAll() method
		
		ArrayList<String> a8 = new ArrayList<String>();
		
		a8.add("test1");
		a8.add("test2");
		a8.add("test3");
		
		ArrayList<String> a9 = new ArrayList<String>();
		
		a9.add("test3");
		a9.add("test2");
		a9.add("test6");
		
		a8.retainAll(a9);
		
		for(int i=0;i < a8.size();i++) {
			
			System.out.println(a8.get(i));
		}

	}

}
