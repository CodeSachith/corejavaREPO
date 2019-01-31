package AbstractionConcept;

public interface Car {
	
	/*
	 * via interfaces, can achieve "Full Abstraction"
	 * 
	 * all the methods are abstract, no implementation done and only method declaration(no method body)
	 * 
	 * performance vice, abstract classes are faster than interfaces
	 */
	
	//only final and static variables
	int wheel = 4;
	
	public void start();
	public void stop();
	public void refuel();

}
