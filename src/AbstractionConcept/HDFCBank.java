package AbstractionConcept;

public class HDFCBank extends Bank {

	/*
	 * class which inherit an abstract class must implement the abstract methods in
	 * the parent class by overiding them
	 * 
	 * through inheritance, non abstract methods in the abstract parent class is
	 * still available for the child class
	 * 
	 */
	@Override
	public void loan() {

		System.out.println("HDFC---loan method");
		System.out.println("*************************");

	}

	public void funds() {
		
		System.out.println("HDFC---funds method");
		System.out.println("*************************");

	}
}
