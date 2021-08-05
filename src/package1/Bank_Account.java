package package1;

public class Bank_Account {
	
	private long accno;
	private String name;
	private double accbalance;
	



public  void depositAmount(double amt) {
	
	if(amt>0)
	{
		accbalance=accbalance+amt;
		System.out.println("Successsfully deposited amount is "+amt);
	}
	else
	{
	
	System.out.println("Amount cannot be deposited ");
	
}}

public void withdrawAmount(double amt)
{
	if(amt>0)
	{
		accbalance=accbalance-amt;
		System.out.println("Successfully withdrawn amount is "+amt);
	}
		else
			System.out.println("Amount cannot be withdrawn");
	}
public void show_balance()
{
	System.out.println("Your current balance is "+accbalance);
}
public Bank_Account(long accno,String name,double accbalance ) {
	this.accno=accno;
	this.name=name;
	this.accbalance=accbalance;
}
}