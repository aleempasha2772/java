package com.example.java.LLD.TicTacToe;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;
    private Scanner scanner;

    public Game() {
        board = new Board(3); // standard 3x3
        players = new Player[]{
            new Player("Player 1", 'X'),
            new Player("Player 2", 'O')
        };
        currentPlayerIndex = 0;
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== Tic Tac Toe ===\n");

        while (true) {
            board.printBoard();
            playTurn();

            Player current = players[currentPlayerIndex];

            if (board.checkWin(current.getSymbol())) {
                board.printBoard();
                System.out.println("\n" + current.getName() + " wins! 🎉");
                break;
            }

            if (board.isFull()) {
                board.printBoard();
                System.out.println("\nIt's a draw!");
                break;
            }

            switchPlayer();
        }

        scanner.close();
    }

    private void playTurn() {
        Player current = players[currentPlayerIndex];
        System.out.println("\n" + current.getName() + " (" + current.getSymbol() + "), enter row and column (0-2): ");

        int row, col;
        while (true) {
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (board.isValidMove(row, col)) break;
            System.out.println("Invalid move. Try again:");
        }

        board.makeMove(row, col, current.getSymbol());
    }

    private void switchPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    }
}