package change;

import java.util.Scanner;

public class GetChange
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input an integer between 1 and 99, for how much change you want");
		int number = scanner.nextInt();
		change(number);
		
	}
	/**The user will input an amount of cents that they would like to receive.Then the method
	 *  will divide it by 25 to see how many quarters it will need and then take the remainder 
	 *  divided by 10 to get dimes. it will continue this process through pennies and then print
	 *  out the amount of each coin returned.
	 * @param number
	 * @return
	 */
	
	 public static int change(int number)
	{
		int startingAmount, quarters, dimes, nickels, pennies;
		startingAmount = number;
		
		quarters = startingAmount / 25;
		number = number % 25;
		dimes = number / 10;
		number = number % 10;
		nickels = number / 5;
		number = number % 5;
		pennies = number / 1;	
		
		if (startingAmount <= 99 && startingAmount >= 1)
		{
			if (quarters !=0) {
				System.out.println(quarters + " quarters");
			}
			if (dimes!=0) {
				System.out.println(dimes + " dimes");
			}
			if (nickels !=0) {
				System.out.println(nickels + " nickels");
			}
			if (pennies !=0) {
				System.out.println(pennies + " pennies");
			}
		}
		else 
		{
			System.out.println("not a valid number");
		}
		return  (quarters + dimes + nickels + pennies);
	}
	
}


