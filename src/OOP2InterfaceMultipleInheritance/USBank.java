package OOP2InterfaceMultipleInheritance;

public interface USBank {
	
	int min_balance = 100; //by default, this variable is static
	
	/*
	 * only abstract methods. no method declaration. method should be declared in the class which implementing the interface
	 */
	public void credit();
	
	public void debit();
	
	public void transferMoney();

}
