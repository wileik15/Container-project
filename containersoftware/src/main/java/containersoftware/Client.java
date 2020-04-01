package containersoftware;

import java.util.ArrayList;

public class Client extends Account {
	
	private ArrayList<Order> shipments = new ArrayList<Order>();
	private String referencePerson;
	static int IDcounter = 0;
	private int clientID;
	
	public Client(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
		IDcounter++;
		clientID = IDcounter;
	}
	
	public void addShipments(Order ship) {
		shipments.add(ship);
	}
	
	public void removeShipments(int location) {
		shipments.remove(location);
	}
	
	public ResponceObject hasShipments() {
		ResponceObject responce = new ResponceObject("Has shipments");
		if(shipments.isEmpty()) {
			return responce = new ResponceObject("Has no shipments");
		}
		return responce;
	}

	public Order getShipment(int location) {
		return shipments.get(location);
	}
	
	
	

}
