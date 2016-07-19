package TheGame.TheGame;

import java.util.Random;
import java.util.Scanner;

/**
 * The Game.
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("The Game, Paper wraps rock, rock crushes scissors, scissors cut rock.");
		System.out.println("Please choose: ROCK, PAPER, SCISSOR");
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		Scheme userChoice = GameController.getComputerChoice(scan);

		double computerValue = generator.nextDouble();
		Scheme computerChoice = GameController.getComputerChoice(computerValue);

		String resultBattle = GameController.compareBeat(userChoice, computerChoice);
		System.out.println(resultBattle);
	}
}
