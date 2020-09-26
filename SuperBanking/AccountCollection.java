
public class AccountCollection 
{
		Account[] Accounts = new Account[20];
	
		
	public void add(int id) {
		Accounts[id] = new Account(id);
	}
	
	public void remove(int id) {
		Accounts[id] = null;
	}
	
}
