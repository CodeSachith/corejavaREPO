package corejava;

public class StaticandNonStaticConcept {

	
	String name = "TOM"; // non static global variable
	static int age = 25; // static global variable
	
		
	public static void main(String[] args) {
		
		
		//how to call static method
		
		//1.direct call
		sum();
		
		//2.call by classname
		StaticandNonStaticConcept.sum();
		
		
		//how to call static variables
		
		//1.direct call
		System.out.println(age);
		
		//2
		System.out.println(StaticandNonStaticConcept.age);
		
		//how to access not static variables and methods - by creating object(cannot access directly)
		
		StaticandNonStaticConcept obj = new StaticandNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can you access static methods by using the object reference ? yes, but it will throw warning
		obj.sum();
		
		
	}
	
	//non static method
	public void sendMail() {
		
		System.out.println("send mail method");
	}
	
	//static method
	public static void sum() {
		
		System.out.println("sum method");
	}

}
