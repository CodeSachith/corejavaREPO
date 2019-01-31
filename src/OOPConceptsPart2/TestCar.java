package OOPConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism -- compile time polymorphism
		/*
		 * polymorphism is one to many. many methods, overide method
		 * during the compile time, it check whether to execute the method from parent class or
		 * to overide it by the child class
		 */
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("********");
		
		Car c1 = new Car();
		c1.start();
		c1.start();
		c1.refuel();
		
		
		
		System.out.println("********");
		
		/*
		 * child class object can be referred by parent class reference variable 
		 * this is know as dynamic polimopism - run time polymopism
		 * also know as Top Casting 
		 */
		
		Car c2 = new BMW();
		c2.start();
		c2.stop();
		c2.refuel();

		/*
		 * although object is created from BMW class, theftsafety() method cannot be accessed from c2 object 
		 * because c2 is created from parent class,
		 * but the method is in the child class
		 */
		
		//c2.theftSafety();
		
		System.out.println("********");
		
		//Downcasting - not possible
		
		//BMW b1 = new Car();
		
		
		//but it is possible through casting
		/*
		 * it will give no compile time error
		 * but ClassCastExpection will come during run time
		 * 
		 */
		
		BMW b1 = (BMW)new Car(); //run time exception
		

	}

}
