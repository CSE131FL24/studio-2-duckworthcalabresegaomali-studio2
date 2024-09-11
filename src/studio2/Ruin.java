package studio2;

import java.util.Scanner;

public class Ruin 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);  // Create a Scanner object

		//variables
		double startAmt;
		double winChance;
		double winLimit;
		double randoNum;
		int days;
		double origAmt;


		//read in user input
		System.out.println("How much money u got?");
		startAmt = sc.nextDouble();
		origAmt=startAmt;
		System.out.println("What r the odds u win?");
		winChance = sc.nextDouble();
		System.out.println("how much money u want?");
		winLimit = sc.nextDouble();
		System.out.println("just how addicted to gambling are you?? (days wise)");
		days = sc.nextInt();
		

		for (int i=0; i < days; i++)
		{
			int pPD=0; 
			System.out.println(i + " spent gambling");
			while (startAmt>0 && startAmt < winLimit)
			{
				randoNum = Math.random();
				if(randoNum < winChance)
				{
					startAmt++;
					pPD++;
					
				}
				else
				{
					startAmt--;
					pPD++;


				}
			}
			
			if(startAmt >= winLimit)
			{
				System.out.println("Win!");
				startAmt = origAmt;
				
			}
			else
			{
				System.out.println("Ruin!");
				startAmt = origAmt;

			}


		}


		

	}

}
