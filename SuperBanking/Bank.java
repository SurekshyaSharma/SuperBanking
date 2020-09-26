
public class Bank {

	AccountCollection AC = new AccountCollection();
	public ClientCollection CC = new ClientCollection();
	
	public void addAccount(int id) {
		AC.add(id);
	}
	
	public void removeAccount(int id) {
		AC.remove(id);
	}
	
	public void addClient(int id, String name, String address) {
		CC.add(id,name,address);
	}
	
	public void removeClient(int id){
		CC.remove(id);
	}
	
	public void credit(int id, double value) {
		AC.Accounts[id].credit(value);
	}
	 
	public void debit(int id,double value)
	{
		AC.Accounts[id].debit(value);
	}
	public void printAllCustomers(int j) {
		
		//System.out.print(j);
		for (int i=0; i<=j; i++)
		{
			if(CC.Clients[i]!=null)
			{
			CC.Clients[i].printClientSummary();	
			AC.Accounts[i].printAccountSummary();
			}
			
		
		}
		
	}
	
}
