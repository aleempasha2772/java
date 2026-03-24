package com.example.java.LLD.TicTacToe;

public class Player {
	
	public String name;
	public char symbol;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
	
	

}
