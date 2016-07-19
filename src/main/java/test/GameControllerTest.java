package test;

import java.util.Scanner;

import org.junit.Test;

import TheGame.TheGame.Scheme;
import junit.framework.Assert;
import TheGame.TheGame.GameController;

public class GameControllerTest {

	@Test
	public void shouldRockComputerChoice() {
		double computerValue = 0.33;
		Assert.assertTrue(GameController.getComputerChoice(computerValue).equals(Scheme.parseType("ROCK")));
	}

	@Test
	public void shouldPaperComputerChoice() {
		double computerValue = 0.34;
		Assert.assertTrue(GameController.getComputerChoice(computerValue).equals(Scheme.parseType("PAPER")));
	}

	@Test
	public void shouldScissorComputerChoice() {
		double computerValue = 0.68;
		Assert.assertTrue(GameController.getComputerChoice(computerValue).equals(Scheme.parseType("SCISSOR")));
	}

	@Test
	public void shouldBeRockProperUserInput() {
		String userInput = "ROCK";
		Scheme userChoice = GameController.getComputerChoice(new Scanner(userInput));
		Assert.assertTrue(userChoice.equals(Scheme.parseType("ROCK")));
	}

	@Test
	public void shouldBePaperProperUserInput() {
		String userInput = "PAPER";
		Scheme userChoice = GameController.getComputerChoice(new Scanner(userInput));
		Assert.assertTrue(userChoice.equals(Scheme.parseType("PAPER")));
	}

	@Test
	public void shouldBeScissorProperUserInput() {
		String userInput = "SCISSOR";
		Scheme userChoice = GameController.getComputerChoice(new Scanner(userInput));
		Assert.assertTrue(userChoice.equals(Scheme.parseType("SCISSOR")));
	}

	@Test
	public void shouldBeTie() {
		Scheme userChoice = Scheme.parseType("ROCK");
		Scheme computerChoice = Scheme.parseType("ROCK");
		Assert.assertTrue(GameController.compareBeat(userChoice, computerChoice).equals("The battle is a tie!"));
	}

	@Test
	public void shouldBeUserWin() {
		Scheme userChoice = Scheme.parseType("ROCK");
		Scheme computerChoice = Scheme.parseType("SCISSOR");
		Assert.assertTrue(GameController.compareBeat(userChoice, computerChoice).equals("Rock wins - user wins"));
	}

	@Test
	public void shouldBeComputerWin() {
		Scheme userChoice = Scheme.parseType("SCISSOR");
		Scheme computerChoice = Scheme.parseType("ROCK");
		Assert.assertTrue(GameController.compareBeat(userChoice, computerChoice).equals("Rock wins - computer wins"));
	}
}
