package ConstructorConcept;

public class ConstructorConceptTest {
	
	
	/*
	 * constructors is a class entity to define class features while creating objects, in the form of global variables
	 * 
	 * 
	 * similar to function,but not an function 
	 * cannot return any value
	 * name is equal to class name
	 * constructor is called immediately when the object is created
	 * default constructor is there if you create or not
	 */
	
	/*
	 * constructor overloading : multiple constructors for the same class, with different no/types of parameters
	 */
	
	/*
	 * default constructor
	 * it is with zero parameters
	 */
	public ConstructorConceptTest() {
		
		System.out.println("Default constructor");
		System.out.println("******************");
		
	}
	
	/*
	 * parameterize constructor: single parameter
	 * 
	 */
	public ConstructorConceptTest(int i) {
		
		System.out.println("single parameter constructor");
		System.out.println("value of i : "+i);
		System.out.println("******************");
		
	}
	
	/*
	 * parameterize constructor: two parameters
	 * 
	 */
	public ConstructorConceptTest(int i,int j) {
		
		System.out.println("two parameter constructor");
		System.out.println("value of i : "+ i);
		System.out.println("value of j : "+ j);
		System.out.println("******************");
		
	}

	public static void main(String[] args) {
		
		ConstructorConceptTest obj = new ConstructorConceptTest();
		
		ConstructorConceptTest obj1 = new ConstructorConceptTest(10);
		
		ConstructorConceptTest obj3 = new ConstructorConceptTest(10,20);
		
	}

}
