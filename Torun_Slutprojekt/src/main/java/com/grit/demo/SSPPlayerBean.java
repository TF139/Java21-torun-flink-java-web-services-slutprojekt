package com.grit.demo;

public class SSPPlayerBean {

	private String Move;
	private int Wins;
	private int Losses;
	private int Tie;

	public SSPPlayerBean() {
	}

	public String getMove() {
		return Move;
	}

	public void setMove(String selectedMove) {
		this.Move = selectedMove;
	}

	public void addWins() {
		this.Wins += 1;
	}

	public int getWins() {
		return Wins;
	}

	public void addLosses() {
		this.Losses += 1;
	}

	public int getLosses() {
		return this.Losses;
	}

	public void addTies() {
		this.Tie += 1;
	}

	public int getTies() {
		return this.Tie;
	}
}