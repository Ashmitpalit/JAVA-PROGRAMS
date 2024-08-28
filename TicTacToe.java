import java.util.*;
class TicTacToe
{
	char a[][];
	String player1,player2;
	Scanner sc;
	TicTacToe()
	{
		sc=new Scanner(System.in);
		a=new char[3][3];
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++) 
			{
				a[i][j]=' ';
			}
		}
		System.out.print("Enter player 1's name: ");
		player1=sc.nextLine();
		System.out.print("Enter player 2's name: ");
		player2=sc.nextLine();
	}
	
	void displayBoard()
	{
		for (int i=0;i<3 ;i++ ) 
		{
			for (int j=0;j<3 ;j++ ) 
			{
				if(j<2)
					System.out.print(a[i][j]+"|");
				else
					System.out.print(a[i][j]);
			}
			System.out.println();
			if(i<2)
				System.out.println("------");
		}
	}

	boolean colWise(int col,char item)
	{
		return a[0][col]==item && a[1][col]==item && a[2][col]==item;
	}
	
	boolean rowWise(int row,char item)
	{
		return a[row][0]==item && a[row][1]==item && a[row][2]==item;
	}
	
	boolean rightDiagonal(char item)
	{
		return a[0][2]==item && a[1][1]==item && a[2][0]==item;
	}
	
	boolean leftDiagonal(char item)
	{
		return a[0][0]==item && a[1][1]==item && a[2][2]==item;	
	}

	boolean isCellFilled(int x,int y)
	{
		return a[x][y]=='X'||a[x][y]=='O';
	}

	boolean isWinningConditionSatisfied(int x,int y,char item)
	{
		if(rowWise(x,item) || colWise(y,item)||leftDiagonal(item)||rightDiagonal(item))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean isCorrectIndex(int x,int y)
	{
		return (x>=0 && x<3) && (y>=0 && y<3);
	}
	void gamePlay()
	{
		int winningStatus=2; //default draw is selected (0 - player 1 won, 1 - player 2, 2 -draw)
		int c=0,x,y;
		do
		{
			if(c%2==0)
			{
				System.out.println(player1+"'s turn");
			}
			else
			{
				System.out.println(player2+"'s turn");	
			}
			System.out.println("Enter location of board:");
			x=sc.nextInt();
			y=sc.nextInt();
			if (!isCorrectIndex(x,y))
			{
				System.out.println("Please enter valid index.");
				continue;
			}
			if (isCellFilled(x,y)) 
			{
				System.out.println("This cell is already filled, please choose some other cell.");
				continue;
			}
			if (c%2==0) 
			{
				a[x][y]='X';
				displayBoard();
				if(isWinningConditionSatisfied(x,y,'X'))
				{
					winningStatus=0;
					break;
				}
			}
			else
			{
				a[x][y]='O';
				displayBoard();
				if(isWinningConditionSatisfied(x,y,'O'))
				{
					winningStatus=1;
					break;
				}
			}
			c++;
		}while(c<=8); 

		if (winningStatus==0) 
		{
			System.out.println(player1+" won!");
		}
		else if(winningStatus==1)
		{
			System.out.println(player2+" won!");
		}
		else
		{
			System.out.println("The match is a draw!");
		}

	}

	public static void main(String[] args)
	{
		TicTacToe tt=new TicTacToe();
		tt.gamePlay();
	}
}