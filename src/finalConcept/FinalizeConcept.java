package finalConcept;

public class FinalizeConcept {
	
	
	/*
	 * finalize is a method 
	 * it will be automatically get called 
	 * just before garbage collector 
	 * for cleanup processing
	 * 
	 */
	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		
		
		FinalizeConcept f1 = new FinalizeConcept();
		
		FinalizeConcept f2 = new FinalizeConcept();
		
		/*
		 * with this, there will be two objects in the memory with no reference
		 */
		System.out.println("****************");
		f1 = null;
		System.out.println("****************");
		f2 = null;
		System.out.println("****************");
		
		
		/*
		 * behavior of the garbage collector in java is that it will be automatically get called and destroy and objects with no references
		 * 
		 */
		
		//to call garbage collector manually
		System.gc();
		System.out.println("****************");

	}
	
	

}
