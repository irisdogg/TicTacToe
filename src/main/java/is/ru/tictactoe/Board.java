package is.ru.tictactoe;

public class Board {
	 private char[][] board;
	 private final int SIZE = 3;
	 
	 public Board() {
		 board = new char[SIZE][SIZE];
		 int i = 1;
		 for( int row = 0; row < SIZE; row++){
			 for( int col = 0; col < SIZE; col++){
				 board[row][col] = ' ';
			 }
		 }
	 }
	 public boolean isWinner(int row, int col){
		 boolean winner = false;
		 char player = board[row][col];
		 int count = 0;
		 
		 //athugum larett
		 for(int i = 0; i < SIZE; i++){
			 if(board[i][col] == player)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum lodrett
		 for(int j = 0; j < SIZE; j++){
			 if(board[row][j] == player)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum a ska fra vinstri
		 for(int i = 0; i < SIZE; i++){
			 if(board[i][i] == player)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum a ska fra haegri
		 for(int j = 0; j < SIZE; j++){
			 if(board[j][2-j] == player)
				 count++;
		 }
		 winner = win(count);
		 
		 return winner;
		 
	 }
	 private boolean win(int count){
		 boolean win = false;
		 if(count == SIZE) {
			 win = true;
		 }
		 count = 0;
		 return win;
	 }

	 public boolean full(){
	 	for(int i = 0; i < SIZE; i++){
	 		for(int j = 0; j < SIZE; j++){
	 			if(board[i][j] == ' '){
	 				return false;
	 			}
	 		}
	 	}
	 	return true;
	 }

	 public void displayBoard(){
	 	int k = 0;
	 	for(int i = 0; i < SIZE; i++){
	 		for(int j = 0; j < SIZE; j++){
	 			if(board[i][j] == ' '){
	 				System.out.print(k);
	 			}
	 			else{
	 				System.out.print(board[i][j]);
	 			}
	 			k++;
	 		}
	 		System.out.println();
	 	}
	 }

}