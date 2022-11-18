package java40;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		System.out.print("Introduce un numero: ");
		int numero = sc.nextInt();		
		System.out.print("Introduce un ndecimal: ");
		double decimal = sc.nextDouble();
		System.out.print("Introduce un numero muy pequeño (max 127): ");
		byte bytes = sc.nextByte();
		System.out.print("Introduce true o false: ");
		boolean interruptor = sc.nextBoolean();
		sc.nextLine();
		System.out.print("Introduce un nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Numero: " + numero + ", numero decimal: " + decimal + ", numero byte: " + bytes
				+ ", Interruptor: " + interruptor + ", nombre: " + nombre);
	}

}
