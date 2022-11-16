package java32;

public class Car {
	private String fuel;
	private int maxspeed;
	
	public String getFuel() {
		return this.fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public void refuel() {
		System.out.println("Introducimos " + this.fuel);
	}
	public void drive() {
		System.out.println("Conduce a " + this.maxspeed + " gastando " + this.fuel);
	}
	// Constructor vacío
	public Car() {
		System.out.println("Constructor sin parámetros");
	}
	// Constructor con parámetros
	public Car(String fuel, int maxspeed) {
		this.fuel = fuel;
		this.maxspeed = maxspeed;
	}
}
