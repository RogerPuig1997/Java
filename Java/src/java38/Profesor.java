package java38;

public class Profesor implements IPersona {
	
	private String nombre;
	private int salario;

	public String getNombre() {
		return nombre;
	}
	public String setNombre(String nombre) {
		this.nombre = nombre;
		return nombre;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}