package AbstractionConcept;

public class TestAbstraction {

	public static void main(String[] args) {

		HDFCBank hb = new HDFCBank();

		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();

		/*
		 * Dynamic polymorphism
		 * 
		 * you can make a reference to the HDFCBank object from the Bank abstract class
		 * reference variable and call all the inherited methods and the over ridden
		 * methods
		 * 
		 * but you cannot call the methods specific to child class only
		 */
		Bank b = new HDFCBank();

		b.credit();
		b.debit();
		b.loan();
		// b.funds(); cannot call this method by Bank abstract class reference variable
		
		//Bank b2 = new Bank(); cannot create objects from abstract classes

	}

}
