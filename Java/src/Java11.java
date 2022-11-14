public class Java11  {
	public static void main(String[] args) {
		int numero = 0;
		incrementar(numero);
		decrementar(numero);
	}
	public static void incrementar (int numero) {
		numero++;
		System.out.println(numero);
	}
	public static void decrementar (int numero) {
		numero--;
		numero--;
		System.out.println(numero);
	}
}