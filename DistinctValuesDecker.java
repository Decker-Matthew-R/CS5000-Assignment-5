//Import Scanner Utility
import java.util.Scanner;

public class DistinctValuesDecker 
{
	//Method to remove duplicates and return a single dimensional array
	public static int[] getValues(int[] numbers)
	{
		int newArray = numbers.length;
		
		for (int i = 0; i < newArray; i++)
		{
			for (int j = i + 1; j < newArray; j++)
			{
				if(numbers[i] == numbers[j])
				{
					int dropDuplicates = j;
					for (int p = j + 1; p < newArray; p++, dropDuplicates++)
					{
						numbers[dropDuplicates] = numbers [p];
		
					}
					newArray--;
					j--;
				}
			}
		}
		int[] finalArray = new int[newArray];
		for (int i = 0; i < newArray; i++)
		{
			finalArray[i] = numbers[i];
			
		}
		return finalArray;
	}
	public static void main (String[] args)
	{
	
		{
			
		}
		//code to enter user input into an array
		Scanner input = new Scanner(System.in);
		String answer = "";
		
		
		do
		{
			do
			{
			//Call Method getValues
			//Declare Variable
			//Prompt user to enter input into array and store array values
			int[] numbers = new int[10];
			System.out.print("Enter " + numbers.length + " integer values:  ");
			for (int i = 0; i < numbers.length; i++)
				numbers[i] = input.nextInt();
			System.out.print("Array Before Processing:  ");
			for (int i = 0; i < numbers.length; i++)
				{
					System.out.print(numbers[i] + " " );
				}
			
			//Space in code
			System.out.println("");
			//Run Method getValues to remove duplicates from array
			System.out.print("Array After Processing:   ");
			for (int num: getValues(numbers))
				System.out.print(num + " ");
			System.out.println("");
			// Prompt User to Retry
			
			System.out.print("Retry (Y/N): ");
			input.nextLine();
			answer = input.nextLine();
			}


			while (!answer .equals("N"));
		}
		while (!answer .equals("N"));
			System.out.println("Program Terminated");

	}
}
	