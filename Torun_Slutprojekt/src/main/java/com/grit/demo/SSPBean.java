package com.grit.demo;

import java.util.Random;

public class SSPBean {

	private SSPPlayerBean player = new SSPPlayerBean();
	private SSPPlayerBean Computer = new SSPPlayerBean();
	private int GamesPlayed;

	public SSPBean() {
	}

	public int getPlayerTotalWins() {
		return player.getWins();
	}

	public int getComputerTotalWins() {
		return Computer.getWins();
	}

	public int getPlayerTotalLosses() {
		return player.getLosses();
	}

	public int getComputerTotalLosses() {
		return Computer.getLosses();
	}

	public int getPlayerTotalTies() {
		return player.getTies();
	}

	public int getComputerTotalTies() {
		return Computer.getTies();
	}

	public int getGamesPlayed() {
		return this.GamesPlayed;
	}

	public void setPlayerMove(String player1Move) {
		this.player.setMove(player1Move);
	}

	public String getPlayerMove() {
		return player.getMove();
	}
	
	public String getComputerMove() {
		return Computer.getMove();
	}

	public String getRandomRPSString() {
		String computerChoice;
		String[] computerOptions = new String[] { "rock", "paper", "scissors" }; 
		int randomNumber = new Random().nextInt(3); 
		computerChoice = computerOptions[randomNumber];

		return computerChoice;
	}

	public String compareInputs() {
		this.Computer.setMove(getRandomRPSString());
		String Computer = getComputerMove();
		String player = getPlayerMove();
		String winner = "";

		switch (player) {
		case "rock": 

			switch (Computer) {
			case "rock":
				this.player.addTies();
				this.Computer.addTies();
				this.GamesPlayed += 1;
				winner = "tie";
				break;
			case "scissors":
				this.player.addWins();
				this.Computer.addLosses();
				this.GamesPlayed += 1;
				winner = "Player";
				break;
			case "paper":
				this.Computer.addWins();
				this.player.addLosses();
				this.GamesPlayed += 1;
				winner = "Computer";
				break;
			}

			break;

		case "scissors": 

			switch (Computer) {
			case "rock":
				this.Computer.addWins();
				this.player.addLosses();
				this.GamesPlayed += 1;
				winner = "Computer";
				break;
			case "scissors":
				this.player.addTies();
				this.Computer.addTies();
				this.GamesPlayed += 1;
				winner = "tie";
				break;
			case "paper":
				this.player.addWins();
				this.Computer.addLosses();
				this.GamesPlayed += 1;
				winner = "Player";
				break;
			}
			break;

		case "paper":
			switch (Computer) {
			case "rock":
				this.player.addWins();
				this.Computer.addLosses();
				this.GamesPlayed += 1;
				winner = "Player";
				break;
			case "scissors":
				this.Computer.addWins();
				this.player.addLosses();
				this.GamesPlayed += 1;
				winner = "Computer";
				break;
			case "paper":
				this.player.addTies();
				this.Computer.addTies();
				this.GamesPlayed += 1;
				winner = "tie";
				break;
			}
			break;

		}

		return winner;
	}

}