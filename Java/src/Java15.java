
public class Java15 {
	public static void main(String[] args) {
		int numero = 2;
		boolean par = numero%2 == 0;
		System.out.println(par ? "par":"impar");
		int random = (int) Math.round(Math.random());
		boolean rnd = random == 0;
		System.out.println(rnd ? "Blanco" : "Negro");
	}
}
