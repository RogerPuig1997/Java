package java30;
import java30s.HolaMundo;
import java30s.*;

public class Main {
	public static void main(String[] args) {
		// Import individual de HolaMundo
		HolaMundo hm = new HolaMundo();
		hm.saludar();
		// Sin importar HastaNunqui no podemos llamar al metodo, podemos importar el paquete entero
		HastaNunqui hn = new HastaNunqui();
		hn.patada();
	}
}
