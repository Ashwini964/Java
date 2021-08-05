package package1;

public class BankAccount_Main {

	public static void main(String[] args) {
Bank_Account  b1= new Bank_Account(387899,"Ashwini",500876);
b1.show_balance();
b1.depositAmount(10000);
b1.withdrawAmount(36000);
b1.show_balance();
b1.depositAmount(-500);
b1.show_balance();

	}

}
