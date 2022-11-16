package java32;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("gasolina", 220);
		Car car2 = new Car();
		Car car3 = new Car("Diesel", 140);
		car1.refuel();
		car1.drive();
		car2.setFuel("Eléctrico");
		car2.drive();
		car3.refuel();
		car3.drive();
	}
}
