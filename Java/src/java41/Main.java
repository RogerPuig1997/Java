package java41;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
//		System.out.print("Iniciando partida \nJugador 1: ");
//		String player1 = sc.nextLine();
//		System.out.print("Jugador 2: ");
//		String player2 = sc.nextLine();
		
		String[] game = {" "," "," "," "," "," "," "," "," "};
		boolean win = false;

		
		
		System.out.println("|"+game[0]+"|"+"|"+game[1]+"|"+"|"+game[2]+"|\n"+"|"+game[3]+"|"+"|"+game[4]+"|"+"|"+game[5]+"|\n"
				+"|"+game[6]+"|"+"|"+game[7]+"|"+"|"+game[8]+"|");
		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				System.out.print("Jugador 1: Donde quieres ponerla? ");
				int p = sc.nextInt();	
				if (game[p]== " ") {
					game [p] = "X";
					System.out.println("|"+game[0]+"|"+"|"+game[1]+"|"+"|"+game[2]+"|\n"+"|"+game[3]+"|"+"|"+game[4]+"|"+"|"+game[5]+"|\n"
							+"|"+game[6]+"|"+"|"+game[7]+"|"+"|"+game[8]+"|");
				}else {
					System.out.println("Estas haciendo trampas");
					i--;
				}
			}else {
				System.out.print("Jugador 2: Donde quieres ponerla? ");
				int p = sc.nextInt();
				if (game[p]== " ") {
					game [p] = "O";
					System.out.println("|"+game[0]+"|"+"|"+game[1]+"|"+"|"+game[2]+"|\n"+"|"+game[3]+"|"+"|"+game[4]+"|"+"|"+game[5]+"|\n"
							+"|"+game[6]+"|"+"|"+game[7]+"|"+"|"+game[8]+"|");
				}else {
					System.out.println("Estas haciendo trampas");
					i--;
				}
			}
		}
		System.out.println("Empate!");
	}

}
