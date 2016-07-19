package TheGame.TheGame;

import java.util.Scanner;

public class GameController {

	public static Scheme getComputerChoice(double computerValue) {
		Scheme computerChoice = null;
		if (computerValue < 0.34) {
			computerChoice = Scheme.parseType("ROCK");
		} else if (computerValue <= 0.67) {
			computerChoice = Scheme.parseType("PAPER");
		} else {
			computerChoice = Scheme.parseType("SCISSOR");
		}
		return computerChoice;
	}

	public static Scheme getComputerChoice(Scanner scan) {
		Scheme userChoice = null;
		while (userChoice == null) {
			userChoice = Scheme.parseType(scan.next());
			if (userChoice == null) {
				System.out.println("Not correct choice, try again.");
			}
		}
		return userChoice;
	}

	public static String compareBeat(Scheme userChoice, Scheme computerChoice) {
		if (userChoice.equals(computerChoice)) {
			return "The battle is a tie!";
		} else if (userChoice.equals(Scheme.parseType("ROCK"))) {
			if (computerChoice.equals(Scheme.parseType("SCISSOR"))) {
				return "Rock wins - user wins";
			} else {
				return "Paper wins - computer wins";
			}
		} else if (userChoice.equals(Scheme.parseType("PAPER"))) {
			if (computerChoice.equals(Scheme.parseType("ROCK"))) {
				return "Paper wins - user wins";
			} else {
				return "Scissors wins - computer wins";
			}
		} else if (userChoice.equals(Scheme.parseType("SCISSOR"))) {
			if (computerChoice.equals(Scheme.parseType("ROCK"))) {
				return "Rock wins - computer wins";
			} else {
				return "Scissors wins - user wins";
			}
		} else {
			return "Scissors wins - computer wins";
		}
	}
}
