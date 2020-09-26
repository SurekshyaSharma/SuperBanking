
public class Client {
	protected String name;
	protected String address;
	protected int id;
	
	public Client(int cid, String cname, String caddress) {
		id = cid;
		name = cname;
		address = caddress;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getAddress() {
		
		return  address;
	}
	
	public int getID() {
	
		return id;
	}
	
	public void printClientSummary()
	{
		//System.out.print(clientID+" - "+balance+"\n");
		System.out.print(id+" - "+name+" - "+address+" - \t\t $");
	}
	
}
