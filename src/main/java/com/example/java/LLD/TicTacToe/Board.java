package com.example.java.LLD.TicTacToe;

public class Board {
	
	public int size;
	public char[][] grid;
    private static final char EMPTY = '-';
    
    public Board(int size) {
		this.size = size;
		this.grid = new char[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				grid[i][j] = EMPTY;
			}
		}
	}
    
    public void printBoard() {
    	for(int i=0;i<size;i++) {
    		for(int j=0;j<size;j++) {
    			System.out.print(" " + grid[i][j]);
    			if(j <size-1) {
    				System.out.print(" |");
    			}
    		}
    		if(i<size-1) {
    			System.out.println("---+---+---");
			}
    	}
    }
    
    public boolean isValidMove(int row,int col) {
    	if(row<0 ||row>=size ||col <0 || col>=size) {
    		return false;
    	}
    	return grid[row][col] == EMPTY;
    }
    
    public void makeMove(int row,int col,char symbol) {
    	grid[row][col] = symbol;
    }
    
    public boolean checkWin(char symbol) {
    	//for rows and coloumns
    	for(int i=0;i<size;i++) {
    		boolean rowWin = true;
    		boolean colWin = true;
    		for(int j=0;j<size;j++) {
    			if(grid[i][j] != symbol) {
					rowWin = false;
				}
				if(grid[j][i] != symbol) {
					colWin = false;
				}
    		}
    		if(rowWin || colWin) {
				return true;
			}
    	}
    	
    	//for diagonals
    	boolean mainDiag = true;
    	for(int i=0;i<size;i++) {
    		if(grid[i][i] != symbol) {
    			mainDiag = false;
    		}
    	}
    	
    	boolean antiDiag = true;
    	for(int i=0;i<size;i++) {
    		if(grid[i][size-1-i] != symbol) {
				antiDiag = false;
			}
    	}
    	
    	return mainDiag || antiDiag;
    }
    public boolean isFull() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (grid[i][j] == EMPTY) return false;
        return true;
    }
    
    
    
	

}
