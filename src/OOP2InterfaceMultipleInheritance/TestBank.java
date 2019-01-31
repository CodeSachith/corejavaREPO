package OOP2InterfaceMultipleInheritance;

public class TestBank {

	public static void main(String[] args) {
		
		//access static variables using interface : inteface.variable
		System.out.println(USBank.min_balance);
		
		//variables in interface are final. so cannot change their values
		//USBank.min_balance = 200;
		HSBCBank.salary = 400;
		
		
		
		
		
		HSBCBank hs = new HSBCBank();
		
		//static polymorphism - methods getting over ridden at child class level
		hs.credit();
		hs.debit();
		hs.transferMoney();
		
		hs.carLoan();
		hs.educationLoan();
		
		//dynamic polymorphism - child class objects being referred by parent interface reference variable
		
		USBank ub = new HSBCBank();

	}

}
