package java33;

public class Main {
	public static void main(String[] args) {
		Targeta cliente1 = new Targeta();
		cliente1.setPago(200);
		cliente1.verSaldo();
		cliente1.operacion();
		cliente1.operacion();
		cliente1.operacion();
		cliente1.operacion();
		cliente1.desactivar();
		cliente1.operacion();
		cliente1.activar();
		cliente1.operacion();
		cliente1.operacion();
	}
}
