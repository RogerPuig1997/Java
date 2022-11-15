
public class Java21 {
	public static void main(String[] args) {
		System.out.println(javaorNull("java"));
		System.out.println(login("admin", 1234));
		System.out.println(f_par());
	}
	public static String javaorNull (String par) {
		if (par == "java") {
			return "Java";
		}
		return null;
	}
	public static String login (String usuario, int password) {
		if (usuario == "admin" && password == 1234) {
			return "Login true";
		}
		return "Login false";
	}
	public static boolean f_par () {
		int rnd = (int) Math.round(Math.random());
		if (rnd%2 == 0) {
			return true;
		}
		return false;
	}
}
