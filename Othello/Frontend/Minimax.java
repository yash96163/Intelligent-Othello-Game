
public class Minimax {
	Front fobj = new Front();
	Suggestion sobj = new Suggestion();
	
	int [][] copyArray(int [][] gameBoard)
	{
		int arr[][] = new int[8][8];
		for(int i = 0 ; i < 8 ; i++)
		{
			for(int j = 0 ; j < 8 ; j++)
			{
				arr[i][j] = gameBoard[i][j];
			}
		}
		return arr;
	}
	
	
	int minimax(int gameBoard[][] , int depth , boolean isMax , int h , int alpha , int beta, AIOthello ai)
	{
		if(depth == h || fobj.checkEnd1(gameBoard) == 1 || fobj.countScore1(gameBoard) == 1 || sobj.countSuggestion(gameBoard) == 1)//chek if depth match or its terminal state or gamme ends
		{
			Utility u = new Utility();
			return u.utility(gameBoard);
		}
		
		if(isMax)
		{
			int max = Integer.MIN_VALUE;
			int posi = -1 , posj = -1;
			Front f1 = new Front();
			Suggestion s1 = new Suggestion();
			f1.clearSuggestion(gameBoard);
			s1.getSuggestion(gameBoard, 0);
			for(int i = 0 ; i < 8 ; i++)
			{
				int flag = 0;
				for(int j = 0 ; j < 8 ; j++)
				{
					if(gameBoard[i][j] == 2)
					{
						int arr[][] = new int[8][8];
						arr = copyArray(gameBoard);
						f1.insertPosition(i, j,0, arr,ai);
						int value = minimax(arr , depth+1 , false , h , alpha , beta, ai);
						if(value > max)
						{
							max = value;
							posi = i;
							posj = j;
						}
						if(max > alpha)
						{
							alpha = max;
						}
						if(beta <= alpha)
						{
							//System.out.println("break atlevel = " + depth + " position " + posi + " , " + posj);
							flag = 1;
							break;
						}
						
					}//end of checking suggestion position
				}//end of j loop
				if(flag == 1)
					break;
			}//end of i loop
			//System.out.println("maximum value return by the minimum player is " + max + " at depth = "  + depth + "at position =" + posi + ", " + posj);
			
			if(depth == 0)
			{
					System.out.println("position are " + posi + " , " + posj + " max = " + max);
					if(posi != -1 && posj != -1)
					{
						f1.insertPosition(posi, posj, 0, gameBoard, ai);
					}
					else
					{
						int flag = 0;
						for(int i = 0 ; i < 8 ; i++)
						{
							for(int j = 0 ; j < 8 ; j++)
							{
								if(gameBoard[i][j] == 2)
								{
									f1.insertPosition(i, j, 0, gameBoard,ai);
									flag = 1;
									break;
								}
							}
							if(flag == 1)
								break;
						}
					}
								
			}
			return max;
			
		}//end of if(isMax)
		else
		{
			int min = Integer.MAX_VALUE;
			//int posi = -1 , posj = -1;
			Front f1 = new Front();
			Suggestion s1 = new Suggestion();
			f1.clearSuggestion(gameBoard);
			s1.getSuggestion(gameBoard, 1);
			for(int i = 0 ; i < 8 ; i++)
			{
				int flag = 0;
				for(int j = 0 ; j < 8 ; j++)
				{
					if(gameBoard[i][j] == 2)
					{
						int arr[][] = new int[8][8];
						arr = copyArray(gameBoard);
						f1.insertPosition(i, j,1, arr,ai);
						int value = minimax(arr , depth+1 , true , h , alpha , beta,ai);
						if(value < min)
						{
							min = value;
						//	posi = i;
						//	posj = j;
						}
						if(min < beta)
						{
							beta = min;
						}
						if(beta <= alpha)
						{
							//System.out.println("break atlevel = " + depth + " position " + posi + " , " + posj);
							flag = 1;
							break;
						}
						
					}//end of checking suggestion position
				}//end of j loop
				if(flag == 1)
					break;
			}//end of i loop
			//System.out.println("minimum value return by the maximum player is " + min + " at depth = "  + depth + "at position =" + posi + ", " + posj);
			return min;
		}// end of else part of if(isMax)
	}//end minimax function
	
	/*void tryutility(int gameBoard[][])
	{
		
		
		int max = -1;
		int posi = -1,posj = -1;
		Front f1 = new Front();
		for(int i = 0 ; i < 8 ;i++)
		{
			for(int j =0 ; j <8 ; j++)
			{
				if(gameBoard[i][j] == 2)
				{
					int arr[][] = new int[8][8];
					arr = copyArray(gameBoard);
					f1.insertPosition(i, j,0, arr);
					f1.clearSuggestion(arr);
					Suggestion s1 = new Suggestion();
					Utility u1 = new Utility();
					//if(turn == 0)
					//	turn = 1;
					//else
					//	turn = 0;
					arr = s1.getSuggestion(arr , 0);
					
					int utilityValue = u1.getUtility(i, j, arr, 0);
					
					System.out.println("Utility value for position " + i + "," + j + "=" + utilityValue);
					
					if(utilityValue > max)
					{
						max= utilityValue;
						posi = i;
						posj = j;
					}
					
				}
			}
		}
		
		System.out.println("maximum utility get by choosing position" + posi + " , " + posj + " = " + max);
		f1.insertPosition(posi, posj, 0, gameBoard);
	}*/

}
