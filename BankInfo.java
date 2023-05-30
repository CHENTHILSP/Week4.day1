package Assignment3day3;

public class BankInfo {
	
	public void saving() {
		System.out.println("Account No: XXXXXX3456 Balance: Rs.9000.00 in Saving Account");
	}
	public void fixed() {
		System.out.println("Account No: XXXXXX7983 Balance: Rs.15000.00 in Fixed Deposit Account");
	}
	public void deposit() {
		System.out.println("Account No: XXXXXX5682 Credited for Rs 25000 in Current Deposit Account");
	}
	
	public static void main(String[] args) {
		BankInfo call = new BankInfo();
		call.saving();
		call.fixed();
		call.deposit();

	}



}
