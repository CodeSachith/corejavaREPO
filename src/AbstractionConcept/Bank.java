package AbstractionConcept;

public abstract class Bank {

	/*
	 * 1. By adding abstract key word, you can create an abstract class 2. There
	 * should be at least one abstract method in the abstract class
	 * 
	 * abstract classes cannot be instantiate : cannot create objects
	 * 
	 * performance vice, abstract classes are faster than interfaces
	 */

	/*
	 * Abstraction : hiding the real implementation logic
	 * 
	 * for loan method, real implementation logic is written inside the respective
	 * child classes which inherit the Bank class. by this way, Bank does not write
	 * the implementation logic of loan() method
	 * 
	 * but for non abstract methods like credit(), debit(), implementation logic is
	 * written, which mean no abstraction
	 * 
	 * therefore abstract class support "Partial Abstraction"
	 */
	
	/*
	 * abstract class allows all variable types
	 */
	
	//non static variable
	int amt=100;
	//static variable
	static int laonRate=20;
	//constant
	final int rate = 30;

	// abstract method : no method body
	public abstract void loan();

	/*
	 *non abstract methods  
	 */
	public void credit() {

		System.out.println("Bank----credit");
		System.out.println("*************************");

	}

	public void debit() {

		System.out.println("Bank----debit");
		System.out.println("*************************");
	}
}
