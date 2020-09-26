
public class ClientCollection {

	public Client[] Clients = new Client[20];
	public void add(int id, String name, String address) {
		Clients[id] = new Client(id,name,address);
	}
	
	public void remove(int id) {
		Clients[id] = null;
	}
}
