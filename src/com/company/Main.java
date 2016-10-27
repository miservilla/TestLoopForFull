package com.company;

import java.awt.*;

public class Main {

    /** Number of columns on the board. */
    public static final int COLUMNS = 7;

    /** Number of rows on the board. */
    public static final int ROWS = 6;

    /** Color for computer player's pieces */
    public static final Color COMPUTER = Color.BLACK;

    /** Color for human player's pieces */
    public static final Color HUMAN = Color.RED;

    /** Color for blank spaces. */
    public static final Color NONE = Color.WHITE;


    public static boolean loop(int[] arr){
        for (int col = 0; col < arr.length; col++){
            if (arr[col] == 0){
                return false;
            }
        }
        return true;
    }

    public static Color findLocalVerticalWinner(Color[][] board, int r, int c){
        int counter = 0;
        if (r - 3 >= 0){
            for (int i = r; i > r-3; i--){
                if (board[i][c] == board[r][c]){
                    counter++;
                    if (counter == 4){
                        return board[r][c];
                    }
                }
            }
        }
        return NONE;

    }
    public static void main(String[] args) {
        int[] test = {1,1,1,1,1,1};
        System.out.println(loop(test));

        // create array for game board
        Color[][] board = new Color[ROWS][COLUMNS];
        // fill board with empty spaces
        for(int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                board[row][col] = NONE;
            }
        }
        board[3][3] = HUMAN;
        System.out.println(findLocalVerticalWinner(board, 5, 3));

    }
}
