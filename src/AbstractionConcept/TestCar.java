package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b1 = new BMW();

		b1.start();

		b1.stop();

		b1.refuel();
		
		b1.theftSafety();
		
		
		/*
		 * dynamic  polymorphism : BMW object can be referenced by Car interface reference variable
		 * 
		 * but this reference variable cannot call the BMW only methods
		 */
		
		Car c1 = new BMW();
		
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.theftSafety(); interface reference variable cannot call the BMW only methods
		

	}

}
