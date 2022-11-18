package java38;

public class Main {

	public static void main(String[] args) {

		Profesor profe1 = new Profesor();
		profe1.setNombre("David");
		System.out.println(profe1.getNombre());
		
		Alumno alum1 = new Alumno();
		alum1.setNombre("Roger");
		System.out.println(alum1.getNombre());
	}

}
