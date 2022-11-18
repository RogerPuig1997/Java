package java39;

public class Coche {
	private String company;
	private int speed;
	
	//Setters y getters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void getSpeed() {
		System.out.println(company + " car's speed is " + speed + " km/h");
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//Constructor
	public Coche(String company, int speed) {
		this.company = company;
		this.speed = speed;
	}
	
}
