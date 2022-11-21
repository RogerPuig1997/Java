package java41;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("Iniciando partida \nJugador 1: ");
		String player1 = sc.nextLine();
		System.out.print("Jugador 2: ");
		String player2 = sc.nextLine();
		
		String[] game = {" "," "," "," "," "," "," "," "," "};
		System.out.println(game.length);
		
		System.out.println("|"+game[0]+"|"+"|"+game[1]+"|"+"|"+game[2]+"|\n"+"|"+game[3]+"|"+"|"+game[4]+"|"+"|"+game[5]+"|\n"
				+"|"+game[6]+"|"+"|"+game[7]+"|"+"|"+game[8]+"|");
		
		
		for (int i = 0; i < 9; i++) {
			boolean win1 = winPlayer1(game);
			boolean win2 = winPlayer2(game);
			System.out.println(winPlayer1(game));

			if (win1 == true) {
				System.out.println("Gana " + player1 +"!!");
				break;

			} else if (win2 == true) {
				System.out.println("Gana " + player2 +"!!");
				break;

			}else if (i == 9 && win1 == false && win2 == false) {
				System.out.println("Empate!!");
				break;
				
			}else {
				if (i % 2 == 0) {
					System.out.print("Jugador 1: Donde quieres ponerla? ");
					int p = sc.nextInt();
					if (game[p] == " ") {
						game[p] = "X";
						System.out.println("|" + game[0] + "|" + "|" + game[1] + "|" + "|" + game[2] + "|\n" + "|"
								+ game[3] + "|" + "|" + game[4] + "|" + "|" + game[5] + "|\n" + "|" + game[6] + "|"
								+ "|" + game[7] + "|" + "|" + game[8] + "|");
					} else {
						System.out.println("Ese hueco esta ocupado");
						i--;
					}
				} else {
					System.out.print("Jugador 2: Donde quieres ponerla? ");
					int p = sc.nextInt();
					if (game[p] == " ") {
						game[p] = "O";
						System.out.println("|" + game[0] + "|" + "|" + game[1] + "|" + "|" + game[2] + "|\n" + "|"
								+ game[3] + "|" + "|" + game[4] + "|" + "|" + game[5] + "|\n" + "|" + game[6] + "|"
								+ "|" + game[7] + "|" + "|" + game[8] + "|");
					} else {
						System.out.println("Esa casilla ya esta ocupada");
						i--;
					}
				}			
			}
		}
	}
	
	public static boolean winPlayer1(String[] game){
		if (game[0] == "X" && game[1] == "X" && game[2] == "X") {
			return true;
		} else if (game[3] == "X" && game[4] == "X" && game[5] == "X"){
			return true;
		} else if (game[6] == "X" && game[7] == "X" && game[8] == "X"){
			return true;
		} else if (game[0] == "X" && game[3] == "X" && game[6] == "X"){
			return true;
		} else if (game[1] == "X" && game[4] == "X" && game[7] == "X"){
			return true;
		} else if (game[2] == "X" && game[5] == "X" && game[8] == "X"){
			return true;
		} else if (game[0] == "X" && game[4] == "X" && game[8] == "X"){
			return true;
		} else if (game[3] == "X" && game[4] == "X" && game[6] == "X"){
			return true;
		}else {
			return false;
		}
	}
	public static boolean winPlayer2(String[] game) {
		if (game[0] == "O" && game[1] == "O" && game[2] == "O") {
			return true;
		} else if (game[3] == "O" && game[4] == "O" && game[5] == "O"){
			return true;
		} else if (game[6] == "O" && game[7] == "O" && game[8] == "O"){
			return true;
		} else if (game[0] == "O" && game[3] == "O" && game[6] == "O"){
			return true;
		} else if (game[1] == "O" && game[4] == "O" && game[7] == "O"){
			return true;
		} else if (game[2] == "O" && game[5] == "O" && game[8] == "O"){
			return true;
		} else if (game[0] == "O" && game[4] == "O" && game[8] == "O"){
			return true;
		} else if (game[3] == "O" && game[4] == "O" && game[6] == "O"){
			return true;
		}else {
			return false;
		}
	}
	
}
