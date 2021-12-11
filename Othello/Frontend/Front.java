import java.util.*;

public class Front {
	static int gameBoard[][];
	
	public Front() {
		gameBoard = new int[8][8];
		init();
		
	}
	
	void init() {
		for(int i = 0 ; i < 8 ; i++)
		{
			for(int j = 0 ; j < 8 ; j++)
			{
				gameBoard[i][j] = 9;
			}
		}
		gameBoard[3][3] = 0;
		gameBoard[3][4] = 1;
		gameBoard[4][3] = 1;
		gameBoard[4][4] = 0;
		
		
	}
	
	void print() {
		System.out.println("   " + "0 1 2 3 4 5 6 7 \n");
		//System.out.println("------------------------");
		for(int i = 0 ; i < 8 ; i++) {
			System.out.print(i + "  ");
			for(int j = 0; j < 8; j++) {
				if(gameBoard[i][j] == 9)
					System.out.print("  ");
				else if(gameBoard[i][j] == 2)
					System.out.print("? ");
				else
				System.out.print(gameBoard[i][j]+" ");
				
			}
			
			System.out.println("");
			//System.out.println("--------------------------");
		}
		System.out.println("\n\n");
	}
	
	void clearSuggestion(int [][]gameBoard){
		for(int i =0 ; i < 8 ; i++)
		{
			for(int j = 0; j < 8 ; j++)
			{
				if(gameBoard[i][j] == 2)
					gameBoard[i][j] = 9;
			}
		}
	}
	
	void getUserInput(AIOthello ai, int turn)
	{
		int x,y;
		/*
		Scanner in = new Scanner(System.in);
		if(turn == 1)
			System.out.println("Enter the position for black dice");
		else
			System.out.println("Enter the position for white dice");
		
			
			for(int i = 0; i < 8; i++)
			{
				for(int j = 0 ; j < 8 ; j++)
				{
					if(gameBoard[i][j] == 2)
					{
						System.out.println("i = "+ i + " j= "+ j);
					}
				}
			}
		
		//x = in.nextInt();
		//y = in.nextInt();
		*/
		ai.Main(ai);
		//System.out.println(x+y);
		x = AIOthello.xInput;
		y = AIOthello.yInput;
		turn = ai.Pturn;
		insertPosition(x,y,turn,gameBoard, ai);
		
		
		//in.close();
	}
	
	void insertPosition(int x , int y , int turn ,int [][] gameBoard, AIOthello ai)
	{
		if(turn == 1)
		{
			if((x >=0 && x < 8) && (y >=0 && y < 8) && gameBoard[x][y] == 2)
			{
				gameBoard[x][y] = 1;
				//left top diagonal
				int i = x-1;
				int j = y-1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 0)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 1)
						{
							flag = 1;
							break;
						}
						i1--;
						j1--;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 1)
						{
							gameBoard[i][j] = 1;
							i--;
							j--;
						}
					}
				}
				//top
				i = x-1;
				j = y;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 0)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 1)
						{
							flag = 1;
							break;
						}
						i1--;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 1)
						{
							gameBoard[i][j] = 1;
							i--;
						}
					}
				}
				//top right diagonal
				i = x-1;
				j = y+1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 0)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 1)
						{
							flag = 1;
							break;
						}
						i1--;
						j1++;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 1)
						{
							gameBoard[i][j] = 1;
							i--;
							j++;
						}
					}
				}
				//left
				i = x;
				j = y-1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 0)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 1)
						{
							flag = 1;
							break;
						}
						j1--;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 1)
						{
							gameBoard[i][j] = 1;
							j--;
						}
					}
				}
				//right
				i = x;
				j = y+1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 0)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 1)
						{
							flag = 1;
							break;
						}
						j1++;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 1)
						{
							gameBoard[i][j] = 1;
							j++;
						}
					}
				}
				//left buttom diagonal
				i = x+1;
				j = y-1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 0)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 1)
						{
							flag = 1;
							break;
						}
						i1++;
						j1--;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 1)
						{
							gameBoard[i][j] = 1;
							i++;
							j--;
						}
					}
				}
				//down
				i = x+1;
				j = y;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 0)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 1)
						{
							flag = 1;
							break;
						}
						i1++;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 1)
						{
							gameBoard[i][j] = 1;
							i++;
						}
					}
				}
				//right buttom diagonal
				i = x+1;
				j = y+1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 0)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 1)
						{
							flag = 1;
							break;
						}
						i1++;
						j1++;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 1)
						{
							gameBoard[i][j] = 1;
							i++;
							j++;
						}
					}
				}
				
			}
			else
			{
				System.out.println("Invalid input enter again");
				getUserInput(ai, turn);
			}
		}
		else
		{
			if((x >=0 && x < 8) && (y >=0 && y < 8) && gameBoard[x][y] == 2)
			{
				gameBoard[x][y] = 0;
				//left top diagonal
				int i = x-1;
				int j = y-1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 1)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 0)
						{
							flag = 1;
							break;
						}
						i1--;
						j1--;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 0)
						{
							gameBoard[i][j] = 0;
							i--;
							j--;
						}
					}
				}
				//top
				i = x-1;
				j = y;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 1)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 0)
						{
							flag = 1;
							break;
						}
						i1--;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 0)
						{
							gameBoard[i][j] = 0;
							i--;
						}
					}
				}
				//top right diagonal
				i = x-1;
				j = y+1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 1)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 0)
						{
							flag = 1;
							break;
						}
						i1--;
						j1++;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 0)
						{
							gameBoard[i][j] = 0;
							i--;
							j++;
						}
					}
				}
				//left
				i = x;
				j = y-1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 1)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 0)
						{
							flag = 1;
							break;
						}
						j1--;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 0)
						{
							gameBoard[i][j] = 0;
							j--;
						}
					}
				}
				//right
				i = x;
				j = y+1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 1)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 0)
						{
							flag = 1;
							break;
						}
						j1++;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 0)
						{
							gameBoard[i][j] = 0;
							j++;
						}
					}
				}
				//left buttom diagonal
				i = x+1;
				j = y-1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 1)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 0)
						{
							flag = 1;
							break;
						}
						i1++;
						j1--;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 0)
						{
							gameBoard[i][j] = 0;
							i++;
							j--;
						}
					}
				}
				//down
				i = x+1;
				j = y;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 1)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 0)
						{
							flag = 1;
							break;
						}
						i1++;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 0)
						{
							gameBoard[i][j] = 0;
							i++;
						}
					}
				}
				//right buttom diagonal
				i = x+1;
				j = y+1;
				if((i >=0 && i < 8) && (j >=0 && j < 8) && gameBoard[i][j] == 1)
				{
					int flag = 0;
					int i1 = i;
					int j1 = j;
					while((i1 >=0 && i1 < 8) && (j1 >=0 && j1 < 8))
					{
						if(gameBoard[i1][j1] == 9 || gameBoard[i1][j1] == 2)
						{
							break;
						}
						if(gameBoard[i1][j1] == 0)
						{
							flag = 1;
							break;
						}
						i1++;
						j1++;
					}
					if(flag == 1)
					{
						while(gameBoard[i][j] != 0)
						{
							gameBoard[i][j] = 0;
							i++;
							j++;
						}
					}
				}
				
			}
			else
			{
				System.out.println("Invalid input enter again");
				getUserInput(ai,turn);
			}
		}
	}
	
	int countScore()
	{
		int black = 0;
		int white = 0;
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
		System.out.println("SCORES: \n" + "white = "+ white + "      black = "+ black);
		if(black == 0 || white == 0)
			return 1;
		return 0;
	}
	
	
	int countScore1(int gameBoard[][])
	{
		int black = 0;
		int white = 0;
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
		if(black == 0 || white == 0)
			return 1;
		return 0;
	}
	
	int checkEnd()
	{
		for(int i = 0 ; i < 8 ; i++)
		{
			for(int j = 0 ; j < 8 ; j++)
			{
				if(gameBoard[i][j] == 2 || gameBoard[i][j] == 9)
					return 0;
			}
		}
		return 1;
	}
	
	int checkEnd1(int gameBoard[][])
	{
		for(int i = 0 ; i < 8 ; i++)
		{
			for(int j = 0 ; j < 8 ; j++)
			{
				if(gameBoard[i][j] == 2 || gameBoard[i][j] == 9)
					return 0;
			}
		}
		return 1;
	}
	
	void winner()
	{
		int white = 0;
		int black = 0;
		for(int i = 0; i < 8 ; i++)
		{
			for(int j = 0 ; j < 8 ; j++)
			{
				if(gameBoard[i][j] == 1)
					black++;
				if(gameBoard[i][j] == 0)
					white++;
			}
		}
		if(black == white)
			System.out.println("Match is draw");
		else if(black > white)
			System.out.println("Black wins");
		else
			System.out.println("White wins");
	}
	
	/*int countSuggestion()
	{
		int count = 0;
		for(int i = 0 ; i < 8 ; i++)
		{
			for(int j =0 ; j < 8 ; j++)
			{
				if(gameBoard[i][j] == 2)
					count++;
			}
		}
		if(count == 0)
			return 1;
		return 0;
	}*/
	public static void main(String args[]) {
		AIOthello ai = new AIOthello();
	
		//System.out.println("enter the choice \n 1. Human vs. Human : 1 \n 2. Human vs. Computer : 2 \n");
		
		int choice = ai.Pturn;//x.nextInt();
		Scanner x = new Scanner(System.in);
		System.out.print(choice);
		
		if(choice == 1)
		{
			Front f1 = new Front();
			//f1.print();
			ai.enableKey();
			int turn = 1;
			int t = 1;
			while(true)
			{
				if(f1.checkEnd() == 1)
					break;
				if(f1.countScore() == 1)
					break;
				Suggestion s1 = new Suggestion();
				f1.gameBoard = s1.getSuggestion(f1.gameBoard , turn);
				f1.print();
				if(s1.countSuggestion(f1.gameBoard) == 0)
				{
					f1.getUserInput(ai,turn);
					t = -t;
					if(t == -1)
						turn = 0;
					else
						turn = 1;
				}
				else
				{
					System.out.println(turn + " dont have move");
					t = -t;
					if(t == -1)
						turn = 0;
					else
						turn = 1;
					f1.gameBoard = s1.getSuggestion(f1.gameBoard , turn);
					f1.print();
					f1.getUserInput(ai,turn);
					t = -t;
					if(t == -1)
						turn = 0;
					else
						turn = 1;
				
				}
				f1.clearSuggestion(f1.gameBoard);
			}
			int get = f1.countScore();
			f1.print();
			f1.winner();
		}//choice 1 closed
		else if(choice == 2)
		{
			Front f1 = new Front();
			f1.print();
			
			int turn = 1;
			int t = 1;
			while(true)
			{
				if(f1.checkEnd() == 1)
					break;
				if(f1.countScore() == 1)
					break;
				Suggestion s1 = new Suggestion();
				f1.gameBoard = s1.getSuggestion(f1.gameBoard , turn);
				f1.print();
				if(s1.countSuggestion(f1.gameBoard) == 0)
				{
					//minimax function call to print utility values
					Minimax m1 = new Minimax();
					if(turn == 0)
					{
					 int val =  m1.minimax(f1.gameBoard,0,true,9 , Integer.MIN_VALUE , Integer.MAX_VALUE,ai);
					}
					if(turn ==1)
					f1.getUserInput(ai,turn);
					t = -t;
					if(t == -1)
						turn = 0;
					else
						turn = 1;
				}
				else
				{
					System.out.println(turn + " dont have move");
					t = -t;
					if(t == -1)
						turn = 0;
					else
						turn = 1;
					f1.gameBoard = s1.getSuggestion(f1.gameBoard , turn);
					f1.print();
					//minimax function call to print utility values
					Minimax m1 = new Minimax();
					if(turn ==0)
					{
					int val = m1.minimax(f1.gameBoard,0 , true , 9, Integer.MIN_VALUE , Integer.MAX_VALUE,ai);
					}
					if(turn == 1)
					f1.getUserInput(ai, turn);
					t = -t;
					if(t == -1)
						turn = 0;
					else
						turn = 1;
				
				}
				f1.clearSuggestion(f1.gameBoard);
			}
			int get = f1.countScore();
			f1.print();
			f1.winner();
		}//choice 2 closed
		else
		{
				
		}
		
	}
}
