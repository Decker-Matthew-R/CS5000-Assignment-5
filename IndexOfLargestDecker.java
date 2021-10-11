import java.util.Scanner;

public class IndexOfLargestDecker 
{
		//Find Index Method
		public static int findIndex (int[] numbers)
		{
			//Declare Variables
			int largest = numbers[0];
			int indexOfMax = 0;
			
			//For loop to return smallest index of largest element
			for (int i = 1; i < numbers.length; i++)
			{
				if (numbers[i] > largest) 
				{
					largest = numbers[i];
					indexOfMax = i;
				}
			}
			return indexOfMax;
		}


	//Main Method
	public static void main (String[] args)
	{
	
		{
		//code to enter user input into an array
		Scanner input = new Scanner(System.in);
		String answer = "";

	do
	{
		do
		{
		//Call Method FindIndexDecker
		//Declare Variable
		//Prompt user to enter input into array and store array values
		int[] numbers = new int[10];
		System.out.print("Enter " + numbers.length + " integer values:  ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		System.out.print("You entered these values: ");
		for (int i = 0; i < numbers.length; i++)
			{
				System.out.print(numbers[i] + " " );
			}
		//Space in code
		System.out.println("");
		//Run Method findIndex to obtain the index
		System.out.println("Index of the largest:  " + "\t" + "  " + findIndex(numbers));
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
}

