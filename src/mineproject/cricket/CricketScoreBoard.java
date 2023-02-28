
package mineproject.cricket;

public class CricketScoreBoard {
	

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int four=4;
			int six=6;
			int a=4;
			//int out=0;
			//int playerTenOut=0;
		
			int scoreFirstOver=14;
			int scoreSecondOver=6;
			int scoreThirdOver=12;
			int scoreFourthOver=10;
			int scoreFivthOver=6;
			int scoreSixthOver=6;
			int scoreSeventhOver=12;
			int scoreEighthOver=6;
			int scoreNinthOver=6;
			int scoreTenthOver=18;
			int totalScore=scoreFirstOver+scoreSecondOver+scoreThirdOver+scoreFourthOver+scoreFivthOver+ scoreSixthOver+scoreSeventhOver+scoreEighthOver+scoreNinthOver+scoreTenthOver;
			System.out.println("total score in 10 overs=" +totalScore);
	for(int i=1;i<=10;i++)
	{
		//System.out.println("over no:" +i);
		for(int j=1;j<=6;j++)
		{
			//System.out.println("ball no:"+j);
			
			while(six==6 && i==2 && j==4)
			{
				System.out.println("the player has hit six in second over fourth ball");
				break;
			}
			 if(four==4 && i==3 && j==5)
			{
				System.out.println("the player has hit four in thiord over fifth ball");
			
			}
			if(a==3)
			{
				System.out.println("the player has hit three runs");
			}	
				
				else if(a==2)
				{
					System.out.println("the player has hit 2 runs");
				}
				else if(a==1)
				{
					System.out.println("the player has hit 1 runs");
				}
				else if(a==0)
				{
					System.out.println("the player has made zero runs");
				}
		/*	if(out==0)
			{
			System.out.println("The player is out");
			continue;
			
			
			}
		if(playerTenOut==0)
		{
			System.out.println("10th player is out");
			break;
		}*/
		}
	}
		}
	}




