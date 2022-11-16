package java34;

public class Programmer extends Employee {
	private int bonus = 200;
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public void verSalario() {
		int salaryTotal = (int) (getSalary() + bonus);
		System.out.println("Tu salario: " + salaryTotal);
	}
}
