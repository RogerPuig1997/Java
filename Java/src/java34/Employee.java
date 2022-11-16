package java34;

public class Employee {
	private float salary = (float) 1249.95;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void verSalario() {
		int salaryTotal = (int) salary;
		System.out.println("Tu salario: " + salaryTotal);
	}
}
