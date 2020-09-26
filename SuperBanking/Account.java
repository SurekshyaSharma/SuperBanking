import java.util.Random;
public class Account implements PrintReports
{
	protected int accountNumber;
	protected double balance;
	int clientID;
	
	public Account(int id) {
		clientID = id;
		Random randomNumber = new Random();
		int next = randomNumber.nextInt();
		accountNumber = next;
		balance = 0;
	}
	
	//ClientCollection CL = new ClientCollection();
	
	public void credit(double value) {
		balance -= value;
	}
	
	public void debit(double value) {
		balance += value;
	}
	
	public int getNumber() {		
		return accountNumber;		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void printAccountSummary()
	{
		System.out.print(balance+"\n");
		//System.out.print(clientID+" - "+CC.Clients[clientID].getName()+" - "+CC.Clients[clientID].getAddress()+" - "+balance+"\n");
	}
}
