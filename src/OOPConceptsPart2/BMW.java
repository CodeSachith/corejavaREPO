package OOPConceptsPart2;

public class BMW extends Car{//"has-a relationship"
	
	
	/*
	 * 
	 * when same method is present in the parent class and child class with the 
	 * same name,same type and same  number of arguments,
	 * it is called as method overiding
	 */
	
	public void start() { //over ridden method
		System.out.println("BMW----start");
	}
	
	public void theftSafety() {
		System.out.println("BMW-----theftsafety");
	}

}
