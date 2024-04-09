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
		
		clearBoard(board);
                displayBoard(board);
         } //closing main method
                public static char[][] clearBoard(char[][] board){
                        for (int i = 0; i < board.length; i++){
                                for (int j = 0; j < board[i].length; j++){
                                        board[i][j] = ' ';
                                }
                        }
                        return board;
                }

                public static void displayBoard(char[][] board) {
                        for (int i = 0; i < board.length; i++) {
                            for (int j = 0; j < board[i].length; j++) {
                                System.out.print(board[i][j]);
                                if (j < board[i].length - 1) {
                                    System.out.print("|");
                                }
                            }
                            System.out.println();
                            if (i < board.length - 1) {
                                for (int k = 0; k < board[i].length; k++) {
                                    System.out.print("-");
                                    if (k < board[i].length - 1) {
                                        System.out.print("+");
                                    }
                                }
                                System.out.println();
                            }
                        }
                    }
                
                
} //closing class header