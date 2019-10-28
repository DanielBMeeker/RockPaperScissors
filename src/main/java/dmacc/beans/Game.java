package dmacc.beans;

import java.util.Random;

public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	public Game() {
		super();
	}
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer(); 
		this.determineWinner();
	}
	
	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getComputerPlayer() {
		return computerPlayer;
	}
	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	@Override
	public String toString() {
		return "Game [player1=" + player1 + ", computerPlayer=" + computerPlayer + ", winner=" + winner + "]";
	}
	private void determineWinner() {
		String winner = "Computer";
		if (player1.equalsIgnoreCase(computerPlayer)) {
			winner = "Tie";
		} else if (player1.equals("rock")) {
			if (computerPlayer.equals("scissors") || (computerPlayer.equals("lizard"))) {
				winner = "Player";
			} 
		} else if (player1.equals("paper")) {
			if (computerPlayer.equals("rock") || (computerPlayer.equals("spock"))) {
				winner = "Player";
			}
		} else if (player1.equals("scissors")) {
			if (computerPlayer.equals("paper") || (computerPlayer.equals("lizard"))) {
				winner = "Player";
			} 
		} else if (player1.equals("lizard")) {
			if (computerPlayer.equals("paper") || (computerPlayer.equals("spock"))) {
				winner = "Player";
			} 
		} else if (player1.equals("spock")) {
			if (computerPlayer.equals("scissors") || (computerPlayer.equals("rock"))) {
				winner = "Player";
			} 
		}
		this.setWinner(winner);
		
		
	}
	private void setComputerPlayer() {
		Random rand = new Random();
		int answer = rand.nextInt(5) + 1; //rand.nextInt(3) generates a random number between 0 and 2 so we have to add 1 to it
		String computer;
		if(answer == 1) {
			computer = "rock";
		} else if (answer == 2) {
			computer = "paper";
		} else if (answer == 3) {
			computer = "scissors";
		} else if (answer == 4) {
			computer = "lizard";
		} else  {
			computer = "spock";
		}
		this.setComputerPlayer(computer);
		
	}
}
