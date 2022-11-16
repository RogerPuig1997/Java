package java35;

public class Empleado extends Persona {
	private String tipoContrato;
	private int sueldo;
	
	// Setters y getters
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	// Metodo para calcular el sueldo
	public void calcularSueldo() {
		sueldo = 1250;
		System.out.println("El sueldo de " + getNombres() + " es: " + sueldo);
	}
}
