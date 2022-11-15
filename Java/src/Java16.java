import java.util.Scanner; 

public class Java16 {
	public static void main(String[] args) {
		// 1.
		int numero = (int) Math.round(Math.random());
		
		// If unidireccional
		if (numero == 0) {
			System.out.println("Rojo");
		}
		if (numero == 1) {
			System.out.println("Negro");
		}
		// If bidireccional
		if (numero == 0) {
			System.out.println("Rojo");
		}else {
			System.out.println("Negro");
		}
		// Operador ternario
		boolean res = numero == 0;
		System.out.println(res ? "Rojo":"Negro");
		
		//2
		System.out.println("Introduce la temperatra");
		Scanner sc = new Scanner(System.in);
		float temp = sc.nextFloat();
		if (temp < 5) {
			System.out.println("Clima frío Polar");
		}
		if (temp >= 5 && temp < 10) {
			System.out.println("Clima frío de Alta Montaña");
		}
		if (temp >= 10 && temp < 13.5) {
			System.out.println("Clima templado Oceánico");
		}
		if (temp >= 13.5 && temp < 16.5) {
			System.out.println("Clima templado Mediterráneo");
		}
		if (temp >= 16.5 && temp < 20) {
			System.out.println("Clima templado Continental");
		}
		if (temp >= 20 && temp < 23.5) {
			System.out.println("Clima cálido Equatorial");
		}
		if (temp >= 23.5 && temp < 26.5) {
			System.out.println("Clima cálido Tropical");
		}
		if (temp >= 26.5) {
			System.out.println("Clima cálido Desértico");
		}
	}
}
