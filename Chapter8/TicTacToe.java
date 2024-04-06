//import API's needed here:

public class TicTacToe 
{  
        public static void main(String args[ ]) 
        {
                
		
		
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