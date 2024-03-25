
public class Thermostat {
	
	private float currentTemp;
	private float desiredTemp;
	
	public Thermostat(float currentTemp, float desiredTemp) {
		this.currentTemp = currentTemp;
		this.desiredTemp = desiredTemp;
	}
	
	public float getCurrentTemp() {
		return currentTemp;
	}
	
	public void setCurrentTemp(float currentTemp) {
		this.currentTemp = currentTemp;
	}
	
	public float getDesiredTemp() {
		return desiredTemp;
	}
	
	public void setDesiredTemp(float desiredTemp) {
		this.desiredTemp = desiredTemp;
	}
	
	public void furnace_on() {
		
		if (currentTemp < desiredTemp) {
			System.out.println("Furnace is turned on.");
		}
	}
	
	public void furnace_off() {
		if (currentTemp >= desiredTemp) {
			System.out.println("Furnace is turned off.");
		}
	}
	
	public static void main(String[] args) {
		
		Thermostat myThermostat = new Thermostat(20.0f, 25.0f); 
		
		myThermostat.furnace_on();
	}

}
