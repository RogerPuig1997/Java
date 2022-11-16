package java33;

public class Targeta {
	private String entidad_emisora;
	private String numero;
	private String f_caducidad;
	private String titular;
	private int saldo = 1000;
	private int pago;
	private boolean activo = true;
	
	// Setters y getters
	public String getEntidad_emisora() {
		return entidad_emisora;
	}
	public void setEntidad_emisora(String entidad_emisora) {
		this.entidad_emisora = entidad_emisora;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getF_caducidad() {
		return f_caducidad;
	}
	public void setF_caducidad(String f_caducidad) {
		this.f_caducidad = f_caducidad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getPago() {
		return pago;
	}
	public void setPago(int pago) {
		this.pago = pago;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	// Metodos para activar y desactivar la tareta
	public void desactivar() {
		activo = false;
		System.out.println("La targeta esta desactivada");
	}
	public void activar() {
		activo = true;
		System.out.println("La targeta esta activa");
	}
	// Metodo para realizar un pago
	public void operacion() {
		if (activo == true){
			if (saldo >= pago) {
				saldo = saldo - pago;
				System.out.println("Nuevo saldo es: " + saldo);
			}else {
				System.out.println("No hay suficiente saldo");
			}
		} else {
			System.out.println("Targeta anulada: no se ha podido realizar la operación");
		}
	}
	// Metodo para ver el saldo actual
	public void verSaldo() {
		System.out.println("Tu saldo: " + saldo);
	}
	
	// Contructor con atributos
	public Targeta(String entidad_emisora, String numero, String f_caducidad, String titular, int saldo, int pago, boolean activo) {
		this.entidad_emisora = entidad_emisora;
		this.numero = numero;
		this.f_caducidad = f_caducidad;
		this.titular = titular;
		this.saldo = saldo;
		this.pago = pago;
		this.activo = activo;
	}
	// Contructor vacío
	public Targeta() {
		
	}
}
