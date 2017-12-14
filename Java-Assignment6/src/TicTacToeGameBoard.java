/**
 * This class represents the game board for tic tac toe.
 * @author princesspancubit
 *
 */
public class TicTacToeGameBoard 
{
	
	private static final int ROWS = 3;
	private static final int COLS = 3;
	private static final char EMPTY = ' ';
	public static char[][] board = new char[3][3];
	
	/**
	 * This initializes the board to have all empty spaces
	 */
	TicTacToeGameBoard()
	{
		for(int x = 0; x < ROWS; x++)
		{
			for(int y = 0; y < COLS; y++)
			{
				board[x][y] = EMPTY;
			}
		}
	}
	
	
	/**
	 * This method prints out the board
	 * @param board is a 2d array of char's that represent a board for tic tac toe
	 */
	public void display()
	{
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(i % 2 == 0)
				{
					if(j % 2 == 0)
					{
						System.out.print(board[i/2][j/2]);
					}
					else
					{
						System.out.print('|');
					}
				}
				else
				{
					if(j % 2 == 0)
					{
						System.out.print('-');
					}
					else
					{
						System.out.print('+');
					}
				}
			}
			System.out.println("");
		}
		System.out.println();
	}
	
	/**
	 * This method places the player's piece on the board
	 * @param row is the row they would like their piece in
	 * @param col is the col they would like their piece in
	 * @param player is the player
	 * @return whether the mark was made on the board
	 */
	public boolean marked(int row, int col, char player)
	{
		validPos(row, col);
		if(board[row][col] != EMPTY)
		{
			return false;
		}
		else
		{
			board[row][col] = player;
		}
		return true;
	}
	
	
	/**
	 * This method checks the board to see if there are any open positions
	 * @param board is a 2d array that is the board
	 * @return a boolean if there are open spaces and false else wise.
	 */
	public static boolean openPositions(char[][] board)
	{
 		for(int x = 0; x < ROWS; x++)
		{
			for(int y = 0; y < COLS; y++)
			{
				if(board[x][y] == EMPTY)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * This method checks if there are anymore open spaces inside the board.
	 * @return true if the board is full and false if not
	 */
	public boolean fullBoard()
	{
		if(openPositions(board))
		{
			return false;
		}
		return true;
	}
	
	/**
	 * This checks which player is in a certain position
	 * @param row is the index of the specified row
	 * @param col is the index of the specified col
	 * @return the player who is in that specified spot
	 */
	public char playerPosition(int row, int col)
	{
		return board[row][col];
	}
	
	/**
	 * This method checks if there position is within the bounds of the rows and cols
	 * @param row is an int that is the row number
	 * @param col is an int that is the col number
	 * @return
	 */
	public boolean validPos(int row, int col)
	{
		if(row < 0 || row >= ROWS || col < 0 || col >= COLS)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
