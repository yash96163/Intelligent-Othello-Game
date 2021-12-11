//using greedy approach for evaluation

public class Utility {
	int black;
	int white;
	
	
	int utility(int gameBoard[][])
	{
		countScore(gameBoard);
		return white - black;
	}
	int getUtility(int i , int j , int gameBoard[][]  , int turn)
	{
		//first check for the no move condition with and without corner and wall condition
		countScore(gameBoard);
		Suggestion s1 = new Suggestion();
		
		//int score;
		//if(turn == 1)//black turn
		//	score = obj.black - prev_score_black;
		//else
			//score = obj.white - prev_score_white;
			
		if(s1.countSuggestion(gameBoard) == 1)//no move condition
		{
			if(checkCorner(i,j) == true)// check for corner case
			{
				return 12 + (white - black);
			}
			if(checkWall(i,j) == true)//check for wall condition
			{
				return 11+ (white - black);
			}
			return 10 + (white - black);//maximum profit is for no move condition
		}
		
		// corner cases condition
		
		if(checkCorner(i,j) == true)
		{
			return 9+(white - black);
		}
		
		//wall position with maximum profit
		//simple wall position
		
		if(checkWall(i,j) == true)
		{
			return 8+(white - black);
		}
		
		// position with maximum profit
		return (white - black);		//you have to maintain a frontier for minimax algo 
	}
	
	boolean checkCorner(int i , int j)
	{
		if(i == 0 && j == 0)
			return true;
		else if(i == 0 && j == 7)
			return true;
		else if(i == 7 && j == 0)
			return true;
		else if(i == 7 && j == 7)
			return true;
		return false;
	}
	
	boolean checkWall(int i , int j)
	{
		if(i == 0 || i == 7 || j == 0 || j == 7)
			return true;
		return false;
	}
	
	
	void countScore(int gameBoard[][])
	{
		for(int i = 0 ; i < 8 ;i++)
		{
			for(int j =0 ; j <8 ; j++)
			{
				if(gameBoard[i][j] == 1)
					black++;
				if(gameBoard[i][j] == 0)
					white++;
			}
		}
		//System.out.println("SCORES: \n" + "white = "+ white + "      black = "+ black);
		//if(black == 0 || white == 0)
			//return 1;
		//return 0;
	
	}
}

