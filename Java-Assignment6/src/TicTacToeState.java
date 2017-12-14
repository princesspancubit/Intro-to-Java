

/**
 * This class represents the state of the tic tac toe game status.
 * @author princesspancubit
 *
 */
public class TicTacToeState 
{
	private static final char PLAYER = 'X';
	private static final char COMP = 'O';
	private static TicTacToeGameBoard board;
	private static char current_player;
	
	/**
	 * Creates the board and determines which is the current player
	 */
	public TicTacToeState()
	{
		TicTacToeGameBoard board = new TicTacToeGameBoard();
		TicTacToeState.board = board;
	}
	
	/**
	 * This method gets the current player
	 * @return the current player which is a char
	 */
	public char getCurrentPlayer()
	{
		return current_player;
	}
	
	/**
	 * This method sets the current player
	 */
	public void setCurrentPlayer()
	{
		if(TicTacToeInput.getPlayerTurn() == true)
		{
			current_player = PLAYER;
		}
		else if(TicTacToeInput.getPlayerTurn() == false)
		{
			current_player = COMP;
		}
	}
	
	/**
	 * This method switches players
	 */
	public void switchPlayer()
	{
		if(current_player == PLAYER)
		{
			current_player = COMP;
		}
		else
		{
			current_player = PLAYER;
		}
	}
	
	/**
	 * Gets the current board
	 * @return the 2d board
	 */
	public TicTacToeGameBoard getBoard()
	{
		return board;
	}
	
	/**
	 * This method returns the user that is in the specified region.
	 * @param row is the row in which we want to know what user is in
	 * @param col is the column in which we want to know what user is in
	 * @return a char which is the user that is in the occupied space
	 */
	public char playerPosition(int row, int col)
	{
		return getBoard().playerPosition(row, col);
	}
	
	/**
	 * This checks if there is a winner game
	 * @param player is the current player being checked
	 */
	public boolean hasWin(char player) 
	{
		for(int i = 0; i < 3; i++)
		{
			if(fullRow(player, i) || fullCol(player, i))
			{
				return true;
			}
		}
		return(fullDiagonal(player));
	}
	
	/**
	 * Checks if there is a win for either character or if the board is full and there is a tie
	 * @return a boolean of whether or not the game is over
	 */
	public boolean over()
	{
		return hasWin(PLAYER) || hasWin(COMP) || board.fullBoard();
 	}
	
	

	
	
	/**
	 * This method checks if the board has one char for a whole row
	 */
	private static boolean fullRow(char player, int row)
	{
		char row0 = board.playerPosition(row, 0);
		char row1 = board.playerPosition(row, 1);
		char row2 = board.playerPosition(row, 2);
		return(player == row0 && player == row1 && player == row2);
	}
	
	
	/**
	 * This method checks if a char has a diagonal
	 * 
	 */
	private static boolean fullDiagonal(char player)
	{
		if(player != board.playerPosition(1, 1))
		{
			return false;
		}
		return(player == board.playerPosition(0, 0) && player == board.playerPosition(2, 2)
				|| player == board.playerPosition(0, 2) && player == board.playerPosition(2, 0));
	}
	
	/**
	 * This method checks if the board has full columns.
	 * 
	 */
	 private static boolean fullCol(char player, int col)
	{
		char col0 = board.playerPosition(0, col);
		char col1 = board.playerPosition(1, col);
		char col2 = board.playerPosition(2, col);
		return(player == col0 && player == col1 && player == col2);
	}
	
}
