package ConstructorConcept;

public class SuperKeywordChild extends SuperKeywordParent {

	public SuperKeywordChild() {

		/*
		 * 2. super keyword is used to call parent class constructor 3. super keyword
		 * should be the first statement inside the constructor 4. if the parent class
		 * has multiple constructors, using super keyword, only one constructor can be
		 * called at a time 5. only one super keyword can be written in a single
		 * constructor
		 */

		// two parameterized constructor in the parent class is called
		super(10, 20);
		System.out.println("child class constructor");
		System.out.println("***********************");

	}

	public SuperKeywordChild(int i) {

		// single parameterized constructor in the parent class is called
		super(i);
		System.out.println("child class paramaterized constructor value i : " + i);
		System.out.println("***********************");

	}

	public static void main(String args[]) {

		/*
		 * 1. when the class is initialized, by default, default constructor of all the
		 * inherited classes are created
		 */
		SuperKeywordChild obj1 = new SuperKeywordChild();

		SuperKeywordChild obj2 = new SuperKeywordChild(20);
	}

}
