package ConstructorConcept;

public class ConstructorWithThiskeyWord {
	
	
	//class variables
	String name;
	int age;
	
	public  ConstructorWithThiskeyWord(String name,int age) {
	

		/*
		 * this keyword is used to initialize class variables
		 */
		this.name = name;
		this.age = age; 
		
		
		 System.out.println("name is : "+ name);
		 System.out.println("age is : "+ age);
		
	}
	public static void main(String[] args) { 
		
		
		ConstructorWithThiskeyWord obj1 = new ConstructorWithThiskeyWord("Mark", 21);
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);

	}

}
