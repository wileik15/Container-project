package containersoftware;

public class Order {

	private String startLocation;
	private String endLocation;
	private String currentLocation;
	private String cargo;
	private int orderID;
	static int IDcounter = 0;
	Container assignedContainer;
	
	public Order() {
		IDcounter++;
		orderID = IDcounter;
	}
	
	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setContainer(Container contain) {
		assignedContainer = contain;
	}
	
	public Container getContainer() {
		return assignedContainer;
	}
	
}
