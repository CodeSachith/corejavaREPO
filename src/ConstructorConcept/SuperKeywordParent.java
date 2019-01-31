package ConstructorConcept;

public class SuperKeywordParent {

	public SuperKeywordParent() {

		System.out.println("parent class constructor");
		System.out.println("***********************");
	}

	public SuperKeywordParent(int i) {

		System.out.println("parent class paramaterized constructor value i : " + i);
		System.out.println("***********************");
	}

	public SuperKeywordParent(int i, int j) {

		System.out.println("parent class paramaterized constructor value i : " + i);
		System.out.println("parent class paramaterized constructor value j : " + j);
		System.out.println("***********************");
	}

}
