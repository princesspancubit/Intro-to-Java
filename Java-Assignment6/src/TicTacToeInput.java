import java.util.Scanner;


/**
 * This class handles the input information received from the user and updates the game
 * @author princesspancubit
 *
 */
public class TicTacToeInput
{
	private static boolean player_turn = false;
	private static boolean comp_turn = false;
	static TicTacToeState game;
	
	/** 
	 * This initializes the new game.
	 */
	TicTacToeInput()
	{
		TicTacToeInput.game = new TicTacToeState();
	}
	
	
	/**
	 * This method runs the game in the order chosen
	 */
	public void run()
	{
		intro();
		firstPlayer();
		while(!game.over())
		{
			if(player_turn)
			{
				humanPlayerTurn();
			}
			else if(comp_turn)
			{
				compTurn();
			}
			game.getBoard().display();
		}
		gameOver();
	}
	
	
	/**
	 * This method prints out the instructions for the beginning of the game.
	 */
	public static void intro()
	{
		System.out.println("You have decided to play Tic Tac Toe. To play, you");
		System.out.println("must try to beat the coomputer. When asked where you would ");
		System.out.println("like to play your piece, please input it in the form '1 2'.");
		System.out.println("Your input will be based on a 9x9 board and therefore, the ");
		System.out.println("valid moves are (0 0, 0 1, 0 2, 1 0, 1 1, 1 2, 2 0, 2 1, 2 2)");
		System.out.println(" ");
	}
	
	/**
	 * This method checks which player has won and prints out the statements
	 */
	public static void gameOver()
	{
		if(game.hasWin('X'))
		{
			System.out.println("You won!");
		}
		else if(game.hasWin('O'))
		{
			System.out.println("Computer won!");
		}
		else
		{
			System.out.println("There is a TIE.");
		}
	}
	
	/**
	 * This method determines whether the player goes first or the computer
	 */
	public void firstPlayer()
	{
		int first;
		Scanner in = new Scanner(System.in);
		do 
		{
			System.out.print("Would you like to go first or the computer (Input: 1 for you or 2 for Computer): ");
			first = in.nextInt();
			if(first == 1 || first == 2)
			{
				break;
			}
		}
		while(true);
		if(first == 1)
		{
			player_turn = true;
			System.out.println("You will go first.");
		}
		else if(first == 2)
		{
			comp_turn = true;
			System.out.println("The Computer will go first.");
		}
		game.setCurrentPlayer();
		
	}
	
	
	/**
	 * This method takes in the input of the human player's next turn.
	 */
	public void humanPlayerTurn()
	{
		int row, col;
		String inp;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("Please enter where you would like to place your piece <row col>: ");
			inp = in.nextLine();
			row = Character.getNumericValue(inp.charAt(0));
			col = Character.getNumericValue(inp.charAt(2));
		}
		while(row < 0 && row >= 3 && col < 0 && col >= 3);
		
		if(game.getBoard().validPos(row, col) && game.getBoard().playerPosition(row, col) == ' ')
		{
			game.getBoard().marked(row, col, game.getCurrentPlayer());
			game.switchPlayer();
			switchTurn();
		}
		
	}
	
	/**
	 * This method moves the computer
	 */
	public void compTurn()
	{
		System.out.println("Computer's Move");
		TicTacToeComp.moveComp(game);
		game.switchPlayer();
		switchTurn();
	}
	
	/**
	 * This method switches the turn for the user, so if it is the users turn then it will switch to the computer's turn.
	 */
	public static void switchTurn()
	{
		if(player_turn == true)
		{
			player_turn = false;
			comp_turn = true;
		}
		else
		{
			comp_turn = false;
			player_turn = true;
		}
	}
	
	/**
	 * This method returns if it is the human player's turn
	 * @return a boolean if it is the human player's turn
	 */
	public static boolean getPlayerTurn()
	{
		return player_turn;
	}
	
}
