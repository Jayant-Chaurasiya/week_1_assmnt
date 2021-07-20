package eggproblem;

import java.util.Scanner;

public class Egg {
	static int numOfEggs;
	static int gross;
	static int dozens;
	static int left;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Egg Calculation");
		System.out.println("Please enter Your Number of eggs :");
		numOfEggs=sc.nextInt();
		
		
		if(numOfEggs%144>=0)
		{
			gross=numOfEggs/144;
			left=numOfEggs%144;
			if(left/12!=0)
			{
				dozens=left/12;
				left=left%12;
			}
			System.out.println("Your number of egg is : "+gross +" gross "+ dozens + " dozens " +left+" only. ");
		}
		else if(numOfEggs<0)
		{
			System.out.println("Please give invalid number");
			System.exit(0);
			
		}
		
		
		
	}

}
