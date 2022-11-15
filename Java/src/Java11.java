public class Java11  {
	public static void main(String[] args) {
		int numero = 0;
		System.out.println(incrementar(numero));
		System.out.println(decrementar(numero));
	}
	public static int incrementar (int numero) {
		numero++;
		return numero;
	}
	public static int decrementar (int numero) {
		numero--;
		numero--;
		return numero;
	}
}