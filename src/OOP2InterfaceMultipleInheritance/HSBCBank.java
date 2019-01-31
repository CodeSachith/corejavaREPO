package OOP2InterfaceMultipleInheritance;

public class HSBCBank implements USBank,BrazilBank{
	
	static int salary = 300;

	@Override
	public void credit() {
		System.out.println("HSBC----credit");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC-----debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC----trasferMoney");
		
	}
	
	public void educationLoan() {
		System.out.println("HSBC---educationLoan");
	}
	
	public void carLoan() {
		
		System.out.println("HSBC----carLoan");
	}

	@Override
	public void mutualFunds() {

		System.out.println("HSBC----mutualfunds");
		
	}

}
