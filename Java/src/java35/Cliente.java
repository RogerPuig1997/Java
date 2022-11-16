package java35;

public class Cliente extends Persona {
	private String categoria;
	private int codigo;
	
	// Setters y getters
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	// Metodo para generar codigo
	public void generarCodigo() {
		codigo = 1234;
		System.out.println("Nuevo codigo: " + codigo);
	}
}
