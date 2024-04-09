//import API's needed here:

public class TicTacToe 
{  
        public static void main(String args[ ]) 
        {
                char[][] board = new char[3][3];
                char p1 = 'X';
                char p2 = 'O';
                boolean turn = true;
                boolean[] winner = {false, false};
                int count = 0;
		
		
         } //closing main method
                public static char[][] clearBoard(char[][] board){
                        for (int i = 0; i < board.length; i++){
                                for (int j = 0; j < board[i].length; j++){
                                        board[i][j] = ' ';
                                }
                        }
                        return board;
                }

                public static void displayBoard(char[][] board){
                        for (int i = 0; i < board.length; i++){
                                for (int j = 0; j < board[i].length; j++){
                                        System.out.print(board[i][j] + " ");
                                }
                                // System.out.println();
                        }
                }
} //closing class header