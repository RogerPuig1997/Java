package java38;

public class Alumno implements IPersona{
	
	private String nombre;
	private String curso;
	public String getNombre() {
		return nombre;
	}
	public String setNombre(String nombre) {
		this.nombre = nombre;
		return nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	
}
