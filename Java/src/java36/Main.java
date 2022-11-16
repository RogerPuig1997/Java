package java36;

public class Main {
	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		Operario emp2 = new Operario();
		Oficial emp3 = new Oficial();
		
		emp1.setNombre("Pepe");
		System.out.println(emp1.toString());
		
		emp2.setNombre("Juan");
		System.out.println(emp2.toString());
		
		emp3.setNombre("Pedro");
		System.out.println(emp3.toString());
	}
}
