package com.jda.utility;

import java.util.Scanner;

/**
 * @author atul
 *
 */
public class Utility {
	Scanner scanner;

	/**
	 *this constructor is for initializing scanner class
	 */
	public Utility() {
		scanner = new Scanner(System.in);
	}

	/**
	 * function to take user input as string
	 * @return  input
	 * input return to ReplaceString class
	 */
	public String inputString() {
		return scanner.next();
		
	}
	
	/**
	 * function to take user input as integer
	 * @return input  goes  to flipcoin class
	 */
	public int inputInteger() {
		int  input = scanner.nextInt();
		return input;
	}

	/**
	 * replaceString function replaces the given input string part to user input.
	 * @param template is given input passing to replaceString function
	 * @param name is user input by which we want to replace <<UserName>>
	 * @return
	 */
	public String replaceString(String template, String name) {
	  template = template.replace("<<UserName>>",name);
		return template;
	}
	
	public void flipcoin(int number)
	{
		int noOfHeads = 0;
		
		int noOfTails = 0;
		int noOftoss = number;
		
		for (int i = 0; i < number; i++)
		{
			double random = Math.random();
			System.out.println(random);
			if (random < 0.5)
			{
				noOfTails++;
			}
			else
			{
				 noOfHeads++;
			}
			
		}
		System.out.println("no of heads = "+ noOfHeads);
		System.out.println("no of tails = " + noOfTails);
		System.out.println("percentage of head = "+ (double)(noOfHeads*100)/noOftoss) ;
		System.out.println("percentage of head = "+ (double)(noOfTails*100)/noOftoss) ;
		
	}

}