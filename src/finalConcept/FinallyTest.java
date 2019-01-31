package finalConcept;

public class FinallyTest {

	public static void main(String[] args) {
		
		test1();
		
		System.out.println("***********");
		
		test2();
		
		System.out.println("***********");
		
		division();
		
		System.out.println("***********");
		
		division2();
	}
	
	
	public static void test1() {
		
		/*
		 * 1. used with try catch block
		 * 2. it guarantees that what ever written in the finally block will get executed
		 * 3. it will be executed after the exception is triggered (try catch block)
		 */
		
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside the catch block");
		}
		
		finally {
			System.out.println("inside the finally block");
		}
	
	}
	
	
	public static void test2() {
		 
		try {
			System.out.println("inside try of test2 method");
		}
		finally {
			System.out.println("inside finally of test2 method");
		}
	}
	
	public static void division() {
		
		int a=10;
		try {
			System.out.println("inside try block");
			int k = a/0; //this will trigger an arithmatic exception
		}
		/*
		 * arithmatic exception will occur and catch block will  catch it. 
		 * therefore it will  come into the catch block
		 * after which the finally block will get executed
		 */
		catch(ArithmeticException e){
			System.out.println("inside the catch block");
			System.out.println("divide by zero error");

		}
		finally {
			System.out.println("execute this code even after any exception");
		}
	}
	
	public static void division2() {
		
		int a=10;
		try {
			System.out.println("inside try block");
			int k = a/0; //this will trigger an arithmatic exception
		}
		/*
		 * arithmatic exception will occur and catch block will not catch it. 
		 * therefore it will not come into the catch block
		 * still the finally block will get executed
		 */
		catch(NullPointerException e){
			System.out.println("inside the catch block");
			System.out.println("divide by zero error");

		}
		finally {
			System.out.println("execute this code even after any exception");
		}
	}
	
	/*
	 * finally will be called always, even if the execution comes into the catch block or not
	 */
	
	/*
	 * examples of use ages
	 * 
	 * when writing database connections, if the connection fails, it will throws an exception
	 * and if you have written the data base close code in the finally block, it will still get executed and close the connection
	 * 
	 * in selenium, by writing the driver.quit(); code inside the finally block, even if any exception is occurred,
	 * it will make sure the driver is getting closed 
	 * 
	 */
	
	
	
		

}
