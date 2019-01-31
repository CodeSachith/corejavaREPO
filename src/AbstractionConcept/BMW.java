package AbstractionConcept;

public class BMW implements Car{

	@Override
	public void start() {
		
		System.out.println("BMW---start");
		System.out.println("*******************");
	}
	@Override
	public void stop() {
		
		System.out.println("BMW---stop");
		System.out.println("*******************");
	}

	@Override
	public void refuel() {
		
		System.out.println("BMW---refuel");
		System.out.println("*******************");
	}
	
	//non over ridden method
	public void theftSafety() {
		
		System.out.println("BMW---theft safety");
		System.out.println("*******************");
	}

}
