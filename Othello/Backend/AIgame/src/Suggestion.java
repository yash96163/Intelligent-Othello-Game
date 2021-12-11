//Suggestions will be getting from this class methods
public class Suggestion
{
	
	
	
	int countSuggestion(int gameBoard[][])
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
	}

	public int [][] getSuggestion(int B[][] , int turn)//return array with suggestions
	{
		int search = 0;//intial move is for black , it will help in finding appropriate suggestion position near white
		if(turn == 0)//if turn is of white 
			search = 1;//move is for white , it will help in finding appropriate suggestion position near black
			
		
		for(int i = 0 ; i< 8 ; i++)//rows of game board
		{
			for(int j = 0 ; j < 8 ; j++) // column of game boared
			{
				if(B[i][j] == search)//it check weather to find the suggestion for white or black move
				{
					//for i-1, j-1 top left diagonal
					if((i-1 >= 0 && i-1 < 8) &&(j-1 >= 0 && j-1 < 8))
					{
						if(B[i-1][j-1]== 9)//if the position is 9 then only it can be choosen for suggestion
						{
							if(check(i-1 , j-1 , B, turn))//we check if the position contains correct suggestion position means there is opposition die is there or not
							{
								B[i-1][j-1] = 2;
							}
						}
					}
					//for i-1 , j
					if((i-1 >= 0 && i-1 < 8) &&(j >= 0 && j < 8))
					{
						if(B[i-1][j]== 9)
						{
							if(check(i-1 , j, B,turn))
							{
								B[i-1][j] = 2;
							}
						}
					}
					// for i-1, j+1
					if((i-1 >= 0 && i-1 < 8) &&(j+1 >= 0 && j+1 < 8))
					{
						if(B[i-1][j+1]== 9)
						{
							if(check(i-1 , j+1, B,turn))
							{
								B[i-1][j+1] = 2;
							}
						}
					}
					
					//for i , j-1
					if((i >= 0 && i < 8) &&(j-1 >= 0 && j-1 < 8))
					{
						if(B[i][j-1]== 9)
						{
							if(check(i, j-1, B,turn))
							{
								B[i][j-1] = 2;
							}
						}
					}
					// for i , j+1
					if((i >= 0 && i < 8) &&(j+1 >= 0 && j+1 < 8))
					{
						if(B[i][j+1]== 9)
						{
							if(check(i , j+1, B,turn))
							{
								B[i][j+1] = 2;
							}
						}
					}
					//for i+1 , j-1
					if((i+1 >= 0 && i+1 < 8) &&(j-1 >= 0 && j-1 < 8))
					{
						if(B[i+1][j-1]== 9)
						{
							if(check(i+1 , j-1, B,turn))
							{
								B[i+1][j-1] = 2;
							}
						}
					}
					//for i+1 , j
					if((i+1 >= 0 && i+1 < 8) &&(j >= 0 && j < 8))
					{
						if(B[i+1][j]== 9)
						{
							if(check(i+1 , j, B,turn))
							{
								B[i+1][j] = 2;
							}
						}
					}
					//for i+1 , j+1
					if((i+1 >= 0 && i+1 < 8) &&(j+1 >= 0 && j+1 < 8))
					{
						if(B[i+1][j+1]== 9)
						{
							if(check(i+1 , j+1, B,turn))
							{
								B[i+1][j+1] = 2;
							}
						}
					}
				}
			}//for loop for column ends i.e. j loop
		}//for loop for rows ends i.e i loop
		//printnew(B);
		return B;
	}//get suggestion function ends
	
	/*void printnew(int[][] arr) {
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println("");
		}
	}*/
	boolean check( int l , int m , int arr[][], int turn)
	{
		int white = 0;
		int black = 1;
		if(turn == 0)
		{
			int temp = white;
			white = black;
			black = temp;
		}
		int i = l-1;
		int j = m-1;
		int countZero = 0;
		while(i >=0 && j >= 0) {
			if(arr[i][j] == 9)
				break;
			if(arr[i][j] == 2)
				break;
			if(arr[i][j] == white)
				countZero++;
			if(arr[i][j] == black && countZero != 0)
			{
				return true;
			}
			if(arr[i][j] == black && countZero == 0)
				break;
			i--;
			j--;
		}
		
		
		i = l+1;
		j = m+1;
		countZero = 0;
		while(i < 8 && j < 8) {
			if(arr[i][j] == 9)
				break;
			if(arr[i][j] == 2)
				break;
			if(arr[i][j] == white)
				countZero++;
			if(arr[i][j] == black && countZero != 0)
			{
				return true;
			}
			if(arr[i][j] == black && countZero == 0)
				break;
			i++;
			j++;
		}
		
		
		
		i = l-1;
		j = m+1;
		countZero = 0;
		while(i >= 0 && j < 8) {
			if(arr[i][j] == 9)
				break;
			if(arr[i][j] == 2)
				break;
			if(arr[i][j] == white)
				countZero++;
			if(arr[i][j] == black && countZero != 0)
			{
				return true;
			}
			if(arr[i][j] == black && countZero == 0)
				break;
			i--;
			j++;
		}
		
		
		
		i = l+1;
		j = m-1;
		countZero = 0;
		while(j >= 0 && i < 8) {
			if(arr[i][j] == 9)
				break;
			if(arr[i][j] == 2)
				break;
			if(arr[i][j] == white)
				countZero++;
			if(arr[i][j] == black && countZero != 0)
			{
				return true;
			}
			if(arr[i][j] == black && countZero == 0)
				break;
			j--;
			i++;
		}
		
		
		i = l-1;
		j = m;
		countZero = 0;
		while(i >= 0) {
			if(arr[i][j] == 9)
				break;
			if(arr[i][j] == 2)
				break;
			if(arr[i][j] == white)
				countZero++;
			if(arr[i][j] == black && countZero != 0)
			{
				return true;
			}
			if(arr[i][j] == black && countZero == 0)
				break;
			i--;
		}
		
		
		i = l+1;
		j = m;
		countZero = 0;
		while(i < 8) {
			if(arr[i][j] == 9)
				break;
			if(arr[i][j] == 2)
				break;
			if(arr[i][j] == white)
				countZero++;
			if(arr[i][j] == black && countZero != 0)
			{
				return true;
			}
			if(arr[i][j] == black && countZero == 0)
				break;
			i++;
		}
		
		
		j = m-1;
		i = l;
		countZero = 0;
		while(j >= 0) {
			if(arr[i][j] == 9)
				break;
			if(arr[i][j] == 2)
				break;
			if(arr[i][j] == white)
				countZero++;
			if(arr[i][j] == black && countZero != 0)
			{
				return true;
			}
			if(arr[i][j] == black && countZero == 0)
				break;
			j--;
		}
		
		
		j = m+1;
		i = l;
		countZero = 0;
		while(j < 8) {
			if(arr[i][j] == 9)
				break;
			if(arr[i][j] == 2)
				break;
			if(arr[i][j] == white)
				countZero++;
			if(arr[i][j] == black && countZero != 0)
			{
				return true;
			}
			if(arr[i][j] == black && countZero == 0)
				break;
			j++;
		}
		
		return false;
	}
	
}
