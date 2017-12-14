

/**
 * This class determines the different moves the computer can make in order to win each game.
 * @author princesspancubit
 *
 */
public class TicTacToeComp 
{

	/**
	 * This method checks the different positions in different order to make sure the computer makes the smartest move
	 * @param board is the current tic tac toe board being played on.
	 */
	public static void moveComp(TicTacToeState board)
	{
		//this checks if there are any open places where the computer can win
		if(board.playerPosition(0, 0) == ' ' && ((board.playerPosition(0, 1) == 'O' && board.playerPosition(0, 2) == 'O') || 
				(board.playerPosition(1, 0) == 'O' && board.playerPosition(2, 0) == 'O') || 
				(board.playerPosition(1, 1) == 'O' && board.playerPosition(2, 2) == 'O')))
		{
			board.getBoard().marked(0, 0, 'O');
		}
		else if(board.playerPosition(0, 1) == ' ' && ((board.playerPosition(0, 0) == 'O' && board.playerPosition(0, 2) == 'O') || 
				(board.playerPosition(1, 1) == 'O' && board.playerPosition(2, 1) == 'O')))
		{
			board.getBoard().marked(0, 1, 'O');
		}
		else if(board.playerPosition(0, 2) == ' ' && ((board.playerPosition(0, 0) == 'O' && board.playerPosition(0, 1) == 'O') || 
				(board.playerPosition(1, 2) == 'O' && board.playerPosition(2, 2) == 'O') || 
				(board.playerPosition(1, 1) == 'O' && board.playerPosition(2, 0) == 'O')))
		{
			board.getBoard().marked(0, 2, 'O');
		}
		else if(board.playerPosition(1, 0) == ' ' && ((board.playerPosition(0, 0) == 'O' && board.playerPosition(2, 0) == 'O') || 
				(board.playerPosition(1, 1) == 'O' && board.playerPosition(1, 2) == 'O')))
		{
			board.getBoard().marked(1, 0, 'O');
		}
		else if(board.playerPosition(1, 1) == ' ' && ((board.playerPosition(0, 0) == 'O' && board.playerPosition(2, 2) == 'O') || 
				(board.playerPosition(0, 1) == 'O' && board.playerPosition(2, 1) == 'O') ||
				(board.playerPosition(1, 0) == 'O' && board.playerPosition(1, 2) == 'O') ||
				(board.playerPosition(0, 2) == 'O' && board.playerPosition(2, 0) == 'O')))
		{
			board.getBoard().marked(1, 1, 'O');
		}
		else if(board.playerPosition(1, 2) == ' ' && ((board.playerPosition(0, 2) == 'O' && board.playerPosition(2, 2) == 'O') || 
				(board.playerPosition(1, 0) == 'O' && board.playerPosition(1, 1) == 'O')))
		{
			board.getBoard().marked(1, 2, 'O');
		}
		else if(board.playerPosition(2, 0) == ' ' && ((board.playerPosition(0, 0) == 'O' && board.playerPosition(1, 0) == 'O') || 
				(board.playerPosition(1, 1) == 'O' && board.playerPosition(0, 2) == 'O') || 
				(board.playerPosition(2, 1) == 'O' && board.playerPosition(2, 2) == 'O')))
		{
			board.getBoard().marked(2, 0, 'O');
		}
		else if(board.playerPosition(2, 1) == ' ' && ((board.playerPosition(2, 0) == 'O' && board.playerPosition(2, 2) == 'O') || 
				(board.playerPosition(1, 1) == 'O' && board.playerPosition(0, 1) == 'O')))
		{
			board.getBoard().marked(2, 1, 'O');
		}
		else if(board.playerPosition(2, 2) == ' ' && ((board.playerPosition(0, 0) == 'O' && board.playerPosition(1, 1) == 'O') || 
				(board.playerPosition(2, 0) == 'O' && board.playerPosition(2, 1) == 'O') || 
				(board.playerPosition(0, 2) == 'O' && board.playerPosition(1, 2) == 'O')))
		{
			board.getBoard().marked(2, 2, 'O');
		}
		
		//first move in the center
		else if(board.getBoard().playerPosition(1, 1) == ' ') 
		{
			board.getBoard().marked(1, 1, 'O');
		}
		
		
		//this checks if there are spaces where the computer needs to block the player from winning
		else if(board.playerPosition(0, 0) == ' ' && ((board.playerPosition(0, 1) == 'X' && board.playerPosition(0, 2) == 'X') || 
				(board.playerPosition(1, 0) == 'X' && board.playerPosition(2, 0) == 'X') || 
				(board.playerPosition(1, 1) == 'X' && board.playerPosition(2, 2) == 'X')))
		{
			board.getBoard().marked(0, 0, 'O');
		}
		else if(board.playerPosition(0, 1) == ' ' && ((board.playerPosition(0, 0) == 'X' && board.playerPosition(0, 2) == 'X') || 
				(board.playerPosition(1, 1) == 'X' && board.playerPosition(2, 1) == 'X')))
		{
			board.getBoard().marked(0, 1, 'O');
		}
		else if(board.playerPosition(0, 2) == ' ' && ((board.playerPosition(0, 0) == 'X' && board.playerPosition(0, 1) == 'X') || 
				(board.playerPosition(1, 2) == 'X' && board.playerPosition(2, 2) == 'X') || 
				(board.playerPosition(1, 1) == 'X' && board.playerPosition(2, 0) == 'X')))
		{
			board.getBoard().marked(0, 2, 'O');
		}
		else if(board.playerPosition(1, 0) == ' ' && ((board.playerPosition(0, 0) == 'X' && board.playerPosition(2, 0) == 'X') || 
				(board.playerPosition(1, 1) == 'X' && board.playerPosition(1, 2) == 'X')))
		{
			board.getBoard().marked(1, 0, 'O');
		}
		else if(board.playerPosition(1, 1) == ' ' && ((board.playerPosition(0, 0) == 'X' && board.playerPosition(2, 2) == 'X') || 
				(board.playerPosition(0, 1) == 'X' && board.playerPosition(2, 1) == 'X') ||
				(board.playerPosition(1, 0) == 'X' && board.playerPosition(1, 2) == 'X') ||
				(board.playerPosition(0, 2) == 'X' && board.playerPosition(2, 0) == 'X')))
		{
			board.getBoard().marked(1, 1, 'O');
		}
		else if(board.playerPosition(1, 2) == ' ' && ((board.playerPosition(0, 2) == 'X' && board.playerPosition(2, 2) == 'X') || 
				(board.playerPosition(1, 0) == 'X' && board.playerPosition(1, 1) == 'X')))
		{
			board.getBoard().marked(1, 2, 'O');
		}
		else if(board.playerPosition(2, 0) == ' ' && ((board.playerPosition(0, 0) == 'X' && board.playerPosition(1, 0) == 'X') || 
				(board.playerPosition(1, 1) == 'X' && board.playerPosition(0, 2) == 'X') || 
				(board.playerPosition(2, 1) == 'X' && board.playerPosition(2, 2) == 'X')))
		{
			board.getBoard().marked(2, 0, 'O');
		}
		else if(board.playerPosition(2, 1) == ' ' && ((board.playerPosition(2, 0) == 'X' && board.playerPosition(2, 2) == 'X') || 
				(board.playerPosition(1, 1) == 'X' && board.playerPosition(0, 1) == 'X')))
		{
			board.getBoard().marked(2, 1, 'O');
		}
		else if(board.playerPosition(2, 2) == ' ' && ((board.playerPosition(0, 0) == 'X' && board.playerPosition(1, 1) == 'X') || 
				(board.playerPosition(2, 0) == 'X' && board.playerPosition(2, 1) == 'X') || 
				(board.playerPosition(0, 2) == 'X' && board.playerPosition(1, 2) == 'X')))
		{
			board.getBoard().marked(2, 2, 'O');
		}
		
		
		//this places the computer piece in the opposite corner if the human is in the corner
		else if(board.playerPosition(0, 0) == ' ' && ((board.playerPosition(0, 2) == 'X' || board.playerPosition(2, 0) == 'X')))
		{
			board.getBoard().marked(0, 0, 'O');
		}
		else if(board.playerPosition(0, 2) == ' ' && ((board.playerPosition(0, 0) == 'X' || board.playerPosition(2, 2) == 'X')))
		{
			board.getBoard().marked(0, 2, 'O');
		}
		else if(board.playerPosition(2, 0) == ' ' && ((board.playerPosition(0, 0) == 'X' || board.playerPosition(2, 2) == 'X')))
		{
			board.getBoard().marked(2, 0, 'O');
		}
		else if(board.playerPosition(2, 2) == ' ' && ((board.playerPosition(0, 2) == 'X' || board.playerPosition(2, 0) == 'X')))
		{
			board.getBoard().marked(2, 2, 'O');
		}
	
		
		//places in corners
		else if(board.playerPosition(0, 0) == ' ')
		{
			board.getBoard().marked(0, 0, 'O');
		}
		else if(board.playerPosition(0, 2) == ' ')
		{
			board.getBoard().marked(0, 2, 'O');
		}
		else if(board.playerPosition(2, 0) == ' ')
		{
			board.getBoard().marked(2, 0, 'O');
		}
		else if(board.playerPosition(2, 2) == ' ')
		{
			board.getBoard().marked(2, 2, 'O');
		}
		
		
		//places their piece on an edge
		else if(board.playerPosition(0, 1) == ' ')
		{
			board.getBoard().marked(0, 1, 'O');
		}
		else if(board.playerPosition(1, 0) == ' ')
		{
			board.getBoard().marked(1, 0, 'O');
		}
		else if(board.playerPosition(2, 1) == ' ')
		{
			board.getBoard().marked(2, 1, 'O');
		}
		else if(board.playerPosition(1, 2) == ' ')
		{
			board.getBoard().marked(1, 2, 'O');
		}	
	}
	
}
