package containersoftware;

public class Container {
	
	static int IDcounter = 0;
	private int id = 0;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public Container() {
		IDcounter++;
		id = IDcounter;
	}
	
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	
	public int getID() {
		return id;
	}


}
